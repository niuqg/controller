package org.opendaylight.controller.web;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.opendaylight.controller.sal.utils.ServiceHelper;
import org.opendaylight.controller.usermanager.IUserManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import edu.ustc.qos.dao.switchDataDao;
import edu.ustc.qos.databasemanager.Idatabasemanager;
import edu.ustc.qos.databasemanager.Logger;
import edu.ustc.qos.databasemanager.ResultPair;
import edu.ustc.qos.databasemanager.Status;
import edu.ustc.qos.databasemanager.SwitchData;
import edu.ustc.qos.databasemanager.User;

@Controller
@RequestMapping("/")
public class QosWeb
{
    String username,password;
    boolean loginStatus=false;
    Idatabasemanager databasemanager;
    User user;
    ResultPair re;
    List<User> users;
    Gson gson=new Gson();
    String info="a";

    @RequestMapping(value="qos")
    public String QoS(Model model, final HttpServletRequest request,final HttpServletResponse response) {
    return "qoslogin";
    }

    @RequestMapping(value="qoslogin")
    public String QoSlogin(Model model, final HttpServletRequest request,
            final HttpServletResponse response)
    {
        System.out.println("验证开始");
        HttpSession session=request.getSession();
        System.out.println("ccc\n\n\n");
        username=request.getParameter("username");
        password=request.getParameter("password");
        System.out.println(username+password);
        loginStatus=Validate(username,password,session);
        System.out.println("验证结束");
        if(loginStatus==true)
        {
            request.setAttribute("switch1to2", info);
            return "qosmain";
        }
        else
        {
            return "error";
        }
    }
    protected boolean Validate(String username,String password,HttpSession session)
    {
        databasemanager=(Idatabasemanager)ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        System.out.println(username+"  "+password);
        try{
            re=databasemanager.getUser(username);
            System.out.println(re.object);
            if(re.status.equals(Status.SUCCESS))//获取用户获成功
            {
                user=(User)re.object;
                System.out.println("aaa"+re.status+"******\n\n");
                System.out.println(username+(User)re.object+"I am in validate");
            }
            else
            {
                System.out.println(re.status);//获取用户失败
                return false;
            }
        }
        catch(Exception e){
            System.out.println("bbb"+user.getUserID());
        }
        if(user.getUserPassword().equals(password)){
            session.setAttribute("user", user);
            return true;
        }
        else{
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/useradmin")
    public String UserAdmin(Model model, final HttpServletRequest request,
            final HttpServletResponse response)
    {
        List<User> normal=new ArrayList<User>();
        if(user.getUserLevelID()==1)
        {//是管理员,把用户列表放到users中
            users=(List<User>)(databasemanager.getUsers().object);
            String l=gson.toJson(users);
            l=l.replace('\"', '\'');
            request.setAttribute("userlist", l);
            return "qosuser_spadmin";
        }
        else
        {
            if(user.getUserLevelID()==2){
                users=(List<User>)(databasemanager.getUsers().object);
                String l=gson.toJson(users);
                l=l.replace('\"', '\'');
                request.setAttribute("userlist", l);
                return "qosuser_noradmin";
            }
            else{
                normal.add(user);
                String l=gson.toJson(normal);
                l=l.replace('\"', '\'');
                System.out.println(l);
                request.setAttribute("userlist", l);
                return "qosuser_guest";
            }
        }
    }

    @RequestMapping(value="/adduser")
    public String AddUser(Model model, final HttpServletRequest request,
            final HttpServletResponse response)
    {
        String addusername=request.getParameter("username");
        String addpassword=request.getParameter("password1");
        int adduserLevelID=Integer.parseInt(request.getParameter("userLevelID"));
        String adddescription=request.getParameter("description");
        System.out.println(adddescription);
        User adduser=new User(addusername,addpassword,adduserLevelID);
        adduser.setUserDescription(adddescription);
        databasemanager=(Idatabasemanager)ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        Status state=databasemanager.addUser(adduser);
        if(state.equals(Status.SUCCESS))//增加用户成功
        {
            adduser.setUserDescription(adddescription);
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加用户成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            users=(List<User>)(databasemanager.getUsers().object);
            String l=gson.toJson(users);
            l=l.replace('\"', '\'');
            request.setAttribute("userlist", l);
            return "qosuser_admin";
        }
        else
        {
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加用户失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }
    @RequestMapping(value="/deleteuser")
    public String deleteUser(Model model, final HttpServletRequest request,
            final HttpServletResponse response)
    {
        List<User> deleteuser=new ArrayList<User>();
        String choose=request.getParameter("choose");
        System.out.println("choose:"+choose);
        String b[]=choose.split(",");
        int deletelevel=Integer.parseInt(b[3]);
        int deleteID=Integer.parseInt(b[1]);
        System.out.println("b[0]:"+b[0]);
        databasemanager=(Idatabasemanager)ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        User delete =new User(b[0],b[2],deletelevel);
        delete.setUserID(deleteID);
        System.out.println("deleteuser:"+b[0]+" "+b[2]+" "+deletelevel+" "+deleteID);
        deleteuser.add(delete);
        System.out.println(delete);
        Status state=databasemanager.deleteUsers(deleteuser);
        if(state.equals(Status.SUCCESS))//删除用户成功
        {
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除用户成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            users=(List<User>)(databasemanager.getUsers().object);
            String l=gson.toJson(users);
            l=l.replace('\"', '\'');
            request.setAttribute("userlist", l);
            return "qosuser_admin";
        }
        else
        {
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除用户失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value="/moduser")
    public String modeUser(Model model, final HttpServletRequest request,
            final HttpServletResponse response)
    {
        String userInfo=request.getParameter("deleteInfo");
        System.out.println(userInfo);
        String b[]=userInfo.split(",");
        String password=request.getParameter("password1");
        String userLevelID=request.getParameter("userLevelID");
        System.out.println("改后userLevelID:"+userLevelID);
        int modID=Integer.parseInt(userLevelID);
        String description=request.getParameter("description");
        System.out.println(password);
        User mod =new User(b[0],password,modID);
        int userID=Integer.parseInt(b[1]);
        mod.setUserID(userID);
        mod.setUserDescription(description);
        System.out.println(mod);
        databasemanager=(Idatabasemanager)ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        Status state=databasemanager.setUser(mod);
        if(state==Status.SUCCESS){
            if(mod.getUserID()==user.getUserID()){
                HttpSession session=request.getSession();
                session.setAttribute("user", mod);
            }
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改用户成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            users=(List<User>)(databasemanager.getUsers().object);
            String l=gson.toJson(users);
            l=l.replace('\"', '\'');
            request.setAttribute("userlist", l);
            return "qosuser_admin";
        }
        else{
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改用户失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value="/modnormaluser")
    public String modnormaluser(Model model, final HttpServletRequest request,
            final HttpServletResponse response)
    {
        List<User> normal=new ArrayList<User>();
        String userInfo=request.getParameter("deleteInfo");
        System.out.println(userInfo);
        String b[]=userInfo.split(",");
        String password=request.getParameter("password1");
        String userLevelID=b[3];
        int modID=Integer.parseInt(userLevelID);
        String description=request.getParameter("description");
        System.out.println(password);
        int deletelevel=Integer.parseInt(b[3]);
        User mod =new User(b[0],password,modID);
        mod.setUserDescription(description);
        int userID=Integer.parseInt(b[1]);
        mod.setUserID(userID);
        System.out.println(mod);
        databasemanager=(Idatabasemanager)ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        Status state=databasemanager.setUser(mod);
        if(state==Status.SUCCESS){
            re=databasemanager.getUser(username);
            user=(User) re.object;
            HttpSession session=request.getSession();
            session.setAttribute("user", user);
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改用户成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            normal.add(user);
            String l=gson.toJson(normal);
            l=l.replace('\"', '\'');
            System.out.println(l);
            if(user.getUserLevelID()==2){
                users=(List<User>)(databasemanager.getUsers().object);
                String u=gson.toJson(users);
                u=u.replace('\"', '\'');
                request.setAttribute("userlist", u);
                return "qosuser_operator";
            }
            else{
                request.setAttribute("userlist", l);
                return "qosuser_normal";
            }

        }
        else{
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改用户失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value="topo_view")
    public String topo_view(Model model, final HttpServletRequest request,
            final HttpServletResponse response) throws Exception
    {
        return "qosmain";
    }

    @RequestMapping(value="GetSpeed")
    public void GetSpeed(final HttpServletResponse response) throws Exception{
        switchDataDao sdd=new switchDataDao();
        databasemanager=(Idatabasemanager)ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        SwitchData one1=sdd.getLast((long)1, (short)2);
        System.out.println(one1);
        SwitchData one2=sdd.getLast((long)1, (short)3);
        System.out.println(one1);
        SwitchData one3=sdd.getLast((long)1, (short)4);
        System.out.println(one1);
        SwitchData two1=sdd.getLast((long)2, (short)2);
        SwitchData two2=sdd.getLast((long)2, (short)1);
        SwitchData three1=sdd.getLast((long)3, (short)4);
        SwitchData three2=sdd.getLast((long)3, (short)3);
        SwitchData three3=sdd.getLast((long)3, (short)5);
        SwitchData four1=sdd.getLast((long)4, (short)1);
        SwitchData four2=sdd.getLast((long)4, (short)2);
        SwitchData five1=sdd.getLast((long)5, (short)3);
        SwitchData five2=sdd.getLast((long)5, (short)4);
        SwitchData six1=sdd.getLast((long)6, (short)2);
        SwitchData six2=sdd.getLast((long)6, (short)3);
        List<SwitchData> speed=new ArrayList<SwitchData>();
        speed.add(one1);
        speed.add(one2);
        speed.add(one3);
        speed.add(two1);
        speed.add(two2);
        speed.add(three1);
        speed.add(three2);
        speed.add(three3);
        speed.add(four1);
        speed.add(four2);
        speed.add(five1);
        speed.add(five2);
        speed.add(six1);
        speed.add(six2);
        String l=gson.toJson(speed);
        PrintWriter out = response.getWriter();
        out.write(l);
      //  System.out.println(l);
    }

    @RequestMapping(value="/qos_logout")
    public String qos_logout(Model model, final HttpServletRequest request,
            final HttpServletResponse response)
    {
        HttpSession session=request.getSession();
        session.removeAttribute("user");
        String username = request.getUserPrincipal().getName();
        IUserManager userManager = (IUserManager) ServiceHelper
                .getGlobalInstance(IUserManager.class, this);
        if (userManager == null) {
            return "User Manager is not available";
        }
        model.addAttribute("username", username);
        model.addAttribute("role", userManager.getUserLevel(username)
                .toNumber());
        return "forward:" + "/";
    }
}
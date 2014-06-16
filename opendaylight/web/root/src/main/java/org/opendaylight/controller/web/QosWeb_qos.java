package org.opendaylight.controller.web;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.opendaylight.controller.sal.utils.ServiceHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import edu.ustc.qos.databasemanager.AppGroup;
import edu.ustc.qos.databasemanager.AppQos;
import edu.ustc.qos.databasemanager.HostGroup;
import edu.ustc.qos.databasemanager.HostQos;
import edu.ustc.qos.databasemanager.Idatabasemanager;
import edu.ustc.qos.databasemanager.Logger;
import edu.ustc.qos.databasemanager.ResultPair;
import edu.ustc.qos.databasemanager.Status;
import edu.ustc.qos.databasemanager.User;

@Controller
@RequestMapping("/")
public class QosWeb_qos {
    User user;
    Idatabasemanager databasemanager;
    ResultPair re = new ResultPair();
    ResultPair re1 = new ResultPair();
    List<HostQos> hostqoslist;
    List<HostGroup> grouplist;
    List<AppQos> appqoslist;
    List<AppGroup> appgrouplist;
    Gson gson=new Gson();

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "qoshost")
    public String qoshost(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        String hglist,hlist;
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re = databasemanager.getHostQos();
        re1 = databasemanager.getHostGroups();
        if(re.status!=Status.SUCCESS||re1.status!=Status.SUCCESS){
            System.out.println("getHostQos状态："+re.status);
            System.out.println("getHostGroups状态："+re1.status);
            return "qoserror";
        }
        System.out.println("host_list:" + re.status + re.object + "\n\n");
        System.out.println("host_list:" + re1.status + re1.object + "\n\n");
        try {
            hostqoslist = (List<HostQos>) re.object;
            grouplist = (List<HostGroup>) re1.object;
            System.out.println("hostqoslist:"+hostqoslist);
        } catch (Exception e) {
            System.out.println("error");
        }
        System.out.println(user + " " + user.getUserLevelID());
        hlist=gson.toJson(hostqoslist);
        hglist=gson.toJson(grouplist);
        hglist=hglist.replace('\"', '\'');
        hlist=hlist.replace('\"', '\'');
        if (user.getUserLevelID() == 1) {
            request.setAttribute("hostlist", hlist);
            request.setAttribute("grouplist", hglist);
            System.out.println(hlist+"\n\n"+hglist);
            return "qoshost_admin";
        } else {
            request.setAttribute("hostlist", hlist);
            request.setAttribute("grouplist", hglist);
            return "qoshost";
        }
    }

    public String GetHostQos(){
        String hlist;
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re = databasemanager.getHostQos();
        if(re.status!=Status.SUCCESS){
            System.out.println("getHostQos状态："+re.status);
            return "qoserror";
        }
        try {
            hostqoslist = (List<HostQos>) re.object;
            System.out.println("hostqoslist:"+hostqoslist);
        } catch (Exception e) {
            System.out.println("error");
            return "qoserror";
        }
        hlist=gson.toJson(hostqoslist);
        hlist=hlist.replace('\"', '\'');
        return hlist;
    }

    public String GetHostQosGroups(){
        String hglist;
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re1 = databasemanager.getHostGroups();
        if(re1.status!=Status.SUCCESS){
            System.out.println("getHostGroups状态："+re1.status);
            return "qoserror";
        }
        try {
            grouplist = (List<HostGroup>) re1.object;
        } catch (Exception e) {
            System.out.println("error");
            return "qoserror";
        }
        System.out.println(user + " " + user.getUserLevelID());
        hglist=gson.toJson(grouplist);
        hglist=hglist.replace('\"', '\'');
        return hglist;
    }
    @RequestMapping(value = "qosapp")
    public String qosapp(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String aglist="",alist="";
        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        System.out.println(user + " " + user.getUserLevelID());
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re = databasemanager.getAppQos();
        re1 = databasemanager.getAppGroups();
        if (re.status != Status.SUCCESS) {
            return "qoserror";
        }
        try {
            appgrouplist = (List<AppGroup>) re1.object;
            appqoslist = (List<AppQos>) re.object;
            /*添加部分*/
            aglist=gson.toJson(appgrouplist);
            alist=gson.toJson(appqoslist);
            aglist=aglist.replace('\"', '\'');
            alist=alist.replace('\"', '\'');
            /*添加部分*/
        } catch (Exception e) {
            System.out.println("error");
        }
        if (user.getUserLevelID() == 1) {
            /*添加部分*/
            System.out.println(aglist+"\n\n"+alist);
            request.setAttribute("appgrouplist", aglist);
            request.setAttribute("appqoslist", alist);
            /*添加部分*/
            System.out.println(hostqoslist);
            return "qosapp_admin";
        } else {
            /*添加部分*/
            request.setAttribute("appgrouplist", aglist);
            request.setAttribute("appqoslist", alist);
            /*添加部分*/
            return "qosapp";
        }
    }

    public String GetAppQos(){
        String alist="";
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re = databasemanager.getAppQos();
        if (re.status != Status.SUCCESS) {
            return "qoserror";
        }
        try {
            appqoslist = (List<AppQos>) re.object;
            alist=gson.toJson(appqoslist);
            alist=alist.replace('\"', '\'');
        } catch (Exception e) {
            System.out.println("error");
            return "qoserror";
        }
       return alist;
    }
    public String GetAppQosGroups(){
        String aglist="";
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re1 = databasemanager.getAppGroups();
        if (re1.status != Status.SUCCESS) {
            return "qoserror";
        }
        try {
            appgrouplist = (List<AppGroup>) re1.object;
            aglist=gson.toJson(appgrouplist);
            aglist=aglist.replace('\"', '\'');
        } catch (Exception e) {
            System.out.println("error");
            return "qoserror";
        }
       return aglist;
    }

    @RequestMapping(value = "/addhostgroup")
    public String AddHostQosGroup(Model model,
            final HttpServletRequest request, final HttpServletResponse response) {
        int bandwidth, delay, packetLoss;
        int priority = Integer.parseInt(request.getParameter("priority"));
        String bd = request.getParameter("bandwidth");
        if (bd == "") {
            bandwidth = 0;
        } else {
            bandwidth = Integer.parseInt(bd);
        }
        String de = request.getParameter("delay");
        if (de == "") {
            delay = 0;
        } else {
            delay = Integer.parseInt(de);
        }
        String pl = request.getParameter("packetLoss");
        if (pl == "") {
            packetLoss = 0;
        } else {
            packetLoss = Integer.parseInt(pl);
        }
        HostGroup hg = new HostGroup();
        hg.setPriority(priority);
        hg.setDelay(delay);
        hg.setBandwidth(bandwidth);
        hg.setPacketLoss(packetLoss);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state = databasemanager.addHostGroup(hg);
        if (state == Status.SUCCESS) {
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加主机分组成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System.out.println("增加host_qos_group失败,reason:" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加主机分组失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value="/validategroup")
    public void validadteGroup(Model model,
            final HttpServletRequest request, final HttpServletResponse response) throws IOException{
        System.out.println("validate start!!");
        response.setContentType("text/html");
        String priority=request.getParameter("priority").toString();
        String bandwidth=request.getParameter("bandwidth").toString();
        if(priority.equals("1")&&bandwidth.equals("1"))
        {
            response.getWriter().write("false");
        }
        else{
            response.getWriter().write("true");
        }
    }

    @RequestMapping(value = "/deletehostgroup")
    public String deleteHostGroup(Model model,
            final HttpServletRequest request, final HttpServletResponse response) {
        String groupInfo = request.getParameter("deletegroup");
        String info[] = groupInfo.split(",");
        int groupId = Integer.parseInt(info[0]);
        HostGroup hg = new HostGroup();
        hg.setHostGroupID(groupId);
        List<HostGroup> list = new ArrayList<HostGroup>();
        list.add(hg);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state = databasemanager.deleteHostGroups(list);
        if (state == Status.SUCCESS) {
            System.out.println("删除host_qos_group成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除host_qos_group成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System.out.println("删除host_qos_group失败,reason:" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除host_qos_group失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value="/cascadegroup")
    public void CascadeGroup(Model model,
            final HttpServletRequest request, final HttpServletResponse response) throws IOException{
        String groupInfo = request.getParameter("deletegroup");
        String info[] = groupInfo.split(",");
        int groupId = Integer.parseInt(info[0]);
        HostGroup hg = new HostGroup();
        hg.setHostGroupID(groupId);
        List<HostGroup> list = new ArrayList<HostGroup>();
        list.add(hg);//调用接口isexitcascade 然后返回。
    }

    @RequestMapping(value = "/modhostgroup")
    public String modHostGroup(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        int bandwidth, delay, packetLoss;
        String groupInfo = request.getParameter("groupInfo");
        String info[] = groupInfo.split(",");
        System.out.println(groupInfo);
        int groupId = Integer.parseInt(info[0]);
        System.out.println(groupId);
        int priority = Integer.parseInt(request.getParameter("priority"));
        String bd = request.getParameter("bandwidth");
        if (bd == "") {
            bandwidth = 0;
        } else {
            bandwidth = Integer.parseInt(bd);
        }
        String de = request.getParameter("delay");
        if (de == "") {
            delay = 0;
        } else {
            delay = Integer.parseInt(de);
        }
        String pl = request.getParameter("packetLoss");
        if (pl == "") {
            packetLoss = 0;
        } else {
            packetLoss = Integer.parseInt(pl);
        }
        HostGroup hg = new HostGroup();
        hg.setPriority(priority);
        hg.setDelay(delay);
        hg.setBandwidth(bandwidth);
        hg.setPacketLoss(packetLoss);
        hg.setHostGroupID(groupId);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state = databasemanager.setHostGroup(hg);
        if (state == Status.SUCCESS) {
            System.out.println("修改host_qos_group成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改host_qos_group成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System.out.println("修改host_qos_group失败,reason:" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改host_qos_group失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "addqos")
    public String addqos(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String qosname = request.getParameter("qosname");
        String macaddr = request.getParameter("macaddr");
        String ipaddr = request.getParameter("ipaddr");
        /*String u = request.getParameter("userid");
        int userid = Integer.parseInt(u);*/
        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        int userid=user.getUserID();
        String g = request.getParameter("groupid");
        int groupid = Integer.parseInt(g);
        HostQos h = new HostQos();
        h.setQosName(qosname);
        h.setHostMac(macaddr);
        h.setHostIP(ipaddr);
        h.setUserID(userid);
        h.setGroupID(groupid);
        user = (User) session.getAttribute("user");
        if (user.getUserLevelID() == 1) {
            h.setAuditTag(1);
        } else {
            h.setAuditTag(0);
        }
        System.out.println(h + "\n\n\n");
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state = databasemanager.addHostQos(h);
        if (state == Status.SUCCESS) {
            System.out.println("增加主机QOS成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加主机QOS成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            if (user.getUserLevelID() == 1) {
                return "qoshost_admin";
            }
            else {
                return "qoshost";
            }
        } else {
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加主机QOS失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "deleteqos")
    public String deleteqos(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String qosinfo = request.getParameter("choosenqosinfomation");
        String info[] = qosinfo.split(",");
        int qosid = Integer.parseInt(info[0]);
        HostQos hq = new HostQos();
        hq.setHostQosID(qosid);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state = databasemanager.deleteHostQos(hq);
        if (state == Status.SUCCESS) {
            System.out.println("删除主机QOS成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除主机QOS成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除主机QOS失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "modqos")
    public String modqos(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String qosinfo = request.getParameter("choosenqos");
        String hostip = request.getParameter("ipaddr");
        String hostmac = request.getParameter("macaddr");
        String info[] = qosinfo.split(",");
        int qosid = Integer.parseInt(info[0]);
        HostQos hq = new HostQos();
        hq.setHostQosID(qosid);
        String qosname = request.getParameter("qosname");
        String g = request.getParameter("groupid");
        int qroupid = Integer.parseInt(g);
        hq.setQosName(qosname);
        hq.setGroupID(qroupid);
        hq.setHostMac(hostmac);
        hq.setHostIP(hostip);
        int userid = Integer.parseInt(info[4]);
        hq.setUserID(userid);
        if(user.getUserLevelID()!=1){
            hq.setUserID(userid);
        }
        hq.setAuditTag(1);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state = databasemanager.setHostQos(hq);
        if (state == Status.SUCCESS) {
            System.out.println("修改主机QOS成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改主机QOS成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System.out.println(state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改主机QOS失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "addappqos")
    public String addappqos(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String qosname = request.getParameter("qosname");
        String protocolname = request.getParameter("protocolname");
        String p = request.getParameter("portid");
        int portid = Integer.parseInt(p);
       /* String u = request.getParameter("userid");
        int userid = Integer.parseInt(u);*/
        int userid=user.getUserID();
        String g = request.getParameter("groupid");
        int groupid = Integer.parseInt(g);
        AppQos app = new AppQos();
        app.setQosName(qosname);
        app.setProtocolName(protocolname);
        app.setPortID(portid);
        app.setUserID(userid);
        app.setGroupID(groupid);
        if (user.getUserLevelID() == 1) {
            app.setAuditTag(1);
        } else {
            app.setAuditTag(0);
        }
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state = databasemanager.addAppQos(app);
        if (state == Status.SUCCESS) {
            System.out.println("增加appQOS成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加主机QOS成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String qoslist=GetAppQos();
            String qosgrouplist=GetAppQosGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("appgrouplist", qosgrouplist);
            request.setAttribute("appqoslist", qoslist);
            if (user.getUserLevelID() == 1) {
                return "qosapp_admin";
            }
            else {
                return "qosapp";
            }
        } else {
            System.out.println("增加appQOS失败" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加主机QOS失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "addappgroup")
    public String addappgroup(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
 //       String g = request.getParameter("groupid");
  //      int groupid = Integer.parseInt(g);
        String b = request.getParameter("bandwidth");
        int bandwidth = Integer.parseInt(b);
        AppGroup group = new AppGroup();
     //   group.setGroupId(groupid);
        group.setBandwidth(bandwidth);
      databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
              Idatabasemanager.class, this);
        Status state = databasemanager.addAppGroup(group);
        if (state == Status.SUCCESS) {
            System.out.println("增加app分组成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加app分组成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String qoslist=GetAppQos();
            String qosgrouplist=GetAppQosGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("appgrouplist", qosgrouplist);
            request.setAttribute("appqoslist", qoslist);
            return "qosapp_admin";
        } else {
            System.out.println("增加app分组失败" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加app分组失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "deleteappqos")
    public String deleteappqos(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String qosID = request.getParameter("qosID");
        int appQosID = Integer.parseInt(qosID);
        AppQos delete=new AppQos();
        delete.setAppQosID(appQosID);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        Status state =databasemanager.deleteAppQos(delete);
        if (state == Status.SUCCESS) {
            System.out.println("删除app qos成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除app qos成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String qoslist=GetAppQos();
            String qosgrouplist=GetAppQosGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("appgrouplist", qosgrouplist);
            request.setAttribute("appqoslist", qoslist);
            return "qosapp_admin";
        } else {
            System.out.println("删除app qos失败" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除app qos失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "deleteappgroup")
    public String deleteappgroup(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String group = request.getParameter("groupinfo");
        int groupid = Integer.parseInt(group);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        Status state =databasemanager.deleteAppGroups(groupid);
        if (state == Status.SUCCESS) {
            System.out.println("删除app 分组成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除app 分组成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String qoslist=GetAppQos();
            String qosgrouplist=GetAppQosGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("appgrouplist", qosgrouplist);
            request.setAttribute("appqoslist", qoslist);
            return "qosapp_admin";
        } else {
            System.out.println("删除app 分组失败" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除app 分组失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "modappqos")
    public String modappqos(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String appinfo = request.getParameter("appqosidnum");
        int appid = Integer.parseInt(appinfo);
        String qosname = request.getParameter("qosname");
        String protocolname = request.getParameter("protocolname");
        String pid = request.getParameter("portid");
        int portid= Integer.parseInt(pid);
        String id = request.getParameter("userid");
        int userid=Integer.parseInt(id);
        String gid = request.getParameter("groupid");
        int groupid=Integer.parseInt(gid);
        AppQos aq=new AppQos();
        aq.setAppQosID(appid);
        aq.setQosName(qosname);
        aq.setProtocolName(protocolname);
        aq.setPortID(portid);
        aq.setUserID(userid);
        aq.setGroupID(groupid);
        aq.setAuditTag(1);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        Status state =databasemanager.setAppQos(aq);
        if (state == Status.SUCCESS) {
            System.out.println("修改app qos成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改app qos成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String qoslist=GetAppQos();
            String qosgrouplist=GetAppQosGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("appgrouplist", qosgrouplist);
            request.setAttribute("appqoslist", qoslist);
            return "qosapp_admin";
        } else {
            System.out.println("修改app qos失败" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改app qos失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "modappgroup")
    public String modappgroup(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String groupinfo = request.getParameter("appgroupIDnum");
        System.out.println(groupinfo);
        int groupid = Integer.parseInt(groupinfo);
        String bw=request.getParameter("bandwidth");
        System.out.println(bw);
        int bandwidth= Integer.parseInt(bw);
        AppGroup ag=new AppGroup();
        ag.setGroupId(groupid);
        ag.setBandwidth(bandwidth);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(Idatabasemanager.class, this);
        Status state =databasemanager.setAppGroup(ag);
        if (state == Status.SUCCESS) {
            System.out.println("修改app 分组成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改app 分组成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String qoslist=GetAppQos();
            String qosgrouplist=GetAppQosGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("appgrouplist", qosgrouplist);
            request.setAttribute("appqoslist", qoslist);
            return "qosapp_admin";
        } else {
            System.out.println("修改app 分组失败" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("修改app 分组失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "auditapp")
    public String auditapp(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String checkinfo[] = request.getParameterValues("audit");
        int check[]=new int[checkinfo.length];
        for(int i=0;i<checkinfo.length;i++){
            check[i]=Integer.parseInt(checkinfo[i]);
        }
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state =databasemanager.auditAppQos(check, 1);
        if (state == Status.SUCCESS) {
            System.out.println("审核APP QOS成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("审核APP QOS成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String qoslist=GetAppQos();
            String qosgrouplist=GetAppQosGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("appgrouplist", qosgrouplist);
            request.setAttribute("appqoslist", qoslist);
            return "qosapp_admin";
        } else {
            System.out.println("审核APP QOS失败" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("审核APP QOS失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "audithost")
    public String audithost(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String checkinfo[] = request.getParameterValues("hostaudit");
        int check[]=new int[checkinfo.length];
        for(int i=0;i<checkinfo.length;i++){
            check[i]=Integer.parseInt(checkinfo[i]);
            System.out.println("check length*****"+check[i]);
        }
        System.out.println(check.length);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state =databasemanager.auditHostQos(check, 1);
        if (state == Status.SUCCESS) {
            System.out.println("审核host 分组成功");
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("审核host 分组成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System.out.println("审核host 分组失败" + state);
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("审核host 分组失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

}

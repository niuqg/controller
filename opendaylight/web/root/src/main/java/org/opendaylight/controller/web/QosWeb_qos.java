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

import edu.ustc.qos.dao.AQ_Group_Dao;
import edu.ustc.qos.dao.App_Qos_Dao;
import edu.ustc.qos.dao.HQ_Group_Dao;
import edu.ustc.qos.dao.Host_QoS_Dao;
import edu.ustc.qos.dao.LoggerDao;
import edu.ustc.qos.databasemanager.Host_QoS;
import edu.ustc.qos.databasemanager.App_QoS;
import edu.ustc.qos.databasemanager.HQ_Group;
import edu.ustc.qos.databasemanager.System_Logger;
import edu.ustc.qos.databasemanager.User;
import edu.ustc.qos.databasemanager.AQ_Group;
@Controller
@RequestMapping("/")
public class QosWeb_qos {
    User user;
    Host_QoS_Dao hqDao=new Host_QoS_Dao();
    HQ_Group_Dao hqgDao = new HQ_Group_Dao();
    App_Qos_Dao aqDao = new App_Qos_Dao();
    AQ_Group_Dao aqgDao= new AQ_Group_Dao();
    LoggerDao logDao = new LoggerDao();
    List<Host_QoS> hostqoslist;
    List<HQ_Group> grouplist;
    List<App_QoS> App_QoSlist;
    List<AQ_Group> AQ_Grouplist;
    System_Logger log =new System_Logger();
    Gson gson=new Gson();

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "qoshost")
    public String qoshost(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        String hglist,hlist;
        try {
            hostqoslist = hqDao.getHQList();
            grouplist = hqgDao.getHQGList();
            if(hostqoslist==null||grouplist==null){
                return "qoserror";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        hlist=gson.toJson(hostqoslist);
        hglist=gson.toJson(grouplist);
        hglist=hglist.replace('\"', '\'');
        hlist=hlist.replace('\"', '\'');
        if (user.getRole_ID() == 1) {
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

        try {
            hostqoslist = hqDao.getHQList();
            if(hostqoslist==null){
                return "qoserror";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "qoserror";
        }
        hlist=gson.toJson(hostqoslist);
        hlist=hlist.replace('\"', '\'');
        return hlist;
    }

    public String GetHostQosGroups(){
        String hglist;
        try {
            grouplist = hqgDao.getHQGList();
            if(grouplist==null){
                return "qoserror";
            }
        } catch (Exception e) {
        	e.printStackTrace();
            return "qoserror";
        }
        System.out.println(user + " " + user.getRole_ID());
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

        try {
            AQ_Grouplist = aqgDao.getAQGList();
            App_QoSlist = aqDao.getAQList();
            if (AQ_Grouplist==null||App_QoSlist==null) {
                return "qoserror";
            }
            /*添加部分*/
            aglist=gson.toJson(AQ_Grouplist);
            alist=gson.toJson(App_QoSlist);
            aglist=aglist.replace('\"', '\'');
            alist=alist.replace('\"', '\'');
            /*添加部分*/
        } catch (Exception e) {
            System.out.println("error");
        }
        if (user.getRole_ID() == 1) {
            /*添加部分*/
            request.setAttribute("AQ_Grouplist", aglist);
            request.setAttribute("App_QoSlist", alist);
            /*添加部分*/
            return "qosapp_admin";
        } else {
            /*添加部分*/
            request.setAttribute("AQ_Grouplist", aglist);
            request.setAttribute("App_QoSlist", alist);
            /*添加部分*/
            return "qosapp";
        }
    }

    public String GetApp_QoS(){
        String alist="";

        try {
            App_QoSlist = aqDao.getAQList();
            if (App_QoSlist==null) {
                return "qoserror";
            }
            alist=gson.toJson(App_QoSlist);
            alist=alist.replace('\"', '\'');
        } catch (Exception e) {
            e.printStackTrace();
            return "qoserror";
        }
       return alist;
    }
    public String GetApp_QoSGroups(){
        String aglist="";
        try {
            AQ_Grouplist = aqgDao.getAQGList();
            if (AQ_Grouplist==null) {
                return "qoserror";
            }
            aglist=gson.toJson(AQ_Grouplist);
            aglist=aglist.replace('\"', '\'');
        } catch (Exception e) {
            e.printStackTrace();
            return "qoserror";
        }
       return aglist;
    }

    @RequestMapping(value = "/addHQ_Group")
    public String AddHostQosGroup(Model model,
            final HttpServletRequest request, final HttpServletResponse response) {
        int upbandwidth, dbandwidth, packetLoss;
        int priority = Integer.parseInt(request.getParameter("HQ_Priority"));
        String bd = request.getParameter("HQ_Up_Bandwidth");
        if (bd == "") {
        	upbandwidth = -1;
        } else {
        	upbandwidth = Integer.parseInt(bd);
        }
        bd = request.getParameter("HQ_Down_Bandwidth");
        if (bd == "") {
        	dbandwidth = -1;
        } else {
        	dbandwidth = Integer.parseInt(bd);
        }
        HQ_Group hg = new HQ_Group();
        hg.setHQ_Priority(priority);
        hg.setHQ_Down_Bandwidth(dbandwidth);
        hg.setHQ_Up_Bandwidth(upbandwidth);
        int flag=1;
		try {
			flag = hqgDao.addHQG(hg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (flag == 0) {
            System_Logger log =new System_Logger();
            log.setOperation_Description("增加主机分组成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            try {
				logDao.addLog(log);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System_Logger log =new System_Logger();
            log.setOperation_Description("增加主机分组失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            try {
				logDao.addLog(log);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return "qoserror";
        }
    }

    @RequestMapping(value="/validategroup")
    public void validadteGroup(Model model,
            final HttpServletRequest request, final HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        String priority=request.getParameter("HQ_Priority").toString();
        String ubandwidth=request.getParameter("HQ_Up_Bandwidth").toString();
        String dbandwidth=request.getParameter("HQ_Down_Bandwidth").toString();
        if(priority.equals("1")&&ubandwidth.equals("1")&&dbandwidth.equals("1"))
        {
            response.getWriter().write("false");
        }
        else{
            response.getWriter().write("true");
        }
    }

    @RequestMapping(value = "/deleteHQ_Group")
    public String deleteHQ_Group(Model model,
            final HttpServletRequest request, final HttpServletResponse response) {
        String groupInfo = request.getParameter("deletegroup");
        String info[] = groupInfo.split(",");
        int groupId = Integer.parseInt(info[0]);
        int flag =1;
        try {
			flag=hqgDao.deleteUserByID(groupId);
	
        if (flag==0) {
            System_Logger log =new System_Logger();
            log.setOperation_Description("删除host_qos_group成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System_Logger log =new System_Logger();
            log.setOperation_Description("删除host_qos_group失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        	return "qoserror";
		}
    }

    @RequestMapping(value="/cascadegroup")
    public void CascadeGroup(Model model,
            final HttpServletRequest request, final HttpServletResponse response) throws IOException{
        String groupInfo = request.getParameter("deletegroup");
        String info[] = groupInfo.split(",");
        int groupId = Integer.parseInt(info[0]);
        HQ_Group hg = new HQ_Group();
        hg.setHQGroup_ID(groupId);
        List<HQ_Group> list = new ArrayList<HQ_Group>();
        list.add(hg);//调用接口isexitcascade 然后返回。
    }

    @RequestMapping(value = "/modHQ_Group")
    public String modHQ_Group(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        int bandwidth, delay, packetLoss;
        String groupInfo = request.getParameter("groupInfo");
        String info[] = groupInfo.split(",");
        System.out.println(groupInfo);
        int groupId = Integer.parseInt(info[0]);
        System.out.println(groupId);
        int priority = Integer.parseInt(request.getParameter("HQ_Priority"));
        String bd = request.getParameter("HQ_Up_Bandwidth");
        if (bd == "") {
            bandwidth = -1;
        } else {
            bandwidth = Integer.parseInt(bd);
        }
        String de = request.getParameter("HQ_Down_Bandwidth");
        if (de == "") {
            delay = -1;
        } else {
            delay = Integer.parseInt(de);
        }
        HQ_Group hg = new HQ_Group();
        hg.setHQ_Priority(priority);
        hg.setHQ_Up_Bandwidth(bandwidth);
        hg.setHQ_Down_Bandwidth(delay);
        hg.setHQGroup_ID(groupId);
        int flag=1;
        try {
			flag = hqgDao.modHQGByID(groupId, hg);
		
        if (flag==0) {
            System_Logger log =new System_Logger();
            log.setOperation_Description("修改host_qos_group成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System_Logger log =new System_Logger();
            log.setOperation_Description("修改host_qos_group失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "qoserror";
		}
    }

    @RequestMapping(value = "addqos")
    public String addqos(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String qosname = request.getParameter("qosname");
        String macaddr = request.getParameter("macaddr");
        String ipaddr = request.getParameter("ipaddr");

        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        int userid=user.getUser_ID();
        String g = request.getParameter("groupid");
        int groupid = Integer.parseInt(g);
        Host_QoS h = new Host_QoS();
        h.setHQ_Name(qosname);
        h.setHost_MAC(macaddr);
        h.setHost_IP(Integer.parseInt(ipaddr));
        h.setUser_ID(userid);
        h.setHQGroup_ID(groupid);
        user = (User) session.getAttribute("user");
        if (user.getRole_ID() == 1) {
            h.setHQ_State(1);
        } else {
            h.setHQ_State(0);
        }
        int flag = 1;
        try {
			flag=hqDao.addHQoS(h);
		
        if (flag==0) {
            System_Logger log =new System_Logger();
            log.setOperation_Description("增加主机QOS成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            if (user.getRole_ID() == 1) {
                return "qoshost_admin";
            }
            else {
                return "qoshost";
            }
        } else {
            System_Logger log =new System_Logger();
            log.setOperation_Description("增加主机QOS失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
			// TODO Auto-generated catch block
        	e.printStackTrace();
        	return "qoserror";
		}
    }

    @RequestMapping(value = "deleteqos")
    public String deleteqos(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String qosinfo = request.getParameter("choosenqosinfomation");
        String info[] = qosinfo.split(",");
        int qosid = Integer.parseInt(info[0]);
        int flag=1;
        try {
			flag = hqDao.deleteHQoS(qosid);
		
        if (flag==0) {
            System_Logger log =new System_Logger();
            log.setOperation_Description("删除主机QOS成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System_Logger log =new System_Logger();
            log.setOperation_Description("删除主机QOS失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
        Host_QoS hq = new Host_QoS();
        hq.setHQ_ID(qosid);
        String qosname = request.getParameter("qosname");
        String g = request.getParameter("groupid");
        int qroupid = Integer.parseInt(g);
        hq.setHQ_Name(qosname);
        hq.setHQ_ID(qroupid);
        hq.setHost_MAC(hostmac);
        hq.setHost_IP(Integer.parseInt(hostip));
        int userid = Integer.parseInt(info[4]);
        hq.setUser_ID(userid);
        if(user.getRole_ID()!=1){
            hq.setUser_ID(userid);
        }
        hq.setHQ_State(1);
        int flag = 1;
        try {
			flag = hqDao.modHQoS(qosid, hq);
		
        if (flag==0) {
            System_Logger log =new System_Logger();
            log.setOperation_Description("修改主机QOS成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            System_Logger log =new System_Logger();
            log.setOperation_Description("修改主机QOS失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "qoserror";
		}
    }

    @RequestMapping(value = "addApp_QoS")
    public String addApp_QoS(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String qosname = request.getParameter("qosname");
        String protocolname = request.getParameter("protocolname");
        String p = request.getParameter("portid");
        int portid = Integer.parseInt(p);
        int userid=user.getUser_ID();
        String g = request.getParameter("groupid");
        int groupid = Integer.parseInt(g);
        App_QoS app = new App_QoS();
        app.setAQ_Name(qosname);
        app.setProtocol_Name(protocolname);
        app.setPort_ID(portid);
        app.setUser_ID(userid);
        app.setAQGroup_ID(groupid);
        if (user.getRole_ID() == 1) {
            app.setAQ_State(1);
        } else {
            app.setAQ_State(0);
        }
        int flag = 1;
        try {
			flag = aqDao.addUser(app);
		
        if (flag==0) {
            log.setOperation_Description("增加主机QOS成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String qoslist=GetApp_QoS();
            String qosgrouplist=GetApp_QoSGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("AQ_Grouplist", qosgrouplist);
            request.setAttribute("App_QoSlist", qoslist);
            if (user.getRole_ID() == 1) {
                return "qosapp_admin";
            }
            else {
                return "qosapp";
            }
        } else {
            log.setOperation_Description("增加主机QOS失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "qoserror";
		}
    }
    @RequestMapping(value = "addAQ_Group")
    public String addAQ_Group(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String uBandwidth = request.getParameter("AQ_Up_Bandwidth");
        String dBandwidth = request.getParameter("AQ_Down_Bandwidth");
        int bandwidthu = Integer.parseInt(uBandwidth);
        int bandwidthd = Integer.parseInt(dBandwidth);
        AQ_Group group = new AQ_Group();
        group.setAQ_Up_Bandwidth(bandwidthu);
        int flag = 1;
        try {
			flag = aqgDao.addAQGroup(group);
		
        if (flag==0) {
            log.setOperation_Description("增加app分组成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String qoslist=GetApp_QoS();
            String qosgrouplist=GetApp_QoSGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("AQ_Grouplist", qosgrouplist);
            request.setAttribute("App_QoSlist", qoslist);
            return "qosapp_admin";
        } else {
            log.setOperation_Description("增加app分组失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "qoserror";
		}
    }

    @RequestMapping(value = "deleteApp_QoS")
    public String deleteApp_QoS(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String qosID = request.getParameter("qosID");
        int App_QoSID = Integer.parseInt(qosID);
        App_QoS delete=new App_QoS();
        delete.setAQ_ID(App_QoSID);
        int flag = 1;
        try {
			flag = aqDao.deleteUserByID(App_QoSID);
		
        if (flag==0) {
            log.setOperation_Description("删除app qos成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String qoslist=GetApp_QoS();
            String qosgrouplist=GetApp_QoSGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("AQ_Grouplist", qosgrouplist);
            request.setAttribute("App_QoSlist", qoslist);
            return "qosapp_admin";
        } else {
            log.setOperation_Description("删除app qos失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "qoserror";
		}
    }

    @RequestMapping(value = "deleteAQ_Group")
    public String deleteAQ_Group(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String group = request.getParameter("groupinfo");
        int groupid = Integer.parseInt(group);
        int flag = 1;
        try {
			flag = aqgDao.deleteAQGByID(groupid);
		
        if (flag==0) {
            log.setOperation_Description("删除app 分组成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String qoslist=GetApp_QoS();
            String qosgrouplist=GetApp_QoSGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("AQ_Grouplist", qosgrouplist);
            request.setAttribute("App_QoSlist", qoslist);
            return "qosapp_admin";
        } else {
            log.setOperation_Description("删除app 分组失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "qoserror";
		}
    }

    @RequestMapping(value = "modApp_QoS")
    public String modApp_QoS(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String appinfo = request.getParameter("App_QoSidnum");
        int appid = Integer.parseInt(appinfo);
        String qosname = request.getParameter("qosname");
        String protocolname = request.getParameter("protocolname");
        String pid = request.getParameter("portid");
        int portid= Integer.parseInt(pid);
        String id = request.getParameter("userid");
        int userid=Integer.parseInt(id);
        String gid = request.getParameter("groupid");
        int groupid=Integer.parseInt(gid);
        App_QoS aq=new App_QoS();
        aq.setAQ_ID(appid);
        aq.setAQ_Name(qosname);
        aq.setProtocol_Name(protocolname);
        aq.setPort_ID(portid);
        aq.setUser_ID(userid);
        aq.setAQGroup_ID(groupid);
        aq.setAQ_State(1);
        int flag = 1;
        try {
			flag = aqDao.modAQByID(appid, aq);
		
        if (flag == 0) {
            log.setOperation_Description("修改app qos成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String qoslist=GetApp_QoS();
            String qosgrouplist=GetApp_QoSGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("AQ_Grouplist", qosgrouplist);
            request.setAttribute("App_QoSlist", qoslist);
            return "qosapp_admin";
        } else {
            log.setOperation_Description("修改app qos失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "qoserror";
		}
    }

    @RequestMapping(value = "modAQ_Group")
    public String modAQ_Group(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String groupinfo = request.getParameter("AQ_GroupIDnum");
        System.out.println(groupinfo);
        int groupid = Integer.parseInt(groupinfo);
        String bw=request.getParameter("AQ_Up_Bandwidth");
        String dw=request.getParameter("AQ_Down_Bandwidth");
        int bandwidthu= Integer.parseInt(bw);
        int badnwidthd= Integer.parseInt(dw);
        AQ_Group ag=new AQ_Group();
        ag.setAQGroup_ID(groupid);
        ag.setAQ_Up_Bandwidth(bandwidthu);
        ag.setAQ_Down_Bandwidth(badnwidthd);
        int flag=1;
        try {
			flag = aqgDao.modAQGByID(groupid, ag);
		
        if (flag==0) {
            log.setOperation_Description("修改app 分组成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            String qoslist=GetApp_QoS();
            String qosgrouplist=GetApp_QoSGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("AQ_Grouplist", qosgrouplist);
            request.setAttribute("App_QoSlist", qoslist);
            return "qosapp_admin";
        } else {
            log.setOperation_Description("修改app 分组失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "qoserrror";
		}
    }
/*
 * 
 * 注意 未修改！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 */
    @RequestMapping(value = "auditapp")
    public String auditapp(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String checkinfo[] = request.getParameterValues("audit");
        int check[]=new int[checkinfo.length];
        for(int i=0;i<checkinfo.length;i++){
            check[i]=Integer.parseInt(checkinfo[i]);
        } try {
        int flag=1;
        if (flag==0) {
            log.setOperation_Description("审核APP QOS成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
           
				logDao.addLog(log);
			
            String qoslist=GetApp_QoS();
            String qosgrouplist=GetApp_QoSGroups();
            if(qoslist=="qoserror"||qosgrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("AQ_Grouplist", qosgrouplist);
            request.setAttribute("App_QoSlist", qoslist);
            return "qosapp_admin";
        } else {
            log.setOperation_Description("审核APP QOS失败");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
        } try {
        int flag =1;
        if (flag==0) {
            log.setOperation_Description("审核host 分组成功");
            log.setUser_ID(user.getUser_ID());
            log.setUser_Name(user.getUser_Name());
           
				logDao.addLog(log);
			
            String hostqoslist=GetHostQos();
            String hosqosGrouplist=GetHostQosGroups();
            if(hostqoslist=="qoserror"||hosqosGrouplist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("hostlist", hostqoslist);
            request.setAttribute("grouplist", hosqosGrouplist);
            return "qoshost_admin";
        } else {
            log.setOperation_Description("审核host 分组失败");
            log.setUser_Name(user.getUser_Name());
            log.setUser_Name(user.getUser_Name());
            logDao.addLog(log);
            return "qoserror";
        }} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "qoserror";
			}
    }

}

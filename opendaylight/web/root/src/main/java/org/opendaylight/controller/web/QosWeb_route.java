package org.opendaylight.controller.web;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.opendaylight.controller.sal.core.Edge;
import org.opendaylight.controller.sal.core.Property;
import org.opendaylight.controller.sal.utils.ServiceHelper;
import org.opendaylight.controller.switchmanager.ISwitchManager;
import org.opendaylight.controller.topologymanager.ITopologyManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import edu.ustc.qos.dao.hostInfoDao;
import edu.ustc.qos.dao.routePathDao;
import edu.ustc.qos.dao.staticRoutesDao;
import edu.ustc.qos.databasemanager.HostInfo;
import edu.ustc.qos.databasemanager.Idatabasemanager;
import edu.ustc.qos.databasemanager.Logger;
import edu.ustc.qos.databasemanager.ResultPair;
import edu.ustc.qos.databasemanager.RoutePath;
import edu.ustc.qos.databasemanager.StaticRoute;
import edu.ustc.qos.databasemanager.Status;
import edu.ustc.qos.databasemanager.User;

@Controller
@RequestMapping("/")
public class QosWeb_route
{
    User user;
    Idatabasemanager databasemanager;
    ResultPair re = new ResultPair();
    List<StaticRoute> routelist;
    List<RoutePath> nodelist;
    ITopologyManager topologymanager;
    ISwitchManager switchManager;
    String info="1";

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "staticroute_manage")
    public String staticroute_manage(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        Gson gson=new Gson();
        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        int id=user.getUserID();
        System.out.println("id="+id);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re=databasemanager.getStaticRoutes();
        ResultPair re1=databasemanager.getAllPath();
        if(re.status!=Status.SUCCESS||re1.status!=Status.SUCCESS){
            System.out.println("连接失败,reason:"+re.status+" "+re1.status);
            return "qoserror";
        }
        routelist=(List<StaticRoute>) re.object;
        nodelist=(List<RoutePath>)re1.object;
        String l=gson.toJson(routelist);
        l=l.replace('\"', '\'');
        String n=gson.toJson(nodelist);
        n=n.replace('\"', '\'');
        System.out.println("\n\n"+n);
        request.setAttribute("sta_routelist", l);
        request.setAttribute("sta_nodelist", n);
        return "qos_staticroute_manage";

    }

    public String GetStaticRoute(){
        Gson gson=new Gson();
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re=databasemanager.getStaticRoutes();
        if(re.status!=Status.SUCCESS){
            System.out.println("连接失败,reason:"+re.status);
            return "qoserror";
        }
        routelist=(List<StaticRoute>) re.object;
        String l=gson.toJson(routelist);
        l=l.replace('\"', '\'');
        return l;
    }

    public String GetAllPath(){
        Gson gson=new Gson();

        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        ResultPair re1=databasemanager.getAllPath();
        if(re1.status!=Status.SUCCESS){
            System.out.println("连接失败,reason:"+re1.status);
            return "qoserror";
        }
        nodelist=(List<RoutePath>)re1.object;
        String n=gson.toJson(nodelist);
        n=n.replace('\"', '\'');
        return n;
    }

    @RequestMapping(value = "staticroute_config")
    public String staticroute_config(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String temp="",switchname="",portname="",switchaddress="",srcport="",desport="";
        topologymanager=(ITopologyManager) ServiceHelper.getGlobalInstance(
                ITopologyManager.class, this);
        Set<Property> s;
        Map<Edge, Set<Property>> map;
        map=topologymanager.getEdges();
        System.out.println("map"+map);
        if(map.isEmpty()){
            return "qoserror";
        }
        System.out.println(map);
        for(Edge e :map.keySet()){
           s=map.get(e);
           String src=e.toString().substring(9, 32);
           String des=e.toString().substring(42, 65);
           srcport=e.toString().substring(4, 5);
           desport=e.toString().substring(37,38);
           System.out.println(src+"  "+des+"  "+srcport+"  "+desport);
           String info="{'srcaddr':'"+src+"','srcport':'"+srcport+"','desaddr':'"+des+"','desport':'"+desport+"'},";
           System.out.println(info);
           temp+=info;
        }
        temp=temp.substring(0, temp.length()-1);
        temp="["+temp+"]";
        System.out.println(temp);
        request.setAttribute("route_config", temp);
        return "qos_staticroute_config";
    }
    public String GetAllStaticRoute(){
        String temp="",switchname="",portname="",switchaddress="",srcport="",desport="";
        topologymanager=(ITopologyManager) ServiceHelper.getGlobalInstance(
                ITopologyManager.class, this);
        Set<Property> s;
        Map<Edge, Set<Property>> map=topologymanager.getEdges();
        System.out.println(map);
        for(Edge e :map.keySet()){
           s=map.get(e);
           String src=e.toString().substring(9, 32);
           String des=e.toString().substring(42, 65);
           srcport=e.toString().substring(4, 5);
           desport=e.toString().substring(37,38);
           System.out.println(src+"  "+des+"  "+srcport+"  "+desport);
           String info="{'srcaddr':'"+src+"','srcport':'"+srcport+"','desaddr':'"+des+"','desport':'"+desport+"'},";
           System.out.println(info);
           temp+=info;
        }
        temp=temp.substring(0, temp.length()-1);
        temp="["+temp+"]";
        return temp;
    }

    @RequestMapping(value = "audit_static_route")
    public String audit_static_route(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String checkinfo[] = request.getParameterValues("audit_route");
        int check[]=new int[checkinfo.length];
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        for(int i=0;i<checkinfo.length;i++){
            check[i]=Integer.parseInt(checkinfo[i]);
            System.out.println(checkinfo[i]);
        }
        System.out.println(user);
        Status state=databasemanager.auditStaticRoutes(check, 1);
        if(state==Status.SUCCESS){
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("审核静态路由成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String staticroute=GetStaticRoute();
            String allpath=GetAllPath();
            if(staticroute=="qoserror"||allpath=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("sta_routelist",staticroute);
            request.setAttribute("sta_nodelist", allpath);
            return "qos_staticroute_manage";
        }
        else{
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("审核静态路由失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "delete_route")
    public String delete_route(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        String rId = request.getParameter("staticroute");
        int routeId=Integer.parseInt(rId);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        Status state =databasemanager.deleteStaticRoute(routeId);
        if(state==Status.SUCCESS){
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除静态路由成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String staticroute=GetStaticRoute();
            String allpath=GetAllPath();
            if(staticroute=="qoserror"||allpath=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("sta_routelist",staticroute);
            request.setAttribute("sta_nodelist", allpath);
            return "qos_staticroute_manage";
        }
        else{
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("删除静态路由失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "addroute")
    public String addroute(Model model, final HttpServletRequest request,
            final HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        String routepath = request.getParameter("routepath");
        String srcnode = request.getParameter("srcnode");
        HostInfo hi=new HostInfo();
        hostInfoDao hid=new hostInfoDao();
        hi=hid.getHostByName(srcnode);
        srcnode=hi.getHostMac();
        String desnode = request.getParameter("desnode");
        hi=hid.getHostByName(desnode);
        desnode=hi.getHostMac();
        String routename = request.getParameter("routename");
        String id = request.getParameter("userid");
        int userid=Integer.parseInt(id);
        String route[]=routepath.split(",");
        int i=0;
        Status state=Status.SET_STATICROUTE_ERROR;
        Status pathstate=Status.SET_STATICROUTE_ERROR;
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        StaticRoute sr=new StaticRoute();
        sr.setStaticRouteSrc(srcnode);
        sr.setStaticRouteDis(desnode);
        sr.setUserID(userid);
        sr.setName(routename);
        sr.setAuditTag(1);
        state =databasemanager.addStaticRoute(sr);
        if(state==Status.SUCCESS){
            int hop=0;
            ResultPair sp=databasemanager.getStaticRouteSingle(routename);
            sr=(StaticRoute) sp.object;
            int routeid=sr.getStaticRouteID();
            System.out.println("\n\nrouteID:"+routeid);
            List<RoutePath> list= new ArrayList<RoutePath>();
            for(i=0;i<route.length;i++){
                RoutePath rp=new RoutePath();
                long nodeid=Long.valueOf(route[i]).longValue();
                System.out.println(hop);
                hop++;
                rp.setRoutePathID(routeid);
                rp.setNodeAddr(route[i]);
                rp.setNodeType("OF");
                rp.setNodeID(nodeid);
                rp.setHop(hop);
                list.add(rp);
            }
            System.out.println(list);
            pathstate =databasemanager.addPath(list);
        }
        if(state==Status.SUCCESS&&pathstate==Status.SUCCESS){
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加静态路由成功");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            String routelist=GetAllStaticRoute();
            if(routelist=="qoserror"){
                return "qoserror";
            }
            request.setAttribute("route_config", routelist);
            return "qos_staticroute_config";
        }
        else{
            Logger log =new Logger();
            Timestamp timestamp =new Timestamp(System.currentTimeMillis());
            log.setTimestamp(timestamp);
            log.setDescription("增加静态路由失败");
            log.setUserID(user.getUserID());
            log.setUserName(user.getUserName());
            databasemanager.addLogger(log);
            return "qoserror";
        }
    }

    @RequestMapping(value = "modstaticroute")
    public String modstaticroute(Model model, final HttpServletRequest request,
            final HttpServletResponse response) throws Exception {
        String staticrouteid=request.getParameter("staticrouteid");
        String routepath = request.getParameter("routepath");
        String srcnode = request.getParameter("srcnode");
        String desnode = request.getParameter("desnode");
        int routeid=Integer.parseInt(staticrouteid);
        int hop=0;
        List<RoutePath> list= new ArrayList<RoutePath>();
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        ResultPair sp1=databasemanager.getStaticRouteSingle(routeid);
        StaticRoute str=(StaticRoute) sp1.object;
        int userid=str.getUserID();
        staticRoutesDao srDao=new staticRoutesDao();
        routePathDao rpDao=new routePathDao();
        StaticRoute staticRoute =new StaticRoute();
        staticRoute.setUserID(userid);
        String name=str.getName();
        staticRoute.setStaticRouteSrc(srcnode);
        staticRoute.setStaticRouteID(routeid);
        staticRoute.setStaticRouteDis(desnode);
        staticRoute.setName(name);
        if(srDao.modStaticRouteById(routeid, staticRoute)==0){
            return "qoserror";
        }
        String route[]=routepath.split(",");
        for(int i=0;i<route.length;i++){
            RoutePath rp=new RoutePath();
            long nodeid=Long.valueOf(route[i]).longValue();
            System.out.println(hop);
            hop++;
            rp.setRoutePathID(routeid);
            rp.setNodeAddr(route[i]);
            rp.setNodeType("OF");
            rp.setNodeID(nodeid);
            rp.setHop(hop);
            list.add(rp);
        }
        if(rpDao.deleteRoutePath(routeid)==0){
            return "qoserror";
        }
        else {
            if(list!=null){
                Status state=databasemanager.addPath(list);
                HttpSession session = request.getSession();
                user = (User) session.getAttribute("user");
                if(state==Status.SUCCESS){
                    Logger log =new Logger();
                    Timestamp timestamp =new Timestamp(System.currentTimeMillis());
                    log.setTimestamp(timestamp);
                    log.setDescription("修改静态路由成功");
                    log.setUserID(user.getUserID());
                    log.setUserName(user.getUserName());
                    databasemanager.addLogger(log);
                    String temp="",srcport="",desport="";
                    topologymanager=(ITopologyManager) ServiceHelper.getGlobalInstance(
                            ITopologyManager.class, this);
                    Set<Property> s;
                    Map<Edge, Set<Property>> map;
                    map=topologymanager.getEdges();
                    System.out.println("map"+map);
                    if(map.isEmpty()){
                        return "qoserror";
                    }
                    System.out.println(map);
                    for(Edge e :map.keySet()){
                       s=map.get(e);
                       String src=e.toString().substring(9, 32);
                       String des=e.toString().substring(42, 65);
                       srcport=e.toString().substring(4, 5);
                       desport=e.toString().substring(37,38);
                       System.out.println(src+"  "+des+"  "+srcport+"  "+desport);
                       String info="{'srcaddr':'"+src+"','srcport':'"+srcport+"','desaddr':'"+des+"','desport':'"+desport+"'},";
                       System.out.println(info);
                       temp+=info;
                    }
                    temp=temp.substring(0, temp.length()-1);
                    temp="["+temp+"]";
                    System.out.println(temp);
                    request.setAttribute("route_config", temp);
                    return "qos_staticroute_config";
                }
                else{
                    Logger log =new Logger();
                    Timestamp timestamp =new Timestamp(System.currentTimeMillis());
                    log.setTimestamp(timestamp);
                    log.setDescription("修改静态路由失败");
                    log.setUserID(user.getUserID());
                    log.setUserName(user.getUserName());
                    databasemanager.addLogger(log);
                    return "qoserror";
                }
            }
            else{
                return "qoserror";
            }
        }
    }
}


























package org.opendaylight.controller.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.opendaylight.controller.sal.utils.ServiceHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.ustc.qos.databasemanager.HostData;
import edu.ustc.qos.databasemanager.Idatabasemanager;
import edu.ustc.qos.databasemanager.Logger;
import edu.ustc.qos.databasemanager.ResultPair;
import edu.ustc.qos.databasemanager.Status;
import edu.ustc.qos.databasemanager.SwitchData;
import edu.ustc.qos.databasemanager.User;

@Controller
@RequestMapping("/")
public class QosWeb_sys
{
    User user;
    Idatabasemanager databasemanager;
    ResultPair re = new ResultPair();
    List<Logger> loglist;
    Gson gson=new Gson();

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "logger")
    public String qoshost(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {

        HttpSession session = request.getSession();
        user = (User) session.getAttribute("user");
        int id=user.getUserID();
        System.out.println("id="+id);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re=databasemanager.getLogger(id);
        if(re.status!=Status.DATABASE_CON_FAILED){
            loglist=(List<Logger>) re.object;
            System.out.println(loglist+"\n\n\n");
            String l=gson.toJson(loglist);
            System.out.println(l+"\n\n\n");
            l=l.replace('\"', '\'');
            System.out.println(l+"\n\n\n");
            request.setAttribute("loglist", l);
          //  request.setAttribute("loglist", loglist);
            return "qoslog";
        }
        else{
            System.out.println("连接失败,reason:"+re.status);
            return "qoserror";
        }
    }

    public String GetLog(){
        int id=user.getUserID();
        System.out.println("id="+id);
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re=databasemanager.getLogger(id);
        if(re.status!=Status.DATABASE_CON_FAILED){
            loglist=(List<Logger>) re.object;
            System.out.println(loglist+"\n\n\n");
            String l=gson.toJson(loglist);
         //   System.out.println(l+"\n\n\n");
            l=l.replace('\"', '\'');
            return l;
        }
        else{
            System.out.println("连接失败,reason:"+re.status);
            return "qoserror";
        }
    }

    @RequestMapping(value = "perform_statistic")
    public String perform_statistic(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        Gson g=new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        ResultPair re1=databasemanager.getHostData();
        if(re1.status==Status.SUCCESS){
            List<HostData> list=(List<HostData>) re1.object;
            System.out.println("list:"+list+"\n\n");
            String l=g.toJson(list);
            l=l.replace('\"', '\'');
     //       System.out.println("hostdata:"+l+"\n\n\n");
            request.setAttribute("hostlist", l);
            return "qoshost_statistics";
        }
        else{
            if(re1.status==Status.GET_HOSTDATA){
                return "qosnull";
            }
            System.out.println(re1.status);
            return "qoserror";
        }

    }

    @RequestMapping(value = "perform_monitor")
    public String perform_monitor(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        Gson g=new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        re=databasemanager.getSwitchData();
        if(re.status==Status.SUCCESS){
            List<SwitchData> list=(List<SwitchData>) re.object;
            System.out.println(list);
            String l=g.toJson(list);
            l=l.replace('\"', '\'');
        //    System.out.println("switchdata:"+l+"\n\n\n");
            request.setAttribute("switchlist", l);
            return "qosswitch_statistics";
        }
        else{
            if(re.status==Status.GET_SWITCHDATA_ERROR){
                return "qosnull";
            }
            return "qoserror";
        }
    }

    @RequestMapping(value = "deletelog")
    public String deletelog(Model model, final HttpServletRequest request,
            final HttpServletResponse response) {
        int i=0;
        String deleteinfo[] = request.getParameterValues("deletelog");
        int delete[]=new int[deleteinfo.length];
        for(i=0;i<deleteinfo.length;i++){
            delete[i]=Integer.parseInt(deleteinfo[i]);
            System.out.println(delete[i]);
        }
        databasemanager = (Idatabasemanager) ServiceHelper.getGlobalInstance(
                Idatabasemanager.class, this);
        for(i=0;i<deleteinfo.length;i++){
            Status state =databasemanager.deleteLogger(delete[i]);
            if(state!=Status.SUCCESS){
                return "qoserror";
            }
        }
        String log=GetLog();
        if(log=="qoserror"){
            return "qoserror";
        }
        request.setAttribute("loglist", log);
        return "qoslog";
    }
}

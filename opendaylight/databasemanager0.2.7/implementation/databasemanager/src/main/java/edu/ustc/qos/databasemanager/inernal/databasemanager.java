package edu.ustc.qos.databasemanager.inernal;

import java.util.List;

import edu.ustc.qos.dao.appGroupDao;
import edu.ustc.qos.dao.appQosDao;
import edu.ustc.qos.dao.hostDataDao;
import edu.ustc.qos.dao.hostGroupDao;
import edu.ustc.qos.dao.hostQosDao;
import edu.ustc.qos.dao.loggerDao;
import edu.ustc.qos.dao.routePathDao;
import edu.ustc.qos.dao.staticRoutesDao;
import edu.ustc.qos.dao.switchDataDao;
import edu.ustc.qos.dao.userDao;
import edu.ustc.qos.databasemanager.AppGroup;
import edu.ustc.qos.databasemanager.AppQos;
import edu.ustc.qos.databasemanager.HostData;
import edu.ustc.qos.databasemanager.HostGroup;
import edu.ustc.qos.databasemanager.HostQos;
import edu.ustc.qos.databasemanager.Idatabasemanager;
import edu.ustc.qos.databasemanager.Logger;
import edu.ustc.qos.databasemanager.ResultPair;
import edu.ustc.qos.databasemanager.RoutePath;
import edu.ustc.qos.databasemanager.StaticRoute;
import edu.ustc.qos.databasemanager.Status;
import edu.ustc.qos.databasemanager.SwitchData;
import edu.ustc.qos.databasemanager.User;


public class databasemanager implements Idatabasemanager{
    private userDao uDao=new userDao();
    private hostGroupDao hGroupDao=new hostGroupDao();
    private hostQosDao hQosDao=new hostQosDao();
    private staticRoutesDao sRouteDao=new staticRoutesDao();
    private switchDataDao sDataDao=new switchDataDao();
    private appQosDao aQosDao=new appQosDao();
    private appGroupDao aGroupDao=new appGroupDao();
    private loggerDao lDao=new loggerDao();
    private hostDataDao hDataDao = new hostDataDao();
    private routePathDao rPathDao = new routePathDao();
    void init() {
        System.out.println("\n\ninit\n\n");
    }
    void destroy() {
        System.out.println("DESTROY called!");
    }
    void start() {
        System.out.println("START called!");
    }
    void started() {

    }
    void stop() {
        System.out.println("STOP called!");
    }
    @Override
    public Status addUser(User user) {
        try {
            if(uDao.addUser(user)!=0)
                return Status.SUCCESS;
            return Status.ADD_USER_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
    }
    @Override
    public Status deleteUsers(List<User> user) {
        for(User u:user){
            try {
                if(uDao.deleteUserById(u.getUserID())==0)
                    return Status.DELETE_USERS_ERROR;
            } catch (Exception e) {
               return Status.DATABASE_CON_FAILED;
            }
        }
        return Status.SUCCESS;
    }

    @Override
    public ResultPair getUser(int uId) {
        User user;
        ResultPair re=new ResultPair();
        try {
            user = uDao.getUserbyId(uId);
            if(user==null){
                System.out.println("I am in getuser");
                re.status=Status.GET_USER_ERROR;
                return re;}
            re.object=user;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }

    @SuppressWarnings("unused")
    @Override
    public ResultPair getUsers() {
        List<User> list;
        ResultPair re=new ResultPair();
        try {
            list = uDao.getUserList();
            for(User u:list)
                System.out.print(u);
            if(list==null){
                System.out.println("getUsers:list is null");
                re.status=Status.GET_USERS_ERROR;
                return re;}
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.object=list;
        re.status=Status.SUCCESS;
        return re;
    }

    @Override
    public Status setUser(User user) {
        try {
            if(uDao.modUserById(user.getUserID(), user)==0)
                return Status.SET_USER_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public ResultPair getHostGroups() {
        List<HostGroup> list;
        ResultPair re=new ResultPair();
        try {
            list = hGroupDao.getHostGroupList();
            if(list==null){
                re.status=Status.GET_HOSTGROUPS_ERROR;
                return re;
            }
            re.object=list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }

    @Override
    public Status addHostGroup(HostGroup hostGroup) {
        try {
            if(hGroupDao.addHostGroup(hostGroup)==0)
                return Status.ADD_HOSTGROUP_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    @Override
    public Status deleteHostGroups(List<HostGroup> list) {
        for(HostGroup hGroup:list)
            try {
                if(hGroupDao.deleteHostGroupById(hGroup.getHostGroupID())==0){
                    return Status.DELETE_HOSTGROUPS;}
            } catch (Exception e) {
                return Status.DATABASE_CON_FAILED;
            }
        return Status.SUCCESS;
    }

    @Override
    public Status setHostGroup(HostGroup hostGroup) {
        try {
            if(hGroupDao.modHostGroupById(hostGroup.getHostGroupID(), hostGroup)==0)
                return Status.SET_HOSTGROUP_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public ResultPair getHostQos() {
        List<HostQos> list;
        ResultPair re=new ResultPair();
        try {
            list = hQosDao.getHostQosList();
            if(list==null){
                re.status=Status.GET_HOSTQOS_ERROR;
                re.object=null;
                return re;
            }
            re.object=list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }

    @Override
    public Status addHostQos(HostQos hostQos) {
        try {
            if(hQosDao.addHostQos(hostQos)==0)
                return Status.ADD_HOSTQOS_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public Status setHostQos(HostQos hostQos) {
        try {
            if(hQosDao.modHostQosById(hostQos.getHostQosID(), hostQos)==0)
                return Status.SET_HOSTQOS_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public Status deleteHostQos(HostQos hostQos) {
        try {
            if(hQosDao.deleteHostQosById(hostQos.getHostQosID())==0)
                return Status.DELETE_HOSTQOS_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public Status auditHostQos(int[] id,int audit) {
        try{
            if(hQosDao.auditHostQos(id, audit)==0)
                return Status.AUDIT_HOSTQOS_ERROR;
        }catch(Exception e){
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    public ResultPair getAppQos() {
        List<AppQos> list;
        ResultPair re=new ResultPair();
        try {
            list = aQosDao.getAppQosList();
            if(list==null){
                re.status=Status.GET_APPQOS_ERROR;
                re.object=null;
                return re;
            }
            re.object=list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }

    @Override
    public Status addAppQos(AppQos appQos) {
        try {
            if(aQosDao.addAppQos(appQos)==0)
                return Status.ADD_APPQOS_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public Status setAppQos(AppQos appQos) {
        try {
            if(aQosDao.modAppQosById(appQos.getAppQosID(), appQos)==0)
                return Status.SET_APPQOS_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public Status deleteAppQos(AppQos appQos) {
        try {
            if(aQosDao.deleteAppQosById(appQos.getAppQosID())==0)
                return Status.DELETE_APPQOS_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    @Override
    public Status setAppQos(int id,AppQos appQos) {
        try {
            if(aQosDao.modAppQosById(id, appQos)==0)
                return Status.SET_APPQOS_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    @Override
    public ResultPair getAppQosSingle(int id) {
        AppQos app;
        ResultPair re=new ResultPair();
        try {
            app = aQosDao.getAppQos(id);
            if(app==null){
                re.status=Status.GET_APPQOS_ERROR;
                re.object=null;
                return re;
            }
            re.object=app;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }
    @Override
    public Status auditAppQos(int[] id,int audit) {
        try{
            if(aQosDao.auditAppQos(id, audit)==0)
                return Status.AUDIT_APPQOS_ERROR;
        }catch(Exception e){
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public ResultPair getStaticRoutes() {
        List<StaticRoute> list;
        ResultPair re=new ResultPair();
        try {
            list = sRouteDao.getStaticRouteList();
            if(list==null){
                re.status=Status.GET_STATICROUTES_ERROR;
                return re;}
            re.object = list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }

    @Override
    public ResultPair getPath(int routeID) {
        List<RoutePath> list=null;
        ResultPair re=new ResultPair();
        try {
            list=rPathDao.getRouthByID(routeID);
            if(list==null){
                re.status=Status.GET_PATH_ERROR;
                return re;
            }
            re.object=list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }

    @Override
    public Status deleteStaticRoute(int routeID) {
        try {
            if(sRouteDao.deleteStaticRouteById(routeID)==0)
                return Status.DELETE_STATICROUTES_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public Status auditStaticRoutes(int[] id,int audit) {
        for(int i=0;i<id.length;i++)
            try {
                if(sRouteDao.auditStaticRoute(id[i],audit)==0)
                    return Status.AUDIT_STATICROUTES_ERROR;
            } catch (Exception e) {
                return Status.DATABASE_CON_FAILED;
            }
        return Status.SUCCESS;
    }

    @Override
    public Status addStaticRoute(StaticRoute s) {
        try {
            if(sRouteDao.addStaticRoute(s)==0)
            return Status.ADD_STATICROUTE_ERROE;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    @Override
    public ResultPair getSwitchData() {
        List<SwitchData> list=null;
        ResultPair re=new ResultPair();
        try {
            list = sDataDao.getSwitchList();
            if(list==null){
                re.status=Status.GET_SWITCHDATA_ERROR;
                return re;}
            re.object = list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }

    @Override
    public ResultPair getNetEvent() {
        return null;
    }

    @Override
    public ResultPair getHostData() {
        ResultPair re=new ResultPair();
        List<HostData> list=null;
        try {
            list=hDataDao.getHostData();
            if(list==null){
                re.status=Status.GET_HOSTDATA;
                return re;
            }
            re.object=list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }

    @Override
    public Status addLogger(Logger log) {
        try {
            if(lDao.addLogger(log)==0)
                return Status.ADD_LOGGER_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }

    @Override
    public ResultPair getLogger(int userID) {
        ResultPair re=new ResultPair();
        try {
            List<Logger> list=lDao.getLogger(userID);
            if(list==null){
                re.status=Status.GET_LOGGER_ERROR;
                return re;
            }
            re.object=list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        return re;
    }
    public ResultPair getLoggerByID(int id) {
        ResultPair re=new ResultPair();
        try {
            Logger log=lDao.getLogByID(id);
            if(log==null){
                re.status=Status.GET_LOGGER_ERROR;
                return re;
            }
            re.object=log;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        return re;
    }
    @Override
    public ResultPair getUser(String name) {
        ResultPair re=new ResultPair();
        try {
            User user;
            user = uDao.getUserbyname(name);
            System.out.println("I am at getUser $$$$");
            if(user==null){
                re.status=Status.GET_USER_ERROR;
                return re;}
            re.object=user;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }
    public ResultPair getAppGroups() {
        List<AppGroup> list;
        ResultPair re=new ResultPair();
        try {
            list = aGroupDao.getAppGroupList();
            if(list==null){
                re.status=Status.GET_APPGROUPS_ERROR;
                return re;
            }
            re.object=list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }

    @Override
    public Status addAppGroup(AppGroup appGroup) {
        try {
            if(aGroupDao.addAppGroup(appGroup)==0)
                return Status.ADD_APPGROUP_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    @Override
    public Status deleteAppGroups(int i) {
            try {
                if(aGroupDao.deleteAppGroupById(i)==0){
                    return Status.DELETE_APPGROUPS;}
            } catch (Exception e) {
                return Status.DATABASE_CON_FAILED;
            }
        return Status.SUCCESS;
    }
    @Override
    public Status setAppGroup(AppGroup appGroup) {
        try {
            if(aGroupDao.modAppGroupById(appGroup.getGroupId(), appGroup)==0)
                return Status.SET_APPGROUP_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    @Override
    public Status setStaticRoute(int id,StaticRoute s) {
        try {
            if(sRouteDao.modStaticRouteById(id, s)==0)
                return Status.SET_STATICROUTE_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    @Override
    public Status addPath(List<RoutePath> list) {
        for(RoutePath r:list)
            try {
                if(rPathDao.addRoutePath(r)==0)
                    return Status.ADD_ROUTEPATH_ERROR;
            } catch (Exception e) {
                return Status.DATABASE_CON_FAILED;
            }
        return Status.SUCCESS;
    }
    @Override
    public Status deleteLoggerByUserId(int userId) {
        try {
            if(lDao.deleteStaticRouteByID(userId)==0)
                return Status.DELETE_LOGGRE_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    @Override
    public Status deleteLogger(int logID) {
        try {
            if(lDao.deleteStaticRouteByID(logID)==0)
                return Status.DELETE_LOGGRE_ERROR;
        } catch (Exception e) {
            return Status.DATABASE_CON_FAILED;
        }
        return Status.SUCCESS;
    }
    @Override
    public ResultPair getAllPath() {
        List<RoutePath> list=null;
        ResultPair re=new ResultPair();
        try {
            list=rPathDao.getAllPath();
            if(list==null){
                re.status=Status.GET_PATH_ERROR;
                return re;
            }
            re.object=list;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }
    @Override
    public ResultPair getStaticRouteSingle(Object o) {
        ResultPair re=new ResultPair();
        StaticRoute s=null;
        try {
            if(o.getClass().equals(int.class)||o.getClass().equals(Integer.class))
                s=sRouteDao.getStaticRoute((int) o);
            else if(o.getClass().equals(String.class))
                s=sRouteDao.getStaticRoute((String)o);
            if(s==null){
                re.status=Status.GET_STATICROUTES_ERROR;
                return re;
            }
            re.object=s;
        } catch (Exception e) {
            re.status=Status.DATABASE_CON_FAILED;
            return re;
        }
        re.status=Status.SUCCESS;
        return re;
    }
}

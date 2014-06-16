package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Path;

public class PathDao extends BaseDao{

    public PathDao() {
        // TODO Auto-generated constructor stub
    }
    public int addPath(Path path)throws Exception{
        return super.saveOrUpdate("insert into Path(Path_Info) values(?)", path.getPath_Info());
    }
    public int deletePath(int id)throws Exception{
        return super.saveOrUpdate("delete from Path where Path_ID=?", id);
    }
    public int modPath(Path path)throws Exception{
        return super.saveOrUpdate("update Path set Path_Info=? where Path_ID=?", path.getPath_Info(),path.getPath_ID());
    }
    public List<Path> getList()throws Exception{
        return super.executeQuery("select * from Path", Path.class);
    }
}

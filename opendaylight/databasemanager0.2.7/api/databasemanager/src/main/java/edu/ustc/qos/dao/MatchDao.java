package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Match;

public class MatchDao extends BaseDao{

    public MatchDao() {
        // TODO Auto-generated constructor stub
    }
    public int addMatch(Match match)throws Exception{
        return super.saveOrUpdate("insert into Match(Match_Info)values(?)", match.getMatch_Info());
    }
    public int deleteMatch(int id)throws Exception{
        return super.saveOrUpdate("delete from Match where Match_ID", id);
    }
    public int modMatchByID(int id)throws Exception{
        return super.saveOrUpdate("update Match set Match_Info=?", id);
    }
    public List<Match> getMatchList()throws Exception{
        return super.executeQuery("select * from Match", Match.class);
    }
}

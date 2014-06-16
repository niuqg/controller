package edu.ustc.qos.dao;

import java.util.List;

import edu.ustc.qos.databasemanager.BaseDao;
import edu.ustc.qos.databasemanager.Instruction;

public class Instruction_Dao extends BaseDao {

    public Instruction_Dao() {
        // TODO Auto-generated constructor stub
    }
    public int addInstruction(Instruction instr)throws Exception{
        return super.saveOrUpdate("insert Instruction(Instruction_Info) values (?)", instr.getInstruction_Info());
    }
    public int deleteByID(int id)throws Exception{
        return super.saveOrUpdate("delete from Instruction where Instruction_ID=?", id);
    }
    public int modInstrByID(int id,Instruction instr)throws Exception{
        return super.saveOrUpdate("update Instruction set Instruction Info=? where Instruction_ID=?", instr.getInstruction_Info(),id);
    }
    public List<Instruction> getInList()throws Exception{
        return super.executeQuery("select * from Instructon", Instruction.class);
    }
}

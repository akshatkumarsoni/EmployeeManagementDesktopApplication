/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.dao;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.EmpPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SCALive
 */
public class EmpDAO {
    public static boolean  addEmployee(EmpPojo e)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into employee values(?,?,?)");
        ps.setInt(1,e.getEmpNo());
        ps.setString(2, e.getEmpName());
        ps.setDouble(3, e.getEmpSal());
        return ps.executeUpdate()==1;           
    }
    public static List<EmpPojo> getAllEmployees()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        List<EmpPojo> empList=new ArrayList<>();
        ResultSet rs=st.executeQuery("Select * from employee");
        while(rs.next()){
            EmpPojo e=new EmpPojo();
            e.setEmpNo(rs.getInt(1));
            e.setEmpName(rs.getString(2));
            e.setEmpSal(rs.getDouble(3));
            empList.add(e);            
        }
        return empList;    
    }
    public static EmpPojo findEmpById(int id)throws SQLException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select * from employee where empID=?");
         ps.setInt(1, id);
         ResultSet rs=ps.executeQuery();
         EmpPojo emp=null;
         if(rs.next()){
             emp=new EmpPojo();
             emp.setEmpNo(id);
             emp.setEmpName(rs.getString(2));
             emp.setEmpSal(rs.getDouble(3));             
         }
         return emp;        
         
    }
    
    public static boolean updateEmp(EmpPojo e) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE employee SET empName = ?, empSalary = ? where empID = ?");
        ps.setInt(3, e.getEmpNo());
        ps.setString(1, e.getEmpName());
        ps.setDouble(2, e.getEmpSal());
        int ans = ps.executeUpdate();
        return (ans == 1);
        
        
    }
    
    public static boolean deleteEmp(int id) throws SQLException{
    
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from employee where empID = ? ");
        ps.setInt(1, id);
        int ans =ps.executeUpdate();
        return (ans == 1);
        
    }
    
    
            
    
}

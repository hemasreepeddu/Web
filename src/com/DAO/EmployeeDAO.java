package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.Util.DatabaseUtil;
import com.beans.Department;
import com.beans.Employee;

public class EmployeeDAO {
	private PreparedStatement ps;
	private PreparedStatement ps1;
	private Connection con;
	private ResultSet rs;
	
	public boolean addEmployee(Employee e, Department d) throws ClassNotFoundException , SQLException{
		boolean flag = false;
		Connection connect = null;
		ps = null;
		ps1=null;
		int id = 0,i=0,j=0;

		try {
			connect = DatabaseUtil.getConnection();
			rs=ps.executeQuery("select empIdGenerator.nextval from dual");
			while(rs.next()){
				id=rs.getInt(1);
			}
			ps = connect.prepareStatement("Insert into TBL_Employee_1341288 values(?,?,?,?)");

			ps.setInt(1,id);
			ps.setString(2, e.getEmployeeName());
			ps.setString(3,e.getAddress());
			ps.setInt(4,e.getMobile());

			i = ps.executeUpdate();
			
			ps1 = connect.prepareStatement("Insert into TBL_Department_1341288 values(?,?)");
			if(d.getDepartmentName().equals("HR")){
				ps.setInt(1,1);
				
			}
			else{
				ps.setInt(1,2);
			}
			
			ps.setString(2, d.getDepartmentName());
			j = ps.executeUpdate();
		} catch (SQLException s) {
			s.printStackTrace();
		} finally {
		
			DatabaseUtil.closeStatement(ps);
			DatabaseUtil.closeConnection(connect);

		}if (i > 0 && j>0) {
			flag = true;
			System.out.println("inserting..");
		} else {
			flag = false;
		}
		return flag;
	}
}

package com.wipro.scenario7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Scenario7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserBean ub = new UserBean();
		ub.setId("FR1004");
		ub.setPassword("FR1004");
		ub.setName("Amar");
		ub.setIncorrectAttempts(0);
		ub.setLockStatus(0);
		ub.setUserType("Employee");
		addUser(ub);

	}
	
	static void addUser(UserBean bean) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully." + conn);
			PreparedStatement ps = conn.prepareStatement("insert into harsha values(?,?,?,?,?,?)");
			ps.setString(1, bean.getId());
			ps.setString(2, bean.getPassword());
			ps.setString(3, bean.getName());
			ps.setInt(4, bean.getIncorrectAttempts());
			ps.setInt(5, bean.getLockStatus());
			ps.setString(6, bean.getUserType());
			
			ps.addBatch();
			ps.executeBatch();
			
			int UpdateCount=0;
			
			 UpdateCount = ps.getUpdateCount();
			 if(UpdateCount != 0) {
				 System.out.println("Success");
			 }else {
				 System.out.println("Failed");
			 }
		}catch(Exception e) {
			System.out.println("Establshing is failed"+e);
		}
	}

}

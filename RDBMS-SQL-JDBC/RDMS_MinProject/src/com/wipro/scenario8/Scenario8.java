package com.wipro.scenario8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.wipro.scenario7.UserBean;

public class Scenario8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserBean ub = new UserBean();
		ub.setId("SR1004");
		ub.setPassword("SR1004");
		ub.setName("Anil");
		ub.setIncorrectAttempts(0);
		ub.setLockStatus(1);
		ub.setUserType("Employee");
		addUser(ub);

	}
	
	static String addUser(UserBean bean) {
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
			
			if(bean.getLockStatus()==0) {
			ps.addBatch();
			ps.executeBatch();
			return "Success";
			}else {
				return "Failed";
			}	

}catch(Exception e) {
	System.out.println("Established failed" +e);
}
	
	return "Code Ended";
	}
}

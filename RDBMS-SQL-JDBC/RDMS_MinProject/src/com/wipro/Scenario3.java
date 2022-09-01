package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(changeUserType("TA1002"));
	}
	
	static String changeUserType(String userID) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully.");
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("UPDATE harsha SET usertype='Admin' WHERE userid='"+userID+"'");
			
			int UpdateCount=0;
			UpdateCount = stmt.getUpdateCount();
			if(UpdateCount != 0) {
				System.out.println("Update Success");
			}else {
				System.out.println("Update Failed");
			}
		
	}catch(Exception e) {
		System.out.println("Connection Not Established: " +e);
	}
		return "User Changed";
	}
}

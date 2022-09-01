package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Scenario6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(changePassword("NewPassword"));
	}
	static String changePassword(String password) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully." + conn);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("UPDATE harsha SET password='"+password+"'WHERE UserType='Admin'");
			
			int UpdateCount=0;
			UpdateCount = stmt.getUpdateCount();
			if(UpdateCount != 0) {
				System.out.println("changed");
			}else {
				System.out.println("0");
			}
		}catch(Exception e) {
			System.out.println("Connection Not Establshed: " +e);
		}
		return password;
	}

}

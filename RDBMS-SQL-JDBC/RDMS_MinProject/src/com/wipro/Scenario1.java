package com.wipro;

import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scenario1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getUserType("AB1001"));

	}
	static String getUserType(String userID) {
		
	

		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully.");
			Statement stmt = conn.createStatement();
			System.out.println(userID);

			ResultSet rs = stmt.executeQuery("select UserType from harsha where userID= '"+userID+"'");
			while(rs.next()) {
				System.out.println("User Type for UserId (" +userID+")= "+rs.getString("UserType"));
				
			}
			conn.close();
		}catch(Exception e) {
			System.out.println("Connection could not established");
			System.out.println(e);
		}
	
	return "Success";
	}

}

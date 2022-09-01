package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(getIncorrectAttempts("AB1001"));
	
	}
	static String getIncorrectAttempts(String userID) {
		
	
	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully.");
			Statement stmt = conn.createStatement();
			
	
			ResultSet rs = stmt.executeQuery("select UserType from harsha where userID= '"+userID+"'");
			while(rs.next()) {
				int val = rs.getInt("IncorrectAttempts");
				System.out.println(val);
				if(val==0) {
					System.out.println("No Incorrect Attempts");
				}else if(val == 1) {
					System.out.println("One Time");
				}else {
					System.out.println("Incorrect Attempts Exceeded");
				}				
			}
			conn.close();
		}catch(Exception e) {
			System.out.println("Connection could not established");
			System.out.println(e);
		}
	
	return "Program Ends";
	}
}

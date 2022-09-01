package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scenario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLockStatus(0));

	}
	static int getLockStatus(int LockStatus) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully.");
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select count(LockStatus) FROM harsha where lockstatus='"+LockStatus+"'");
			
			while(rs.next()) {
				System.out.println("Total rows with the lockstatus 0 ="+rs.getInt("count(LockStatus)"));
			}
		}catch(Exception e) {
			System.out.println("Connection Not Established"+e);
		}
		return LockStatus;
	}

}

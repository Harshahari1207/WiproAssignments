package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Scenario5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(changeName("RS1003", "HARSHA"));
	}
	
	static String changeName(String id, String name) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully." + conn);
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("UPDATE harsha SET name='"+name+"'WHERE userid='"+id+"'");
			
			int UpdateCount = 0;
			UpdateCount = stmt.getUpdateCount();
			if(UpdateCount != 0) {
				System.out.println("Success");
			}else {
				System.out.println("Failed");
			}
		}catch(Exception e) {
			System.out.println("Connection Not Established: " +e);
		}
		return name;
	}

}

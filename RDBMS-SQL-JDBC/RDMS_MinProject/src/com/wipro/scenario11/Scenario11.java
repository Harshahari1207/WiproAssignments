package com.wipro.scenario11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scenario11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNames();
	}
	
	static String[] getNames() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully." + conn);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT name From harsha");
			while(rs.next()) {
				String[] names = {rs.getString(1)};
				for(int i=0; i<names.length; i++) {
					System.out.println(rs.getString(1));
				}
			}
		}catch(Exception e) {
			System.out.println("Connection Not Established: " +e);
		}
		return null;
	}

}

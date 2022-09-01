package com.wipro.scenario9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Scenario9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getUsers("Admin");
	}
	
	static ArrayList<UserBean> getUsers(String userType){
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully." + conn);
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM harsha login WHERE usertype='"+userType+"'");
			ArrayList<UserBean> userList = new ArrayList<>();
			while(rs.next()) {
				UserBean user = new UserBean();
				userList.add(user);
				userList.size();
				{
					System.out.println(rs.getString(1)+" -"+rs.getString(2)+" - "+rs.getString(3)+" - "+rs.getString(4)+" - "+rs.getString(5)+" - "+rs.getString(6));
				}
			}
		}catch(Exception e) {
			System.out.println("Eshtablished failed "+e );
		}
		return null;
	}

}

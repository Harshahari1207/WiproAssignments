package Establishin_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		/*try{
		  	 Class.forName("oracle.jdbc.driver.OracleDriver");
			}
			catch(ClassNotFoundException ex) {
		   		System.out.println("Error: unable to load driver class!");
		   		System.exit(1);
			}*/
		try {
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Connection Established successfully.");
			
		}catch(Exception e) {
			System.out.println("Connection could not established");
			System.out.println(e);
		}

	}

}


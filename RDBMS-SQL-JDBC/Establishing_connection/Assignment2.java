package Establishing_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.transform.Result;

public class Assignment2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Statement stmt;
		ResultSet rs;
		Connection conn;
		try{
		  	 Class.forName("oracle.jdbc.driver.OracleDriver");
			}
			catch(ClassNotFoundException ex) {
		   		System.out.println("Error: unable to load driver class!");
		   		System.exit(1);
			}
		try {
			conn = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("Connection Established successfully.");
			
			String sql = "SELECT employee_id, first_name, last_name, department_id, salary FROM my_employee WHERE salary > 10000 AND salary < 20000";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println();
			
			while(rs.next()) {
				System.out.printf("%d %s %s %s %f\n", rs.getInt("employee_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getInt("department_id"), rs.getDouble("salary"));
			}
			
		}catch(Exception e) {
			System.out.println("Connection could not established");
			System.out.println(e);
		}
		
	}

}

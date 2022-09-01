package Executing_Query_and_Processing_Results;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment1 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		
		Statement stmt;
		ResultSet rs;
		Connection conn;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException ex) {
			System.out.println("Error: unable to load driver class!");;
			System.exit(1);
		}
		
		try {
			conn = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("Connection Established successfully.");;
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from my_employee");
			while(rs.next()) {
				System.out.println(rs.getInt("EMPLOYEE_ID") + "\t" +rs.getString("LAST_NAME") + "\t" +rs.getString("FIRST_NAME") + "\t" + rs.getInt("DEPARTMENT_ID") + "\t" + rs.getDouble("SALARY"));;
				
			}
			conn.close();
		}catch(Exception e) {
			System.out.println("Exception: " +e);
		}

	}

}

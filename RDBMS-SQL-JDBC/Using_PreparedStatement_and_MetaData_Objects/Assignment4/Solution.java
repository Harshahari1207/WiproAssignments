package Using_PreparedStatement_and_MetaData_Objects.Assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = Integer.parseInt(args[0]);
		double fees = Double.parseDouble(args[1]);
		
		try {			
			// update student data from stdnt table
			sql = "UPDATE stdent1 SET fees = ? WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, fees);
			pstmt.setInt(2, rollno);
			
			if (pstmt.executeUpdate() == 1)
				System.out.println("Fees of student having rollno = " + rollno + " updated successfully");
			else
				System.out.println("Error");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		sc.close();

	}

}

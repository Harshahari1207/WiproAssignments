package Using_PreparedStatement_and_MetaData_Objects.Assignment3;

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
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = Integer.parseInt(args[0]);
		
		try {
			// backup/log student data to student1 table
			sql = "INSERT INTO student1 SELECT * FROM stdent1 WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			int logged = pstmt.executeUpdate();
			
			// delete student data from stdnt table
			sql = "DELETE FROM stdent1 WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			
			if (pstmt.executeUpdate() == 1 && logged == 1)
				System.out.println("Student1 having rollno = " + rollno + " deleted successfully");
			else
				System.out.println("Error");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		sc.close();

	}

}

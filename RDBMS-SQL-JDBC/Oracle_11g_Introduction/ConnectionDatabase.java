package Oracle_11g_Introduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDatabase {

	public static void main(String[] args) throws SQLException{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement stmt =conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employees");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" "+rs.getString(2)+ "\n");
		}
		conn.close();

	}

}



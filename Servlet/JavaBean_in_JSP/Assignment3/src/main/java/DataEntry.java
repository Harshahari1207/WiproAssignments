

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/DataEntry")
public class DataEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con = null;
	PreparedStatement pstmt = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		con = DBUtil.getConnection();
		String sql = "insert int emp values(?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(request.getParameter("id")));
			pstmt.setString(2, request.getParameter("empName"));
			pstmt.setString(3, request.getParameter("desg"));
			pstmt.executeUpdate();
			out.println("success");
			request.setAttribute("result", "Success");
		}catch(SQLException e) {
			request.setAttribute("result", "Failed");
			out.println("Failed");
			e.printStackTrace();
		}
		out.close();
	}

}

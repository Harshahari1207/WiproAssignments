package com.ass2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetPost2")
public class GetPost2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public GetPost2() {
        // TODO Auto-generated constructor stub
    }
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		String age = request.getParameter("age");
		String date = request.getParameter("date");
			response(response, "Name : " +name);
			response(response, "Password : " +pass);
			response(response, "Age : " +age);
			response(response, "Date : " +date);
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void response(HttpServletResponse resp, String msg) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title> Received Parameters</title></head>");
        out.println("<body align=\"center\">");
        out.println("<h3>" + msg + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }

}

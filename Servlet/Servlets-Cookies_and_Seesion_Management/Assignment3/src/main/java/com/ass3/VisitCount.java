package com.ass3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/VisitCount")
public class VisitCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		
		if(session.isNew())
			session.setAttribute("visits", 1);
		else {
			int count = (int) session.getAttribute("visits");
			session.setAttribute("visits", count+1);
		}
		out.println("<div align = \"center\"><h2> Visit Count : " +session.getAttribute("visists") + "</h2></div>");
	}

}

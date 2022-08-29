

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "PageChange control to jsp", urlPatterns = { "/redirect" })
public class PageChange extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int number = Integer.parseInt(request.getParameter("number"));
		
		request.setAttribute("number", number);
		
		if(number < 10)
			request.getRequestDispatcher("smaller.jsp");
		else if(number >= 10 && number < 99)
			request.getRequestDispatcher("larger.jsp");
		else
			request.getRequestDispatcher("error.jsp");
		
		out.close();
		
	}

}

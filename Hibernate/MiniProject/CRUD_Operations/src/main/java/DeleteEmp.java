

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Servlet implementation class DeleteEmp
 */
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String id = request.getParameter("id");
			int i = Integer.parseInt(id);
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			@SuppressWarnings("unchecked")
			Query<Employee> q1 = session.createQuery("From Employee as e where e.id=?1");
			q1.setParameter(1, i);
			List<Employee> list = q1.getResultList();
			PrintWriter out = response.getWriter();
			if(list.isEmpty()) {
				out.println("There is no Employee with the id" +id);
			}else {
				request.setAttribute("list", list);
				request.setAttribute("id", i);
				getServletContext().getRequestDispatcher("/Delete.jsp").forward(request, response);
				
			}
			session.getTransaction().commit();
			sf.close();
		}catch(Exception e) {
			System.out.println();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

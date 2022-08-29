

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Addemp
 */
public class Addemp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addemp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String designation = request.getParameter("designation");
		String salary = request.getParameter("salary");
		String city = request.getParameter("email");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		try {
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			Employee e = new Employee();
			e.setName(name);
			e.setGender(gender);
			e.setDesignation(designation);
			e.setSalary(Integer.parseInt(salary));
			e.setCity(city);
			e.setEmail(email);
			BigInteger n = new BigInteger(mobile);
			e.setMobile(n);
			session.persist(e);
			session.getTransaction().commit();
			sf.close();
			List<Employee> list = new ArrayList<Employee>();
			list.add(e);
			request.setAttribute("list", list);
			request.getRequestDispatcher("All.jsp").forward(request, response);
			
		}catch(Exception e) {
			System.out.println(e);
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

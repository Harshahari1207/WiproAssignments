package com.wipro.Intorduction_to_hibernate.services;

import org.hibernate.Session;
import com.wipro.Introduction_to_hibernate.bean.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmployeeCreateAdmin {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.employee.create.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Employee empobj1 = new Employee("MSD", "Analyst", 10000);
		Employee empobj2 = new Employee("VK", "Data Analyst", 50000);
		Employee empobj3 = new Employee("YS", "Java developer", 25000);
		Employee empobj4 = new Employee("ABD", "Python developer", 45000);
		Employee empobj5 = new Employee("CG", "Analyst", 30000);
		session.save(empobj1);
		session.save(empobj2);
		session.save(empobj3);
		session.save(empobj4);
		session.save(empobj5);
		transaction.commit();
		System.out.println("Record inserted");
		System.out.println(empobj1);
		System.out.println(empobj2);
		System.out.println(empobj3);
		System.out.println(empobj4);
		System.out.println(empobj5);
		session.close();

	}

}

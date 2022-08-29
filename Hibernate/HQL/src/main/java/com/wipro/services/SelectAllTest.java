package com.wipro.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.bean.Car;

public class SelectAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure("hibernate.car.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query<Car> query = session.createQuery("from Car",Car.class);
		List<Car> c1 = query.list();
		
		transaction.commit();
		System.out.println("Record retrieved: ");
		for(Car c :c1) {
			System.out.println(c);
		}
		session.close();

	}

}

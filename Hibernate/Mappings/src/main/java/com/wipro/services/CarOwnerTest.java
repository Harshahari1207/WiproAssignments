package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.CarDetails;
import com.wipro.bean.CarOwner;

public class CarOwnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure("hibernate.owner.create.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		CarDetails car = new CarDetails("AP 03D 34", "Huracan Evo", "Canary Yellow", "Lamborgini");
		
		CarOwner owner = new CarOwner("Dave", car);
		
		session.save(car);
		session.save(owner);
		
		transaction.commit();
		
		System.out.println("Record Inserted: ");
		System.out.println(owner);
		
		session.close();
	}

}

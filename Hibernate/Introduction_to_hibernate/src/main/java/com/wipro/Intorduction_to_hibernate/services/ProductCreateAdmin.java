package com.wipro.Intorduction_to_hibernate.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.Introduction_to_hibernate.bean.Product;

public class ProductCreateAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Product probj1 = new Product("Chicken 1kg", 140);
		Product probj2 = new Product("Tamota 1kg", 30);
		Product probj3 = new Product("Yupee nudles", 20);
		Product probj4 = new Product("Paste", 50);
		Product probj5 = new Product("Rise packet 20kg", 2000);
		session.save(probj1);
		session.save(probj2);
		session.save(probj3);
		session.save(probj4);
		session.save(probj5);
		System.out.println("Record inserted");
		System.out.println(probj1);
		System.out.println(probj2);
		System.out.println(probj3);
		System.out.println(probj4);
		System.out.println(probj5);

		session.close();
	}

}

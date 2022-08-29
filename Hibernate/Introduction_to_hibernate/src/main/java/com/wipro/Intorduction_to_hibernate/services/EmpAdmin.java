package com.wipro.Intorduction_to_hibernate.services;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.Introduction_to_hibernate.bean.Emp;

public class EmpAdmin 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        
        Emp empObj = new Emp(102, "Harsha", "Java developer", 56233, Date.valueOf("2022-08-20"), 25000, 500, 10);
        session.save(empObj);
        transaction.commit();
        System.out.println("Resord inserted");
        System.out.println(empObj);
        session.close();
    }
}

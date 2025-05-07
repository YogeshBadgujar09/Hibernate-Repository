package com.yogesh.assigment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import net.bytebuddy.implementation.ToStringMethod;

public class UpdateData {

	public static void main(String[] args) {
		
		Information information = null;
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Information.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		//Get Data first
		
		information = session.get(Information.class, 1);
		System.out.println(information.toString());
		
		
		session.beginTransaction();
		
		// Set Updated data
		
		information.setName("Rohit");
		information.setMobile("2223334445");
		
		session.update(information);
		
		session.getTransaction().commit();
		
		session.close();
		
		System.out.println("Data updated ... !!! ");
		
	}
}

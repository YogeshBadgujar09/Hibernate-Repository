package com.yogesh.assigment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveInfromation {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Information.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Information information = null ;
		
		information = session.get(Information.class, 1);
		
		System.out.println(information.toString());
		
		session.close();
	}

}

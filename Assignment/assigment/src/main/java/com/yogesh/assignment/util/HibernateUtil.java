package com.yogesh.assignment.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yogesh.assigment.Information;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory;
	
	private HibernateUtil() {}
	
	public static SessionFactory getSessionFactoryInstance() {
		
		if(sessionFactory == null ) {
			
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Information.class);
			sessionFactory = configuration.buildSessionFactory();
			
		}
		
		return sessionFactory;
	}

}

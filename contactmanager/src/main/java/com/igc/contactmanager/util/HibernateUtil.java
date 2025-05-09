package com.igc.contactmanager.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.igc.contactmanager.Contact;

public class HibernateUtil {

	public static SessionFactory sessionFactory;
	private HibernateUtil() {
		
	}
	public static SessionFactory getSessionFactoryInstance() {
		
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Contact.class);
			sessionFactory = configuration.buildSessionFactory();
		}
		
		return sessionFactory;
	}
	
	
}

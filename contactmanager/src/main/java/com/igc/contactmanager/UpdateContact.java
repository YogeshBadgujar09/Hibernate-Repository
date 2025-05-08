package com.igc.contactmanager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateContact {

	public static void main(String[] args) {
		Contact contact = null;
		
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Contact.class);
		configuration.addAnnotatedClass(AddressBook.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		contact = session.get(Contact.class, 2);
		
		System.out.println(contact.toString());
				
		contact.setName("Chetan");
		contact.setEmail("chetan@gmail.com");
		contact.setMobno("9988776655");
		
		session.beginTransaction();
		session.update(contact);
		session.getTransaction().commit();
		
		session.close();
	}
	
}

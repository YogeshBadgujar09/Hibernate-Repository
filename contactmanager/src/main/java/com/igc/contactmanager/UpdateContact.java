package com.igc.contactmanager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.igc.contactmanager.util.HibernateUtil;

public class UpdateContact {

	public static void main(String[] args) {
		Contact contact = null;
		
		Session session = HibernateUtil.getSessionFactoryInstance().openSession();
		
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

package com.igc.contactmanager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Contact contact = new Contact();
        contact.setId(2);
        contact.setName("Shubham");
        contact.setMobno("1234567890");
        contact.setEmail("shubham@gmail.com");
        
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Contact.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(contact);
        session.getTransaction().commit();
        
        session.close();
        
        System.out.println("Contact Saved....");
        
        
    }
}

package com.igc.contactmanager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.igc.contactmanager.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Transient State
        Contact contact = new Contact();
        //contact.setId(2);
        contact.setName("Shubham");
        contact.setMobno("1234567890");
        contact.setEmail("shubham@gmail.com");
        
        Session session = HibernateUtil.getSessionFactoryInstance().openSession();
        session.beginTransaction();
        session.save(contact);		//Persistent State 
        session.getTransaction().commit();
        
        session.close();
        
        System.out.println("Contact Saved....");
        
        
    }
}

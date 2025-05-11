package com.yogesh.assigment;


import org.hibernate.Session;

import com.yogesh.assignment.util.HibernateUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      
    	Information information = new Information();
    	information.setId(5);
    	information.setName("yash");
    	information.setMobile("1234567890");
    	

    	Session session = HibernateUtil.getSessionFactoryInstance().openSession();
    	session.beginTransaction();
    	session.save(information);
    	session.getTransaction().commit();
    	session.close();
    	
    }
}

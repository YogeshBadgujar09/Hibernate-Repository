package com.yogesh.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.jdbc.Driver;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      
    	Information information = new Information();
    	information.setId(4);
    	information.setName("yash");
    	information.setMobile("1234567890");
    	
    	Configuration configuration = new Configuration();
    	configuration.configure();
    	configuration.addAnnotatedClass(Information.class);
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(information);
    	session.getTransaction().commit();
    	session.close();
    	
    }
}

package com.yogesh.assigment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      
    	System.out.println("Add dependency of MySQL Using Maven Tool ... !!!");
    	
    	try {
			
    		Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assigmentdb","root","2345");
			
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO information VALUES(1,'yogesh','1234567890')");
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
}

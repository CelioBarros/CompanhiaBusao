package br.com.droid;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {

	
	public static Connection connectToDatabase() throws SQLException{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return DriverManager.getConnection("jdbc:mysql://rnnvp.ddns.net/ciabusao_db", "root", "159753");
		
	}

}
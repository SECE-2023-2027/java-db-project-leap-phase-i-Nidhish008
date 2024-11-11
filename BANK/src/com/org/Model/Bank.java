package com.org.Model;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Bank{
	public static Connection db_Connect() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDB","root","nid@81005");
	}
}


package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b16", "root", "root");
			String sql = "create table Student (sid int,sname varchar(40),address varchar(50))";
			String sql1 = "insert into Student values (11,'mauli','pune'),(12,'Ganesh','nager'),(13,'Rakesh','Akordi')";
			String sql2="update Student set sname='Prathmesh'where sid=11";
			String sql4="delete from Student where sid=12";
			Statement smt = connection.createStatement();
			smt.executeUpdate(sql4);
			System.out.println("Success...");
			connection.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

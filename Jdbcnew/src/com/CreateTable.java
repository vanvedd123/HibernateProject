package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/B16", "root", "root");
			String sql = "create table Student(sid int,sname varchar(50),address varchar(40))";
			Statement smt = connection.createStatement();
			smt.execute(sql);
			connection.createStatement();
			System.out.println("Success....");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

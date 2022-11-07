package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RecordeInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b16", "root", "root");
			String sql = "insert into Student values(?,?,?)";
			String sql2 = "select sid,sname from Student";

			Statement smt = connection.createStatement();
			ResultSet rs = smt.executeQuery(sql2);
			while (rs.next()) {
				int sid = rs.getInt(1);
				System.out.println(sid);
				System.out.println(rs.getString("sname"));

			}
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
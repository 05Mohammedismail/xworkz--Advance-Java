package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloJDBC {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String pass = "Xworkzodc@123";

		String driverClass = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String query = "UPDATE bank set name = 'SBI' WHERE id = 1";
		String query1 = "Select * from bank";
		Connection con = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, userName, pass);
			System.out.println("Got the connection");
			stmt = con.createStatement();
			 stmt.execute(query);
			rs = stmt.executeQuery(query1);
			while (rs.next()) {
				System.out.println(rs.getInt("id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

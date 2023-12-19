package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Festival {
	static String url = "jdbc:mysql://localhost:3306/jdbc";
	static String userName = "root";
	static String pass = "Xworkzodc@123";

	static String driverClass = "com.mysql.jdbc.Driver";

	public static void main(String[] args) {

		insertIntoStudent(2, "Afsha", 9, "A");
	}

	public static void insertIntoStudent(int id, String name, int std, String sec) {
		String query = "INSERT INTO student VAlUES(?, ?, ?, ?)";
		Connection con = null;
		java.sql.PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(url, userName, pass);
			System.out.println("Got the connection");
			stmt = con.prepareStatement(query);

			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, std);
			stmt.setString(4, sec);
			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Closed the connection");
					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println("Closed the Statement");
					e.printStackTrace();
				}
			}
		}
	}
}

package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connetcor {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/java";
			String id = "root";
			String pwd = "1234";
			Connection conn = DriverManager.getConnection(url, id, pwd);
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print("[" + rs.getInt("num") + ",");
				System.out.print(rs.getString("name") + ",");
				System.out.println(rs.getString("id") + "]");
			}
			sql = "INSERT INTO user\r\n" + "VALUES(1,'아무거나','anything'),\r\n" + "(2,'무무무','nothing');\r\n" + "";
			int result = stmt.executeUpdate(sql);
			System.out.println("실행결과 반영 개체 수:" + result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

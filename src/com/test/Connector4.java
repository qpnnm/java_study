package com.test;

public class Connector4 {
	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb:/127.0.0.1:3306/java";
			String id = "root";
			String pwd = "1234";
				Connection conn = DriverManager.getConnection(url, id, pwd);
				Statement stmt = conn.createStatement();
			 catch (SQLException e) {
				e.printStackTrace();
			}

		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		}

}
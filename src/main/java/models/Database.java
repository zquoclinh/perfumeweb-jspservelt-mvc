package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	private static Connection conn;
	private static final String url="jdbc:mysql://localhost:3306/phuong_perfume?useUnicode=true&characterEncoding=UTF-8";
	public static Connection getConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =DriverManager.getConnection(url,"root", "");
		} catch (Exception e) {
			return null;
		}
		return conn;
	}
}

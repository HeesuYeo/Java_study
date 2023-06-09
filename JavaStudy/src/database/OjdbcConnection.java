package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OjdbcConnection {
	
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String id = "hr";
	private static String password = "password";
	
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("objdbc getConnection() error");
			return null;
		}
		
	}
}

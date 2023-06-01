/*
 	# JDBC
 	
 		- Java Database Connectivity
 		
 			- 자바에서 데이터베이스로 쿼리문을 전달하여 실행 한 후
 		  	결과를 받아 올 수 있는 기능을 구현해놓은 JAVA API
 		  
	    	- 다양한 종류의 DB와 연결 할 수 있다
	    
 			- JAVA쪽 소스 코드는 어떤 DB와 연결하더라도
 			  항상 동일하게끔 설계되어 있다
	
	# OJDBC
		
		- 오라클 데이터베이스가 JDBC API와 소통하기 위해 만들어 놓은
		  라이브러리 
 		
 		- 오라클DB 설치 폴더에 동봉되어 있다
 		
 		- SQLDeveloper 내부에도 포함되있다
 */
package database.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J02_SeleteQuiz {
	
	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 완료");
		
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못했습니다");
		}
		
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", "testuser", "1234");
		
		String sql = "SELECT * FROM cobaco";
		
		
		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();
				
		while (rs.next()) {
			System.out.printf("%-20s\t%s\t%d\t%s\n",
					rs.getString("menu"),
					rs.getString("kcal"),
					rs.getInt("price"),
					rs.getString("cucumber"));
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
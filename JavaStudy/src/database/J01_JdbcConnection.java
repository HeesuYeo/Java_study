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
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J01_JdbcConnection {

	public static void main(String[] args) {
	
		// 1. Class.forName()으로 각 회사의 jdbc 드라이버를 로드한다 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 완료");
		
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못했습니다");
		}
		
		// 2. DriverManager 클래스를 통해 DB에 연결한다
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "password");
		System.out.println("연결생성완료" + conn);

		//3. 생성된 연결 인스턴스를 통해 쿼리문을 전달한다
		String sql = "SELECT * FROM employees INNER JOIN "
				+ "departments USING (department_id)";// 쿼리문에 ;을 달면안됨
		
		//[3-1] 구문 준비 시키기 
		PreparedStatement pstmt = conn.prepareStatement(sql);

		//[3-2] 준비된 구문 DB로 전달해 실행 
		ResultSet rs = pstmt.executeQuery();
				
		//4. 받아온 결과를 사용한다 (SELECT의 경우 resultset 타입 인스턴스에 들어있다
		while (rs.next()) {
			System.out.printf("%-20s\t%d\t%s\n",
					rs.getString("first_name") + ' ' + rs.getString("last_name"),
					rs.getInt("salary"),
					rs.getString("department_name"));
		}
		//5. 연결을 반드시 끊어야 함
		rs.close();
		pstmt.close();
		conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
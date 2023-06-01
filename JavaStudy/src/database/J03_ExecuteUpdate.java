/*
 		# 
 		
 		1. executeQuery() : 리턴 ResultSet. select문에 사용한다
 		
 		1. executeUpdate() : 리턴값 업데이트 된 행.Insert, Update, Delete문에 사용한다
 
 
 
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class J03_ExecuteUpdate {

	public static void main(String[] args) {

		String driver = J02_PrepareStatement.driver;
		String url = J02_PrepareStatement.url;

		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sql1 = "INSERT INTO fruits VALUES(?,?,?,?,?)";
		String sql2 = "UPDATE fruits SET price=price+100 WHERE name LIKE ?";

		try (Connection conn = DriverManager.getConnection(url, "hr", "password");
				PreparedStatement pstmt1 = conn.prepareStatement(sql1);
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);) {
			// connection 인스턴스는 처음에 자동 커밋이 활성화 되어 있다
			conn.setAutoCommit(false);

			pstmt1.setString(1, "red orange");
			pstmt1.setDouble(2, 4.44);
			pstmt1.setInt(3, 1500);
			pstmt1.setString(4, "jp");
			pstmt1.setString(5, "AA");

			pstmt2.setString(1, "%gyul%");

			// Insert, Update, Delete는 executeUpdate() 메서드를 사용한다

			int row = pstmt1.executeUpdate();

			System.out.println(row + "행이 성공적으로 추가되었습니다.");

			Savepoint point1 = conn.setSavepoint("point1");

			row = pstmt2.executeUpdate();

			System.out.println(row + "행이 성공적으로 100원 올랐습니다..");

			conn.rollback(point1);

			// Connection 객체에 커밋과 롤백 기능이 있다
			// point1로 돌아가 update는 취소하고 insert 커밋해보기

			System.out.println("commit을 통해 변경 사항을 확정지었습니다.");

			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class J04_MetaData {
	
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees WHERE department_id = ?";
		String sql2 = "SELECT * FROM employees WHERE job_id = ?";
		
		try (
			Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)
		) {
			pstmt.setInt(1, 50);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				
				// 조회한 resultSet의 메타 데이터를 볼 수 있다
				ResultSetMetaData metaData = rs.getMetaData();
				
				System.out.println("컬럼은 몇개 ? " + metaData.getColumnCount() + "개");
				
				for (int i = 1; i <=metaData.getColumnCount(); ++i) {
					System.out.println(i + "번째 컬럼라벨 : " + metaData.getColumnLabel(i));
					System.out.println(i + "번쨰 컬럼의 DisPlaySize : " + 
							metaData.getColumnDisplaySize(i));
					System.out.println(i + "번째 컬럼의 타입 : " + metaData.getColumnTypeName(i));
				}
				
				while (rs.next()) {
					System.out.printf("%d\t%s\t%d\t%d\n",
							rs.getInt("employee_id"),
							rs.getString("first_name"),
							rs.getInt("salary"),
							rs.getInt("department_id"));
				
				}
			}
							
		} catch (SQLException e) {
		e.printStackTrace();
	
		
		}
		
	}
	
}
//	DB에서 꺼내온 데이터는 해당 태이블의 데이터를 담을 수 있는 
//	데이터 모델 클레스에서 보관하는 것이 좋다	
/*	
		 # 데이터 모델 클레스  
			
			- 데이터를 담아 놓는 용도인 클래스(DTO)
			
			- 필드값에 그냥 접근하도록 허용하지 않고 
			  getter와 setter를 통해 접근하도록한다	
			  
		  	- getter만 달아놓으면 읽기 전용 데이터 클래스가 된다 (VO, Value, Object)
		  	
		  	- setter를 달아놓으면 수정이 가능한 필드가 된다
	
 */	
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.model.Fruit;

public class J05_DataModelClass {
	
	public static void main(String[] args) {
		
		List<Fruit> fruits = new ArrayList<>();
		
		try (
			Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM fruits");
			ResultSet rs = pstmt.executeQuery(); 
		) {
			
			while (rs.next()) {
				
				Fruit f = new Fruit();
				
				f.setName(rs.getString("Name"));
				f.setPrice(rs.getInt("Price"));
				f.setSweet(rs.getDouble("Sweet"));
				f.setApple_grade(rs.getString("apple_grade"));
				f.setCountry_id(rs.getString("Country_id"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//DB 연결 부분에서 활용하기 보다는 컬렉션에 담아놓은 후 활용하는 것이 좋다
		System.out.println(fruits);
	}
}
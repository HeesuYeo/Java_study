/*
 	employees와 departments를 조인한 결과를 
 	조회하여 데이터 모델에 담아 모두 출력해보세요
*/
package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.OjdbcConnection;
import database.model.EmployeeAndDepartment;

public class J05_JoinEmployees {

	public static void main(String[] args) {
		
		List<EmployeeAndDepartment> list = new ArrayList<>();
		String query = "SELECT * FROM employees INNER JOIN departments USING (department_id)";

		try (Connection conn = OjdbcConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(query);
				ResultSet rs = pstmt.executeQuery();) {

		while(rs.next()) {
			list.add(new EmployeeAndDepartment(rs));
		
		}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		System.out.println(list);
		
	}
}






































//List<EmployeesDatamodel> employee = new ArrayList<>();
//List<DepartmentsDatamodel> Department = new ArrayList<>();
//
//try (
//		Connection conn = OjdbcConnection.getConnection();
//		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
//		PreparedStatement pstmt1 = conn.prepareStatement("SELECT * FROM departments");
//		PreparedStatement pstmt2 = conn.prepareStatement("SELECT * FROM employees INNER JOIN departments USING (departments)");	
//		ResultSet rs = pstmt.executeQuery();
//		ResultSet rs1 = pstmt1.executeQuery();
//		ResultSet rs2 = pstmt1.executeQuery();
//		) {
//	
//	while (rs.next()) {
//		
//		EmployeesDatamodel a = new EmployeesDatamodel();
//		
//		a.setEmployee_id(rs.getInt("employee_id"));
//		a.setFirst_name(rs.getString("first_name"));
//		a.setEmail(rs.getString("email"));
//		a.setPhone_number(rs.getString("phone_number"));
//		a.setHire_date(rs.getString("hire_date"));
//		a.setJob_id(rs.getString("job_id"));
//		a.setSalary(rs.getInt("salary"));
//		a.setCommission_pct(rs.getInt("commission_pct"));		
//		a.setManager_id(rs.getInt("manager_id"));
//		a.setDepartment_id(rs.getInt("department_id"));
//		
//	}
//	
//	while (rs1.next()) {
//		
//		DepartmentsDatamodel b = new DepartmentsDatamodel();
//		
//		b.setDepartment_id(rs.getInt("department_id"));
//		b.setDepartment_name(rs.getString("department_name"));
//		b.setManager_id(rs.getInt("manager_id"));
//		b.setLocation_id(rs.getInt("location_id"));
//	}
//	
//	
//} catch (SQLException e) {
//	e.printStackTrace();
//}
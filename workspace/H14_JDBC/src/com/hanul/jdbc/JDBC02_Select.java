package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBC02_Select {


	public static void main(String[] args) {
		// 1. 오라클 드라이버(ojdbc8.jar)를 다운로드 하여 lib 폴더에 넣는다
		// (중요) 프로젝트명(H14_JDBC)에 오른쪽 마우스 클릭하면 BuidPath에 들어가서 Add External Jars..에 파일추가
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
		}
		Connection conn=null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		ArrayList<Employees> empArr = new ArrayList<>();
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			conn = DriverManager.getConnection(url,"hr","0000");
			String sql = "select * from employees where employee_id=?";
		
			ps = conn.prepareStatement(sql);
			int emp_id=100;
			ps.setInt(1, emp_id);
			 rs =  ps.executeQuery();
			
			while(rs.next()) {
				empArr.add(	new Employees(
						        rs.getInt("employee_id")
								,rs.getInt("salary")
								,rs.getInt("commission_pct")
								,rs.getInt("manager_id")
								,rs.getInt("department_id")
								,rs.getString("first_name")
								,rs.getString("last_name")
								,rs.getString("email")
								,rs.getString("phone_number")
								,rs.getString("job_id")
								,rs.getDate("hire_date"))
						);
			}
			empArr.stream().filter(emp -> emp.getSalary() > 100)
			.forEach(e->System.out.println(
					e.getFirst_name()+ ", " + 
					e.getLast_name()+ ", "  +
					e.getSalary()+ ", "     + 
					e.getPhone_number() 
			));
			// 7. DB 연결 해제
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
				rs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

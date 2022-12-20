package com.hanul.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBC02_Select {


	public static void main(String[] args) {
		// 1. 오라클 드라이버(ojdbc8.jar)를 다운로드 하여 lib 폴더에 넣는다
		// 2. 프로젝트명(H14_JDBC)에 오른쪽 마우스 클릭하면 BuidPath에 들어가서 Add External Jars..에 파일추가
		// 1. 드라이버 생성 : Class.forName(로드하는 드라이버명) 메소드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
		}
		// 2. 데이터베이스 연결 : Connection 객체필요
		// DriverManager.getConnection
		// (연결하는 데이터베이스 url,사용자이름, 페스워드) 메소드
		Connection conn=null;
		java.sql.Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Employees> empArr = new ArrayList<>();
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			conn = DriverManager.getConnection(url,"hr","0000");
			// 3. SQL문 선언
			String sql = "select * from employees";
			// 4. 데이터베이스에 SQL문 실행
			// SQL문 실행기능이 있는 Statement 클래스를 사용,execcuteQuery()사용
		
			 stmt = conn.createStatement();
			// 5. 만약 받아오는 결과물이 있으면 받음 : ResultSet 타입의 객체에 담는다
			 rs =  stmt.executeQuery(sql);
			// 6. 결과 데이터행 출력해보자
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
			System.out.println();
			empArr.stream().filter(emp -> emp.getEmployee_id() == 101)
			.forEach(System.out::print);
			// 7. DB 연결 해제
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				stmt.close();
				rs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

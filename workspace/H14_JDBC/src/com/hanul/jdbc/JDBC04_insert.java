package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC04_insert {
	public enum Color {

		   White,

		   Green,

		   Blue,

		   Purple,

		   Orange,

		   Red
		}
	public static void main(String[] args) {
		int color = Color.White.ordinal();
		System.out.println(color);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
		}
		Connection conn = null;
		PreparedStatement ps = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			conn = DriverManager.getConnection(url, "hr", "0000");
			int emp_id = 700, salary = 5000;
			String last_name = "홍",first_name = "길동",
			email = "hong@naver.com", job_id = "IT_PROG";   
			String sql = "insert into employees "
					+ "(employee_id, last_name, first_name, email, job_id, salary, hire_date)"
					+ " values(?, ?, ?, ?, ?,?,sysdate)";

			ps = conn.prepareStatement(sql);
			ps.setInt(1, emp_id);
			ps.setString(2, last_name);
			ps.setString(3, first_name);
			ps.setString(4, email);
			ps.setString(5, job_id);
			ps.setInt(6, salary);
			int result = ps.executeUpdate();
			System.out.println(result);
			if (result > 0) {
				System.out.println("suss");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

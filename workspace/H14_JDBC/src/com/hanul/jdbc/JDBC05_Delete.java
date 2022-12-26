package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC05_Delete {
	interface N {
		int emp_id = 1;
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
		}
		Connection conn = null;
		PreparedStatement ps = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			conn = DriverManager.getConnection(url, "hr", "0000");
			String sql = "delete employees where employee_id=?";

			ps = conn.prepareStatement(sql);
			
			int emp_id=700;
			ps.setInt(N.emp_id, emp_id);
			int result = ps.executeUpdate();
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

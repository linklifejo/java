package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC03_Update {
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
			String sql = "update employees set " + "salary=?,last_name=?" + "where employee_id=?";

			ps = conn.prepareStatement(sql);
			ps.setInt(1, 26000);
			ps.setString(2, "King");
			ps.setInt(3, 100);
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

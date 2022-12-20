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
		java.sql.Statement stmt = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		int r = 100;
		try {
			conn = DriverManager.getConnection(url, "hr", "0000");
			// 3. SQL문 선언
//			String sql = "update employees set " + "salary=26001" + "where employee_id=100";
			String sql = "update employees set " + "salary=?,last_name=?" + "where employee_id=?";

			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
//			pstmt = conn.prepareStatement("insert into test1 values(id_sequence.nextval, ?)");
			pstmt.setInt(1, 26000);
			pstmt.setString(2, "King");
			pstmt.setInt(3, 100);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("suss");
			}
//			// 5. 만약 받아오는 결과물이 있으면 받음 : ResultSet 타입의 객체에 담는다
//			 int cnt =  stmt.executeUpdate(sql);
//			 if(cnt>0) {
//				 System.out.println("suss");
//			 }
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package com.hanul.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC01 {

	public static void main(String[] args) {
		// 1. 오라클 드라이버(ojdbc8.jar)를 다운로드 하여 lib 폴더에 넣는다
		// 2. 프로젝트에 오른쪽 마우스 클릭하면 BuidPath에 들어가서 Add External Jars..에 파일추가
		// 1. 드라이버 생성 : Class.forName(로드하는 드라이버명) 메소드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버생성완료");
		} catch (Exception e) {
			// TODO: handle exception
		}
		// 2. 데이터베이스 연결 : Connection 객체필요
		// DriverManager.getConnection
		// (연결하는 데이터베이스 url,사용자이름, 페스워드) 메소드
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Connection conn = DriverManager.getConnection(url,"hr","0000");
			System.out.println("데이터베이스접속성공");
			// 3. SQL문 선언
			
			// 4. 데이터베이스에 SQL문 실행
			// 5. 만약 받아오는 결과물이 있으면 받음
			// 6. DB 연결 해제
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}

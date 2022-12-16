package com.hanul.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class StudentMain {
	
	// Homework1_본인이름 -> 폴더를 zip파일로 만들어 이름을 붙인후 제출
	// [과제]
	// 1. 	BufferedReader 클래스를 사용해 list.txt 파일에서 한 줄씩 읽어온 데이터를 
	//		Student 객체 로 만들어 자료구조 HashMap 에 데이터로 저장한다.
	// 2. 	저장을 모두 끝낸 후 자료구조에 있는 학생목록에서 학생의 정보를 찾아 
	// 다음처럼 출력되게 한다.
	
	// 출력결과) : 자기자신의 정보를 출력해보세요
	// 성명: 최선
	// 성별: 여
	// 연락처: 010-230-0320
	// 주  소: chltjs@naver.com
	public static void main(String[] args) {
//		BufferedReader in = null;
//		ArrayList<Student> students = new ArrayList<Student>();
//		String filename="list.txt";
//		try {
//			in = new BufferedReader(new FileReader(filename));
//			String data;
//			String[] s= {};
//			while((data=in.readLine())!=null) {
//				s = data.split(",");
//				students.add(new Student(s[0], s[1], s[2], s[3]));
//				
//			}
//			for(Student ss: students) {
//				if(ss.name.equals("조복연")) {
//					System.out.println("성명:" + ss.name);
//					System.out.println("성별:" + ss.gender);
//					System.out.println("연락처:" + ss.phone);
//					System.out.println("이메일:" + ss.email);
//				}
//			}
//		} catch (Exception e) {
//		}finally {
//			try {
//				in.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		// 선생님 위에 소스는 리스트 소스입니다.
		BufferedReader in = null;
		HashMap<String,Student> students = new HashMap<>();
		String filename="list.txt";
		try {
			in = new BufferedReader(new FileReader(filename));
			String data;
			String[] s= {};
			while((data=in.readLine())!=null) {
				s = data.split(",");
				students.put(s[0],new Student(s[0], s[1], s[2], s[3]));
				
			}
			for(Student st: students.values()) {
				if(st.name.equals("조복연")) {
					System.out.println("성명:" + st.name);
					System.out.println("성별:" + st.gender);
					System.out.println("연락처:" + st.phone);
					System.out.println("이메일:" + st.email);
				}
			}
		} catch (Exception e) {
		}finally {
			try {
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
}

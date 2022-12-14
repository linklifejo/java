package com.hanul.Inheritance;

public class Ex51_Student extends Ex53_People{
	// 학번, 이름, 나이
	// 먹는다, 잠을잔다, 학교에 간다	
	
	String studentNo;
	
	public Ex51_Student(String name, int age, String studentNo) {
		super(name, age);
		this.studentNo = studentNo;
	}



	@Override
	void go() {
		System.out.println(name + " 등교한다");
		// TODO Auto-generated method stub
		
	}
	
}

package com.hanul.Inheritance;

public class Ex52_Worker extends Ex53_People{
	// 사번, 이름, 나이
	// 먹는다, 잠을잔다, 회사에 간다	
	String workNo;
	
	public Ex52_Worker(String name, int age, String workNo) {
		super(name, age);
		this.workNo = workNo;
	}



	@Override
	void go() {
		System.out.println(name + " 출근한다");
		
	}
	
}

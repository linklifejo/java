package com.hanul.object;

public class Ex38_Member {
	// 회원의 이름, 아이디, 패스워드, 폰번호, 나이
	// 회원객체를 처음 생성할때 이름, 아이디, 패스워드는 무조건 입력
	// 나머지 정보는 있으면 입력받을 수 있게 생성자를 작성하시오
	// 매소드:
	// 폰번호 변경, 패스워드 변경, 나이변경 매소드를 작성하시오
	String name, id, passwd, phoneNum;
	int age;
	
	public Ex38_Member(String name, String id, String passwd) {
		this.name = name;
		this.id = id;
		this.passwd = passwd;		
	}
	
	public Ex38_Member(String name, String id, String passwd, String phoneNum) {		
		this(name, id, passwd);
		this.phoneNum = phoneNum;
	}
	
	public Ex38_Member(String name, String id, String passwd, int age) {
		this(name, id, passwd);
		this.age = age;
	}
	
	public Ex38_Member(String name, String id, String passwd, String phoneNum, int age) {
		this(name, id, passwd);
		this.phoneNum = phoneNum;
		this.age = age;
	}
	
	void changePhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	void changePasswd(String passwd) {
		this.passwd = passwd;
	}
	
	void changeAge(int age) {
		this.age = age;
	}

}

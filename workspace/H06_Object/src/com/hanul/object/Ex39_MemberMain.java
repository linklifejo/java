package com.hanul.object;

public class Ex39_MemberMain {

	public static void main(String[] args) {

		Ex38_Member hong = new Ex38_Member("홍길동", "hanul001", "hong112");
		printMember(hong);
		//printMember(hong.name, hong.id, hong.passwd, hong.phoneNum, hong.age);
		Ex38_Member sim = new Ex38_Member
				("심청", "hanul002", "sim1234", "010-1111-2222", 21);
		printMember(sim);
		
	}
	
	static void printMember(Ex38_Member member) {
		System.out.println("이름:" + member.name);
		System.out.println("아이디:" + member.id);
		System.out.println("패스워드:" + member.passwd);
		System.out.println("전화번호:" + member.phoneNum);
		System.out.println("나이:" + member.age);
		System.out.println("-----------------------------------");
	}

}

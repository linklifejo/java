package com.hanul.pack;

import com.hanul.geometry.*;

public class Ex50_MemberMain {

	public static void main(String[] args) {

		Ex49_Member hong = new Ex49_Member("홍길동", "hanul001", "hong112");
		printMember(hong);
		//printMember(hong.name, hong.id, hong.passwd, hong.phoneNum, hong.age);
		Ex49_Member sim = new Ex49_Member
				("심청", "hanul002", "sim1234", "010-1111-2222", 21);
		printMember(sim);
		
		hong.changePhoneNum("010-2222-2222");
		hong.changePasswd("jkl4545");
		hong.changeAge(25);
		
	}
	
	static void printMember(Ex49_Member member) {
		System.out.println("이름:" + member.name);
		System.out.println("아이디:" + member.id);
		System.out.println("패스워드:" + member.passwd);
		System.out.println("전화번호:" + member.phoneNum);
		System.out.println("나이:" + member.age);
		System.out.println("-----------------------------------");
	}

}

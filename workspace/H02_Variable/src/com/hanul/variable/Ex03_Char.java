package com.hanul.variable;

public class Ex03_Char {

	public static void main(String[] args) {

		char ch1 = 'A', ch2 = '가';
		System.out.println("ch1 에 저장된 값은 " + ch1 + " 입니다");
		System.out.println("ch2 에 저장된 값은 " + ch2 + " 입니다");
		
		String str = "가나다";
		System.out.println("str 에 저장된 값은 " + str + " 입니다");
		
		System.out.println("문자 A의 정수값은 " + (int)ch1 + " 입니다");
		System.out.println("문자 가의 정수값은 " + (int)ch2 + " 입니다");
		
		System.out.println("문자 65의 문자값은 " + (char)65 + " 입니다");
		System.out.println("문자 44032의 문자값은 " + (char)44032 + " 입니다");
		
		// 이스케이프(Escape) 문자
		// 문자를 문자자체가 아니라 특정기호로 인식하게 할때 사용
		// \t(tab), \n(줄바꿈), \\(\을 그대로 사용), \'('로사용), \"("로 사용)
		System.out.println("여러분~~\n\t\"반갑습니다!\"");
		
		
	}

}

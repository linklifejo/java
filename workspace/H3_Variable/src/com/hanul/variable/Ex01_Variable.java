package com.hanul.variable;

public class Ex01_Variable {

	public static void main(String[] args) {

//		System.out.println(75);
//		System.out.println(0b1001011);
//		System.out.println(0113);
//		System.out.println(0x4b);
		// byte(1byte->8bit) : -128 ~ 127
		// short(2byte->16bit) : -32768 ~ 32757
		// int(4byte) : -2147483648 ~ 2147483647
		// long(8byte) : -9223372036854775808 ~ 9223372036854775807
		// 선언 : 데이터타입 변수명 => int num;
		int num;
		// 초기화 : 초기값을 넣어주는것
		num = 10;
		// 선언과 초기화를 같이
		int num1 = 15;
		// 여러개를 같이 쓰고자 할때
		int num2 = 21, num3 = 22, num4 = 24;
		
		System.out.println(num);
		System.out.println(num + num1);
		
		num = 15;
		System.out.println(num);
		
		char ch = 'A';
		System.out.println(ch);
		
	}

}

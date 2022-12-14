package com.hanul.variable;

public class Ex04_Double {

	public static void main(String[] args) {

		// 실수형 float(4byte), double(8byte) : 기본은 double
		// 1200000000 = 12 X 10^8
		// 0.0000000012 = 12 X 10^-10
		
		double pi = 3.14;
		System.out.println("pi값 : " + pi);
		System.out.println("pi + 1 값 : " + (pi + 1));
		
		// 논리형 boolean(1byte) : true, false 
		boolean isBreakfast = true;
		System.out.println(isBreakfast);
		boolean isLunch = false;
		System.out.println(isLunch);
		
		// 상수 Constant : 앞에 final선언 값을 바꿀수 없는것
		final double PI = 3.14;
		// PI = 3.2;
		System.out.println("원주율 : " + PI);
		
	}

}

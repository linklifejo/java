package com.hanul.method;

public class Ex25_Method02 {

	public static void main(String[] args) {

		// add(int no1, int no2), sub(int no1, int no2) 매소드
		add(10, 5);
		sub(10, 5);
		// multi에서 곱한값과 div에서 나눈값을 합해서 출력해달라
		int mul = multi(10, 5);
		System.out.printf("multi = %d\n", mul);
		int divi = div(10, 5);
		System.out.printf("div = %d\n", divi);
		System.out.println(mul + divi);
		
	}
	
	static void add(int no1, int no2) {
		int sum = no1 + no2;
		System.out.printf("sum = %d\n", sum);
		return;
	}
	
	static void sub(int no1, int no2) {
		int sum = no1 - no2;
		System.out.printf("sub = %d\n", sum);
	}
	
	static int multi(int no1, int no2) {
		int sum = no1 * no2;		
		return sum;
	}
	
	static int div(int no1, int no2) {
		int sum = no1 / no2;
		return sum;
	}

}

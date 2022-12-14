package com.hanul.control;

public class Ex09_VariableRange {

	public static void main(String[] args) {
		// 변수의 유효범위
		// 로컬변수 : 선언된 블럭안 {..}에서만 사용, 블럭을 벗어나면 메모리에서 소멸
		// 전역변수 : 클래스 안에서 다 사용가능
		int val1 = 5;
		if (val1 > 1) {
			int val2 = 10;
			System.out.println(val1);
			System.out.println(val2);
		}

		int no1 = 5;
		String result = null;
		if (no1 % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println(result);
	}

}

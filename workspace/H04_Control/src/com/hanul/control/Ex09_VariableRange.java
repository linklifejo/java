package com.hanul.control;

public class Ex09_VariableRange {

	public static void main(String[] args) {

		// 변수의 유효범위
		// 로컬변수 : 선언된 블럭안 { .. }에서만 사용, 블럭을 벗어나면 메모리에서 소멸 
		// 전역변수 : 클래스 안에서 다 사용가능
		
		int val1 = 5;
		if(val1 > 1) {
			int val2 = 10;
			System.out.println(val1);
			System.out.println(val2);
		}
		
		System.out.println(val1);
		//System.out.println(val2);
		
		int no1 = 5;
		String result = "";
		// if문을 사용하여 
		// no1이 짝수이면 result변수에 "짝수"라는 값을 넣고
		// no1이 홀수이면 result변수에 "홀수"라는 값을 넣는다
		if(no1%2 == 0) {
			result = "짝수";
		}else if(no1%2 == 1){
			result = "홀수";
		}
		System.out.println(no1 + ", " + result);
		
		
	}

}

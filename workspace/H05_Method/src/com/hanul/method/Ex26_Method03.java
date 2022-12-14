package com.hanul.method;

import java.util.Scanner;

public class Ex26_Method03 {

	public static void main(String[] args) {

		// 파라메타(매개변수)로 숫자를 받아서 그 숫자가
		// 홀수인지 짝수인지를 판단하여 문자열을 리턴하는 매소드를 선언하여 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 -> ");
		int no1 = sc.nextInt();
		
		String str = reString(no1);		
		System.out.println(str);	
		
		// 1부터 입력한 수까지의 합을 구하여 리턴하는 매소드를 구현하고 합을 출력하시오
		int sum = numAdd(no1);
		System.out.println(sum);
		
		
	}
	
	static int numAdd(int no1) {
		int sum = 0;
		
		for(int i=1; i<=no1; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

	// 짝수인지 홀수인지 판단하여 문자열을 리턴하는 매소드
	static String reString(int no1) {
		String str = "";
		if(no1%2 == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		
		return str;
	}
	
	
	

}

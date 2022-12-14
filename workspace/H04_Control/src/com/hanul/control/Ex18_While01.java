package com.hanul.control;

public class Ex18_While01 {

	public static void main(String[] args) {

		// 반복문 : 일정한 작업을 규칙적으로 반복 실행할때 
		// 똑같은 명령문을 여러번 작성하지 않고 반복문을 사용한다
		// while, do~while, for 문이 있다
		// while 문
		// Hello Java를 10번 출력하는 while문
		// 초기화식
		int cnt = 1;
		// 조건식이 참이면 실행 거짓이면 빠져나옴
		while(cnt <= 10) {
			// 실행문
			System.out.println('*');
			// 조건식을 변경시켜야 함 => 없으면 무한루프에 빠짐
			cnt++;			
		}
		
		// 1부터 10까지 출력하는 while문
		int no1 = 1;
		while(no1 < 11) {
			System.out.println(no1);
			no1++;
		}
		
		// 10부터 1까지 출력
		int no2 = 10;
		while(no1 >= 1) {
			System.out.println(no1);
			no1--;
		}
		
		// 3x1 ~ 3x6 까지 출력 
		int no3 = 1;
		while(no3 <= 6) {
			System.out.println("3 x " + no3);
			no3++;
		}
		
		// 1부터 5까지의 합을 구하는 while문 
		int cnt1 = 1;  // 1~5
		int sum = 0;  // 총합을 저장할 변수
		while(cnt1 <= 5) {
			sum = sum + cnt1;
			cnt1++;
			System.out.println(sum);
		}
		
		// 1~100 까지 합을 구하세요
		int cnt2 = 1;  // 1~100
		int sum1 = 0;  // 총합을 저장할 변수
		while(cnt2 <= 100) {
			sum1 = sum1 + cnt2;
			cnt2++;			
		}
		System.out.println(sum1);
		
	}

}

package com.hanul.control;

public class Ex18_while01 {

	public static void main(String[] args) {
		// 반복문 : 일정한 작업을 규칙적으로 반복 실행할때
		// 똑같은 명령문을 여러번 작성하지 않고 반복문을 사용한다
		// whie, do~while, for 문이 있다.
		// while 문
		// Hello Java를 10번 출력하는 while문
		// 초기화식
		int cnt = 1;
		// 조건식이 참이면 실행 거짓이면 빠져나옴
		while (cnt <= 10) {
			// 실행문
			System.out.println("Hello Java");
			// 조건식을 변경시켜야 함 => 없으면 무한루프에 빠짐
			cnt++;
		}
		// 1부터 10까지 출력하는 while문
		int no1 = 1;
		while (no1 <= 10) {
			System.out.println(no1);
			no1++;
		}

		no1 = 10;
		while (no1 >= 1) {
			System.out.println(no1);
			no1--;
		}

		cnt = 1;
		int num = 3;
		// 3의 3*1 ~ 3*6까지 출력
		while (cnt <= 6) {
			System.out.printf("%d * %d = %d\n", num, cnt, num * cnt);
			cnt++;
		}

		// 1부터 5까지 합
		int i = 1, sum = 0;
		while (i <= 100) {
			// sum = sum + i;
			sum += i;
			i++;
		}
		System.out.println("합 : " + sum);
		

	}
}

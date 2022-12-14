package com.hanul.operator;

import java.util.Scanner;

public class Ex06_Operator {
	
	public static void main(String[] args) {
		
		// 대입연산자 : =
		int no1 = 10;
		System.out.println(no1);
		
		String str = "한울직업전문학교 ~~~";
		System.out.println(str);
		
		char ch = '봄';
		System.out.println(ch);
		
		int no2 = (no1 = 5) + 10;
		System.out.println(no2);
		
		int no3 = no2 = no1;
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		
		// 산술연산자 : +, -, *(곱셈), /(나누기:몫), %(나누기:나머지)
		no2 = 7; no3 = 2;
		System.out.println(no2 + no3);
		System.out.println(no2 - no3);
		System.out.println(no2 * no3);
		System.out.println(no2 / no3);
		System.out.println(no2 % no3);
		
		double no4 = 2.0;
		no4 = no2 / no4;
		System.out.println(no4);
		
		// 사칙연산 우선순위를 인위적으로 지정하려면 ()괄호를 사용한다
		no1 = 7 / 2 + 3;
		System.out.println(no1);
		
		no1 = 7 / (2 + 3);
		System.out.println(no1);
		
		int no5 = (int)(100 + 200L);
		System.out.println(no5);
		
		byte no6 = 2, no7 = 3, no8;
		no8 = (byte)(no6 + no7);
		System.out.println(no8);
		
		// 부호연산자 : +, -
		no1 = -no1;  // -1 * no1
		no6 = (byte)+no6;  // +1 * no6
		
		// 증감(증가/감소) 연산자 : ++, --
		// ++변수 : 먼저 변수에 1을 더한후 변수를 사용
		// 변수++ : 변수가 사용된 후에 변수에 1을 더한다
		// --변수 : 먼저 변수에서 1을 감소한후 변수를 사용
		// 변수-- : 변수가 사용된 후에 변수에서 1을 감소한다
		
		int su = 5, result;
		result = ++su;
		System.out.println("result:" + result + ", su:" + su);
		result = su++;
		System.out.println("result:" + result + ", su:" + su);
		result = --su;
		System.out.println("result:" + result + ", su:" + su);
		result = su--;
		System.out.println("result:" + result + ", su:" + su);
	
		int a=1, b=3, sum;
		sum = a + ++b;
		System.out.printf("a:%d, b:%d, sum:%d \n", a, b, sum);
		
		double no9 = 123.012456;
		System.out.printf("%8.2f,  %-8.2f, %.3f \n", no9, no9, no9);
		
		// 관계(비교)연산자 : >, <, >=, <=, ==(같다), !=(같지않다)
		// boolean로 강제캐스팅되어 true, false값으로 나타난다
		System.out.println("10 > 5 ? " + (10 > 5));
		boolean isResult = (10 <= 5);
		System.out.println("10 > 5 ? " + isResult);
		isResult = (10 != 5);
		System.out.println("10 != 5 ? " + isResult);
		
		// 논리연산자 : &&(and 논리곱), ||(or 논리합), !(not)
		// && : 연산자 좌, 우 가 모두 참(true)이어야 참(true) 나머지는 거짓
		// || : 연산자 좌, 우 중 하나만 참(true)이어도 참(true) 양쪽 모두 거짓일때 거짓
		
		System.out.println(10>5 && 20>5); // T * T => T
		System.out.println(10>5 && 20<5); // T * F => F
		System.out.println(10<5 && 20>5); // F * T => F
		System.out.println(10<5 && 20<5); // F * F => F
		
		System.out.println(10>5 || 20>5); // T * T => T
		System.out.println(10>5 || 20<5); // T * F => T
		System.out.println(10<5 || 20>5); // F * T => T
		System.out.println(10<5 || 20<5); // F * F => F
		
		int num1 =5, num2=2, num3=5, num4=10;
		System.out.println((num1==num2 || num1==num3) && !(num3>num4));
		
		// 복합대입연산자 : +=, -=, *=, /=, %=
		// a = a + b => a += b 
		// a = a - b => a -= b
		// a = a / b => a /= b
		// a = a * b => a *= b
		// a = a % b => a %= b
		
		int num = 29;
		num -= 2 + 3 * 4; // num = num - (2 + 3 * 4)
		System.out.println(num);
		
		// 삼항연산자(조건연산자) : a ? b:c 
		int num5 = 10;
		System.out.println("num5 == 10 ? " + (num5 == 10 ? "참":"거짓"));
		System.out.println("num5 == 10 ? " + 
		(num5 > 10 ? "10보다 큼": num5 == 10 ? "10 과 같음": num5 < 10 ? "10보다 작음":"끝"));
		
		// 과제 : 짝수/홀수 출력하기 - 13
		// 13을 int형으로 초기화
		// 삼항연산자를 써서 짝수인지 홀수인지 출력하세요
		int num6 = 13;
		System.out.println("num5%2 == 0 ? " + (num6%2 == 0 ? "짝수":"홀수"));
		
		// 과제 : 성적에 따른 학점 출력하기
		// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 그외는 D로 출력
		// int 타입으로 jumsu 변수 78점을 초기화
//		int jumsu = 78;
//		System.out.println("학점은 ? " + 
//				(jumsu >= 90 ? "A": jumsu >= 80 ? "B": jumsu >= 70 ? "C":"D"));
//		
		// 입력 받는 class
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : ");
		/*
		 * int score = sc.nextInt();
		 * 
		 * System.out.println(score);
		 * 
		 * // 입력받은수가 짝수인지 홀수인지 출력하세요 -> 삼항연산자 
		 * System.out.println("score%2 == 0 ? " + (score%2 == 0 ? "짝수":"홀수"));
		*/
		int grade = sc.nextInt();
		System.out.println("학점은 ? " + 
				(grade >= 90 ? "A": grade >= 80 ? "B": grade >= 70 ? "C":"D"));
		
		
	}

}

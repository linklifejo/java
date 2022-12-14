package com.hanul.operator;

import java.util.Scanner;

public class Ex06_Operator {

	public static void main(String[] args) {

		// 대입연산자 : =
		int no1 = 10;
		System.out.println(no1);

		String str = "Hi~~";
		System.out.println(str);

		char ch = '봄';
		System.out.println(ch);

		// 명확성 ******** Today Point
		no1 = 5;
		int no2 = no1 + 10;
		System.out.println(no2);

		int no3 = no2 = no1;
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		
		// 산술연산자	: +, -, *, /, %
		no2 = 7; no3 = 2;
		System.out.println(no2 + no3);
		System.out.println(no2 - no3);
		System.out.println(no2 * no3);
		System.out.println(no2 / no3);
		System.out.println(no2 % no3);

		double no4 = 2.0;
	    no4 = no2 / no4;	// 묵시적형변환(int --> double)
	    System.out.println(no4);
	    
	    // 사칙연산 우선순위를 인위적으로 지정하려면 ()괄호를 사용한다.
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
	    no1 = -no1; // -1 * no1
	    no6 = (byte)+no6; // +1 * no6
	    System.out.println(no6);
	    
	    // 증감(증가 / 감소) 연산자 : ++, --
	    // ++변수 : 먼저 변수에 1을 더한후 사용이 됨
	    // 변수++ : 변수가 사용된후에 변수에 1을 더한다
        // --변수 : 먼저 변수에서 1을 감소한후ㅇ 변수를 사용
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
	    
	    int a = 1, b = 3, sum;
	    sum = a + ++b;
	    System.out.printf("a:%d, b:%d, sum:%d \n", a, b, sum);
	    
	    double no9 = 123.012456;
	    System.out.printf("%8.2f,  %-8.2f, %.3f \n", no9,no9,no9);
	    
	    // 관계(비교)연산자 : >, <, >=, <=, ==, !=
	    // boolean로 true, false값으로 나타난다
	    System.out.println("10 > 5 " + (10 > 5));
	    boolean isResult = (10 <= 5);
	    System.out.println("10 <= 5 ? " + isResult);
	    
	    isResult = (10 != 5);
	    System.out.println("10 != 5 ? " + isResult);
	    
	    // 논리연산자 : &&(and 논리곱), ||(or 논리합), !(not)
	    // && : 연산자 좌, 우 가 모두 참(true)이어야 함(true) 나머지는 거짓
	    // || : 연산자 좌, 우 중 하나만 참(true)이면 참(true) 양쪽 모두 거짓일때 거짓 
	    System.out.println(10>5 && 20>5);
	    System.out.println(10>5 && 20<5);
	    System.out.println(10<5 && 20>5);
	    System.out.println(10<5 && 20<5);
	    
	    System.out.println(10>5 || 20>5);
	    System.out.println(10>5 || 20<5);
	    System.out.println(10<5 || 20>5);
	    System.out.println(10<5 || 20<5);
	    
	    int num1 =5, num2=2,num3=5,num4=10;
	    System.out.println((num1==num2 || num1==num3) && (num3>num4));
	    
	    // 복합대입연산자 : +=, -=, *=, /=, %=
	    // a = a + b => a += b
	    // a = a - b => a -= b
	    // a = a / b => a /= b
	    // a = a * b => a *= b
	    
	    int num = 29;
	    num -= 2 + 3 * 4;
	    System.out.println(num);
	    
	    // 삼항연산자 : a ? b:c;
	    int num5 = 10;
	    System.out.println("num5 == 10 ? " + (num5 == 10 ? true:false));
	    System.out.println("num5 == 10 ? " + (num5 > 10 ? "10보다 큼":num5 == 10 ? "10 과 같음": num5 < 10 ? "10보다 작음":"끝"));
	    
	    // 과제 : 짝수/홀수 출력하기 - 13
	    // 13을 int형으로 초기화
	    // 삼항연산자를 써서 짝수인지 홀수인지 출력하세요~
		int num6 = 13;
		String check = (num6 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(check);
		
	    // 과제 : 성적에 따른 학점 출력하기
		// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 그외는 D로 출력
		// char 타입으로 grade 변수 선언
		// int 타입으로 jumsu 변수 78점을 초기화
		int jumsu = 78;
		System.out.println("학점은 ? " +
		(jumsu >= 90 ? 'A':jumsu >= 80 ? 'B': jumsu >= 70 ? 'C':'D'));
		
		// 입력 받는 class
		System.out.print("점수를 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		jumsu = sc.nextInt();
		System.out.println((jumsu >= 90 ? 'A':jumsu >= 80 ? 'B': jumsu >= 70 ? 'C':'D'));
		
	}

}

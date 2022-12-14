package com.hanul.control;

import java.util.Scanner;

public class Ex22_For01 {

	public static void main(String[] args) {
		// for문
		// for(초기화;조건식;조건증감식){ // 조건변경식
		// 실행명령문;
		// }
		// *를 10개 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.print('*');
		}
		System.out.println();

		// 1-10까지 출력하기
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println();

		// 구구단 3단을 출력하세요
		int d = 3, r = 0;
		for (int i = 1; i < 10; i++) {
			r = d * i;
			System.out.printf("%d * %d = %d \n", d, i, r);
		}

		// 1 - 10 까지의 합을 구하세요
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.printf("1부터 %d 까지 합은 %d \n", i, sum);
		}
		System.out.println("1부터 10 까지 총합은 : " + sum);

		// 1 ~ 10 까지의 숫자중 짝수만 출력
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i=3;i<4;i++) {
			System.out.println();
		}
		
		
		// 실습1
		// 1-10까지의 수 중 홀수만 출력하는 프로그램을 for문으로 작성
		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		// 실습2
		// 출력하고 싶은 구구단 수를 입력받 출력하는 프로그램을 for문으로 작성
		int num=0;
		sum=0;
		System.out.print("2단에서 9단중 출력을 원하는 단을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d \n",num,i,num*i);
		}
		// 실습3
		// 1부터 입력받은 수까지 합을 출력하는 프로그램을 for문으로 작성
		 num=0;
		 sum=0;
		System.out.print("원하는 합의 수를 입력하세요: ");
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			sum += i;
		}
		System.out.println("합 : "+ sum);
		// 실습4
		// 1부터 입력받은 수까지 중에서 3의 배수만 출력하는 프로그램을 for문으로 작성
		 num=0;
		System.out.print("3의 배수에 대한 원하는 수를 입력하세요: ");
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		sc.close();




	}

}

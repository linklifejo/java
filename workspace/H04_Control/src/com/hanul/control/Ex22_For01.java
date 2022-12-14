package com.hanul.control;

import java.util.Scanner;

public class Ex22_For01 {

	public static void main(String[] args) {

		// for문
		// for(초기화식; 조건식; 조건증감식){ // 조건변경식
		// 		실행명령문;
		// }
		// *를 10개 출력하기
		for(int i=0; i<10; i++) {
			System.out.print("*");
			if(i == 9) {
				System.out.println();
			}
		}		
		System.out.println("End!!");
		
		// 1-10까지 츨력하기
		for(int i=1; i<11; i++) {
			System.out.println(i);			
		}	
		
		// 구구단 3단을 출력하세요
		for(int i=1; i<10; i++) {
			System.out.printf("%d x %d = %d\n", 3, i, 3*i);			
		}
		
		// 1 ~ 10 까지의 합을 구하세요
		int sum = 0; // 합을 구할 변수
		for(int i=1; i<=10; i++) {
			sum = sum + i; // sum += i : 1, 3, 6, 10, 15, ...., 45, 55
			System.out.printf("1부터 %d 까지 합은 %d \n", i, sum);			
		}
		System.out.printf("1부터 10 까지 총합은 %d \n", sum);	
		
		// 1 ~ 10 까지의 숫자중 짝수만 출력 for, if
		for(int cnt=1; cnt<=10; cnt++) {
			// 만약 cnt가 짝수이면
			if(cnt%2 == 0) {
				System.out.printf("1부터 10까지의 수중에서 짝수는 %d입니다\n",cnt);
			}
		}
		
		// 실습1
		// 1-10까지의 수 중 홀수만 출력하는 프로그램을 for문으로 작성 
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		// 실습2
		// 출력하고 싶은 구구단 수를 입력받아 출력하는 프로그램을 for문으로 작성 
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇 단?");
		int dan = sc.nextInt();
		System.out.println("*** " + dan + " 단 ***");
		for (int i = 1; i < 10; i++) {
			System.out.println( dan + " × " + i + " = " + dan*i );			
		}

		// 실습3
		// 1부터 입력받은 수까지 합을 출력하는 프로그램을 for문으로 작성 
		System.out.println("수를 입력하세요");
		int no = sc.nextInt();
		int sum1 = 0;
	    for( int i=1; i<=no; i++ ){
			sum1 = sum1 + i;		// sum += i;
		}
		System.out.println( "1부터 " + no + "까지의 합 = " + sum ); 
		
		// 실습4
		// 1부터 입력받은 수까지 중에서 3의 배수만 출력하는 프로그램을 for문으로 작성 
		System.out.println("수를 입력하세요");
		no = sc.nextInt();		
		for (int i = 1; i <= no; i++) {
			if (i % 3== 0) {
				System.out.println(i);
			}
		}		
	}

}

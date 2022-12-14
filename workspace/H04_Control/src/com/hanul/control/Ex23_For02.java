package com.hanul.control;

public class Ex23_For02 {

	public static void main(String[] args) {

		// 구구단 2단 ~ 9단 중첩 for문으로 출력
		for(int dan=2; dan<10; dan++) {
			System.out.println("--------- " + dan + "단 ----------");
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}			
		}
		
		for(int dan=2; dan<10; dan++) {
			System.out.printf("--- %d단 ---\t", dan);
		}
		System.out.println();
		
		// 가로로 출력
		for(int i=0; i<10; i++) {			
			for(int dan=2; dan<10; dan++) {
				if(i==0) {
					System.out.printf("--- %d단 ---\t", dan);
				}else {
					System.out.printf("%d x %d = %d \t", dan, i, dan*i);				
				}
			}
			System.out.println();
		}
		
		// 다중 for문을 이용하여 아래와 같이 출력하세요
		// ****
		// ****
		// ****
		// ****
		// ****
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// *****
		// ****
		// ***
		// **
		// *
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// *
		// **
		// ***
		// ****
		// *****
		for(int i=1; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

package com.hanul.control;

public class Ex23_For02 {

	public static void main(String[] args) {
//		// 구구단 2단 ~ 9단 충첩for문으로 출력
//		for(int i=2;i<10;i++) {
//			System.out.printf("--- %d단---    \t",i);
//		}
//		for(int i=1;i<10;i++) {
//			for(int dan=2;dan<10;dan++) {
//				System.out.printf("%d * %d = %d \t ",dan,i,dan*i);
//			}
//			System.out.println();
//		}
//		
//		
//		// 다중for문을 이용하여 아래와 같이 출력하세요
//		for(int i=0;i<5;i++) {
//			System.out.println();
//			for(int j=0;j<4;j++) {
//				System.out.print("*");
//			}
//		}
		// *****
		// ****
		// ***
		// **
		// *
		for(int i=5;i>=1;i--) {
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<6;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

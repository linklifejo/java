package com.hanul.control;

import java.util.Scanner;

public class Ex19_DoWhile {

	public static void main(String[] args) {
		
		// do{ ~ }while(조건식); 문 : 무조건 한번은 실행한다
		// 1 ~ 10 까지 출력
		int no1 = 1; // 변하는 변수
		do {
			System.out.println(no1);
			no1++;
		}while(no1 <= 10);
		
		// 스캐너로 숫자를 입력받아 그 수가 10이상일 경우에만 
		// 빠져나오는 do ~ while문을 작성하세요
		// 10보다 작은수를 입력했을 경우에는 계속  수를 입력받게 한다
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("10 이상의 수를 입력하세요 => ");
			num = sc.nextInt();
			System.out.println(num);
		}while(num < 10);
		System.out.println("10이상의 수를 입력하셨습니다 " + num);
		sc.close();

	}

}

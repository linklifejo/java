package com.hanul.control;

import java.util.Scanner;

public class Ex10_If03 {

	public static void main(String[] args) {

		// 스캐너를 생성하여 나이를 입력받아 버스비를 계산하는 프로그램
		// 일반:20살이상-1250원 , 청소년:14살이상-800, 
		// 어린이:7살이상-400원, 유아:7살미만-0원
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 => ");
//		int age = sc.nextInt();
//		System.out.println();
//		
//		int charge = -100;    // 버스비
//		String ageGroup ="";  // 연령대
//		
//		if(age >= 20) {
//			charge = 1250;
//			ageGroup = "일반";
//		}else if(age >= 14) {
//			charge = 800;
//			ageGroup = "청소년";
//		}else if(age >= 7) {
//			charge = 400;
//			ageGroup = "어린이";
//		}else {
//			charge = 0;
//			ageGroup = "유아";
//		}
//		
//		System.out.println(age + ", " + charge + ", " + ageGroup);
//		sc.close();
		
		// 과제 1.
		// 입력한 시험점수에 따라 학점을 출력하는 프로그램을 작성하세요
		// 점수가 90점 이상이면 A학점, 80점 이상이면 B학점, 70점 이상이면 C학점, 
		// 60점 이상이면 D학점, 그외는 F학점을 출력하세요
		// 이때 학점은 char 타입 변수를 선언한 후 반드시 변수에 학점을 대입하도록 하세요
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int jumsu = sc1.nextInt();
		char grade;
		
		if(jumsu >= 90) {
			grade = 'A';
		}else if(jumsu >= 80) {
			grade = 'B';
		}else if(jumsu >= 70) {
			grade = 'C';
		}else if(jumsu >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("나의 학점은 " + grade + "입니다");
		sc1.close();
		
		// 위에서 받은 등급이 A나B이면 '상' C나D이면 '중' F이면 '하' 로 출력하세요
		char level;
		if(grade == 'A' || grade == 'B') {
			level = '상';
		}else if(grade == 'C' || grade == 'D') {
			level = '중';
		}else {
			level = '하';
		}
		System.out.println("나의 레벨은 " + level + " 입니다");
		
	}

}

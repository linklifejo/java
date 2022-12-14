package com.hanul.control;

import java.util.Scanner;

public class Ex10_if03 {
	// 일반: 20살이상-1250, 청소년: 14살이상-800, 어린이: 7살이상-400, 유아: 7살미만-0
	public static void main(String[] args) {
//
//		System.out.print("나이를 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		int charge;
//		String ageGroup;
//		if (age >= 20) {
//			charge = 1250;
//			ageGroup = "일반";
//		} else if (age >= 14) {
//			charge = 800;
//			ageGroup = "청소년";
//
//		} else if (age >= 7) {
//			charge = 400;
//			ageGroup = "어린이";
//		} else {
//			charge = 0;
//			ageGroup = "유아";
//
//		}
//		System.out.printf("%s %d세 %d원", ageGroup, age, charge);
//		sc.close();

		char grade;
		int jumsu;
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		jumsu = sc.nextInt();
		if (jumsu >= 90) {
			grade = 'A';
		} else if (jumsu >= 80) {
			grade = 'B';

		} else if (jumsu >= 70) {
			grade = 'C';
		} else if (jumsu >= 60) {
			grade = 'D';
		}

		else {
			grade = 'F';
		}
		System.out.printf("%d점 %c학점 \n", jumsu, grade);
		sc.close();

		char lavel;
		if (grade == 'A' || grade == 'B') {
			lavel = '상';
		} else if (grade == 'C' || grade == 'D') {
			lavel = '중';
		} else {
			lavel = '하';
		}
		System.out.printf("나의 레벨은 %c 입니다.",lavel);
	}
}

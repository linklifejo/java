package com.hanul.method;

public class Ex28_Method05 {

	public static void main(String[] args) {

		// 배열 - 참조형 -> String
		// 선언
		// 타입[] 변수명; 타입 변수명[] => int[] array; int array[];
		// 초기화 
		// array = new int[3];
		// int[] array = new int[3];
//		String[] arrStr = new String[3];
//		int[] arr = new int[arrStr.length];
//		int[] arr1 = {85, 90, 75};
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		for(int i=0; i<arrStr.length; i++) {
//			System.out.println(arrStr[i]);
//		}
//		
//		arr[0] = 85;
//		arr[1] = 90;
//		arr[2] = 75;
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		for(int val : arr) {
//			System.out.println(val);
//		}
//		
//		arrStr[0] = "국어";
//		arrStr[1] = "영어";
//		arrStr[2] = "수학";
//		
//		for(int i=0; i<arrStr.length; i++) {
//			System.out.println(arrStr[i]);
//		}
//		
//		for(String str : arrStr) {
//			System.out.println(str);
//		}
		
		// 학생들의 성적에 대한 평균과 학점을 출력하는 프로그램을 매소드 선언하여 사용하기
		int[] parkJumsu = {81, 84, 95};
		int[] simJumsu = {96, 92, 84, 92};
		int[] hongJumsu = {80, 76, 82};
		
		printScore(parkJumsu, "박문수");
		printScore(simJumsu, "심청");
		printScore(hongJumsu, "홍길동");
		
	}

	// 받은값:평균, 보낼값:학점
	static char gradeOfAverage(float avg) {
		char grade;
		if(avg >= 90) {
			grade = 'A';
		}else if(avg >= 80) {
			grade = 'B';
		}else if(avg >= 70) {
			grade = 'C';
		}else if(avg >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		return grade;
	}

	// 받은값:학생의점수들, 보내야할값:평균
	static float averageOfScore(int[] Jumsu) {
		float avg = 0.0f;  // 평균
		int sum = 0;     // 각 점수의 합
		for(int i=0; i<Jumsu.length; i++) {
			sum = sum + Jumsu[i];
		}
		avg = sum/(float)Jumsu.length;
		return avg;
	}
	
	static void printScore(int[] jumsu, String name) {
		// 성적 평균 구하기 매소드
		float avg = averageOfScore(jumsu);		
		// 성적 평균의 학점 구하기 매소드
		char grade = gradeOfAverage(avg);
		System.out.printf("%s의 평균은 %.2f 이고 학점은 %c 이다\n"
				, name, avg, grade);
	}
	
	

}

package com.hanul.control;

public class Ex15_Switch {

	public static void main(String[] args) {

		// switch ~ case 문 break
		// switch(기준값){ // 문자, 문자열, 정수(long 제외)
		// case 판단값1 :
		// 실행명령문1
		// break;
		// case 판단값 :
		// 실행명령문2
		// break;
		// ......
		// }
		// 홀수/짝수를 판단하는 switch문
		int no1 = 8;
		switch (no1 % 3) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
			System.out.println("xxx");
		}
	}

}

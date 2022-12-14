package com.hanul.control;

import java.util.Scanner;

public class Ex16_Switch02 {

	public static void main(String[] args) {
		// 1,2,3
		char bun;
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		System.out.print("몇월 입니까?");
		switch (mon) {
		case 1:
		case 2:
		case 3:
			bun = '1';
			break;
		case 4:
		case 5:
		case 6:
			bun = '2';
			break;
		case 7:
		case 8:
		case 9:
			bun = '3';
			break;
		case 10:
		case 11:
		case 12:
			bun = '4';
			break;
		}
	}

}

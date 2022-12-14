package com.hanul.control;

import java.util.Random;

public class Ex21_SiRoPaWhile {

	public static void main(String[] args) {
		int scissors = 0, rock = 1, paper = 2;
		String result = " ";
		Random r = new Random();
		int userNum = 0, computerNum = 0;
		System.out.println("유저와 컴퓨터간 가위 바위 보 게임입니다.");
		do {
			// 가위:0, 바위:1, 보:2
			userNum = r.nextInt(3);
			computerNum = r.nextInt(3);
//		System.out.flush();
			// 먼저 유저와 컴퓨터가 각각 랜덤수를 받는다
			// 유저가 이기는 경우는
			// 유저:가위 컴퓨터:보,유저:바위 컴퓨터:가,유저:보 컴퓨터:바위
			// 유저와 컴퓨터가 같은경우 비기고
			// 나머지는 유저가 진다
		} while (userNum == computerNum);
		
		if ((userNum == scissors && computerNum == paper) || (userNum == rock && computerNum == scissors)
				|| (userNum == paper && computerNum == rock)) {
			result = "유저 승리입니다.";
		} else {
			result = "컴퓨터 승리입니다.";
		}
		System.out.println("결과는 " + result);
	}

}

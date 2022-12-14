package com.hanul.control;

import java.util.Random;

public class Ex12_RockScissorsPaper {

	public static void main(String[] args) {
		// 가위:0, 바위:1, 보:2
		int scissors = 0, rock = 1, paper = 2;
		String result;
		Random r = new Random();
		System.out.println("유저와 컴퓨터간 가위 바위 보 게임입니다.");
		int userNum = r.nextInt(3);
		int computerNum = r.nextInt(3);
		// 먼저 유저와 컴퓨터가 각각 랜덤수를 받는다
		// 유저가 이기는 경우는
		// 유저:가위 컴퓨터:보,유저:바위 컴퓨터:가,유저:보 컴퓨터:바위
		// 유저와 컴퓨터가 같은경우 비기고
		// 나머지는 유저가 진다
		if ((userNum == scissors && computerNum == paper) 
				|| (userNum == rock && computerNum == scissors)
				|| (userNum == paper && computerNum == rock)) {
			result = "유저 승리입니다.";
		} else if (userNum == computerNum) {
			result = "비겼습니다";
		} else {
			result = "컴퓨터 승리입니다.";
		}
		System.out.println("결과는 " + result);
	}

}

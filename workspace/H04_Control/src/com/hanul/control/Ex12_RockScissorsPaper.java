package com.hanul.control;

import java.util.Random;

public class Ex12_RockScissorsPaper {

	public static void main(String[] args) {
		
		// 가위:0, 바위:1, 보:2
		int scissors = 0, rock = 1, paper = 2;
		Random r = new Random();
		
		System.out.println("가위 바위 보 !!");
		
		int user = 0, computer = 0;
		// 먼저 유저와 컴퓨터가 각각 랜덤수를 받는다
		do {
			user = r.nextInt(3);
			computer = r.nextInt(3);	
			System.out.println("user : " + user +", computer : " +computer);
		}while(user == computer);
		// 유저가 이기는 경우는 
		// 유저:가위 컴퓨터:보, 	유저:바위 컴퓨터:가위, 유저:보 컴퓨터:바위
		// 유저와 컴퓨터가 같은경우 비기고
		// 나머지는 유저가 진다
		if((user == scissors && computer == paper) 
				|| (user == rock && computer == scissors) 
				|| (user == paper && computer == rock)) {
			System.out.println("user win !!!");
		}else {
			System.out.println("computer win !!!");
		}

	}

}

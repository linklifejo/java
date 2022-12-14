package com.hanul.control;

import java.util.Random;

public class Ex20_DiceWhile {

	public static void main(String[] args) {
		int user = 0,computer = 0;
		String check = " ";
		Random r = new Random();
		System.out.println("주사위를 던지세요~~");
		do {
			// 랜덤한 수를 발생시키는 클래스 : Rnadom - 주사위게임
//			Random r = new Random();
//			int num = r.nextInt(100); // 0 ~ 99 까지 랜덤한 수를 생성한다.
//			System.out.println("랜덤수 : " + num);
			//r.nextInt(6);  // 0 ~ 5 까지 6경우의 수가 나온다
			user = r.nextInt(6) +  1;
			computer = r.nextInt(6) +  1;
			System.out.printf("사용자 %d, 컴퓨터 %d \n", user, computer);
			if(user > computer) {
				check = "유저 승";
			}else if(user < computer) {
				check = "컴퓨터 승";
			}else {
				System.out.flush();
				System.out.println("주사위를 던지세요~~");
			}
		}while(user == computer);
		System.out.printf("%s 입니다.",check);

	}

}

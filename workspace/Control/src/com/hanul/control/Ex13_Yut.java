package com.hanul.control;

import java.util.Random;

public class Ex13_Yut {

	public static void main(String[] args) {
		// 윷을 던져 결과를 출력
		// 앞 : 1, 뒤 : 0
		// 도 : 앞뒤뒤뒤-1, 개:앞앞뒤뒤-2, 걸:앞앞앞뒤-3, 윷: 앞앞앞앞-4 모: 뒤뒤뒤뒤-0
		// 4개의 윷 숫자를 받는다
		// 각 윷의 숫자를 더해서 1이면 도 2이면 개 3이면 걸 4이면 윷 0 모
		int yut,bar1,bar2,bar3,bar4;
		char result = ' ';
		Random r = new Random();
		 bar1 = r.nextInt(2);
		 bar2 = r.nextInt(2);
		 bar3 = r.nextInt(2);
		 bar4 = r.nextInt(2);
		 System.out.println("" + bar1 + bar2 + bar3 + bar4);
		yut = bar1 + bar2 + bar3 + bar4;
		if (yut == 1) {
			result = '도';
		} else if (yut == 2) {
			result = '개';
		} else if (yut == 3) {
			result = '걸';
		} else if (yut == 4) {
			result = '윷';
		} else if(yut == 0)  {
			result = '모';
		}
		
		System.out.printf("결과는 : %c ", result);

	}

}

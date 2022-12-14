package com.hanul.control;

public class Ex07_if01 {

	public static void main(String[] args) {
		// if만 사용 if(조건식) : 조건식이 참이면 실행
		// if와 else 사용 : 조건식이 참이면 if문실행 아니면 else문 실행
		// if와 else if와 ... else를 사용 :
		int no1 = 15;
		int no2 = 10;

		if (no1 > no2) {
			System.out.printf("%d 가 %d보다 더 큰수 \n", no1, no2);

		} else {
			System.out.printf("%d 가 %d보다 더 크거나 같은수 \n", no2, no1);

		}
//		if(no1 <= no2 ) {
//			System.out.printf("%d 가 %d보다 더 크거나 같은수 \n", no2, no1);
//		}

//		int dadAge = 54, momAge = 56;
//
//		if (dadAge > momAge) {
//			System.out.printf("아빠나이 %d이 엄마 나이%d 보다 %d살 많다.\n", dadAge, momAge, dadAge - momAge);
//
//		} else if (momAge > dadAge) {
//			System.out.printf("엄마나이 %d이 아빠 나이%d 보다 %d살 많다. \n", momAge, dadAge, momAge - dadAge);
//		} else {
//			System.out.println("두분 나이가 같다.");
//
//		}

		int even = 50, odd = 51;
		if (even % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}

		if (odd % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}

		// 택시를 타려면 돈이 3300원 이상 있어야합니다.
		// 집에서 학교까지 택시를 타면 15분이 걸리고 버스를 타면 30분이 걸립니다.
		// 지각을 12번이상을 하면 수당을 못 받는다
		// 나는 지금 11번 지각을 했다
		int myMoney = 200;
		int arrivedTime;
		int late = 11;
		int busMoney = 1250, taxiMoney = 4200;
		if (myMoney >= taxiMoney) {
			System.out.println("택시를 탑니다.");
			arrivedTime = 15;
			myMoney = myMoney - taxiMoney;
		} else if (myMoney >= busMoney) {
			System.out.println("버스를 탑니다.");
			arrivedTime = 30;
			myMoney = myMoney - busMoney;
			late++;
		} else {
			System.out.println("걸어서 갑니다");
			arrivedTime = 60;
			late++;
		}

		if (late >= 12) {
			System.out.println("앗~~ 수당을 못받네;;;;;;");
		} else {
			System.out.println("받아라 수당 ==> 감사!!!!!");
		}
		
		System.out.println(myMoney + ", " + arrivedTime + ", " + late);
		
		
		
		int dadAge = 54, momAge = 56;

		if (dadAge > momAge) {
			System.out.printf("아빠나이 %d이 엄마 나이%d 보다 %d살 많다.\n", dadAge, momAge, dadAge - momAge);

		} else {
			if (momAge > dadAge) {
				System.out.printf("엄마나이 %d이 아빠 나이%d 보다 %d살 많다. \n", momAge, dadAge, momAge - dadAge);
			} else {
				System.out.println("두분 나이가 같다.");

			}
		}
	}
}

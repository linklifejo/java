package com.hanul.control;

public class Ex07_If01 {

	public static void main(String[] args) {

		// if만 사용 if(조건식) : 조건식이 참이면 실행
		// if와 else 사용 : 조건식이 참이면 if문실행 아니면 else문 실행
		// if와 else if와 ... else를 사용
		
		int no1 = 15, no2 = 10;
		if(no1 > no2) {
			System.out.printf("%d 가 %d보다 더 큰수 \n", no1, no2);
		}else {
			System.out.printf("%d 가 %d보다 더 크거나 같은수 \n", no2, no1);
		}
		
//		int dadAge = 54, momAge = 56;
//		// 만약에 아빠나이가 엄마나이보다 많으면 if()
//		if(dadAge > momAge) {
//			System.out.println("아빠나이가 엄마나이보다 많다. 아빠나이 : " + dadAge);
//		// 만약에 엄마나이가 아빠나이보다 많으면 else if()	
//		}else if(dadAge < momAge) {
//			System.out.printf("엄마나이 %d가 아빠나이 %d 보다 많다.", momAge, dadAge);
//		// 같으면 else	
//		}else {
//			System.out.println("엄마나이가 아빠나이가 같다");
//		}
		
		int even = 50, odd = 51;
		// even이라는 수가 짝수인지 홀수인지 판단하여 출력하는 프로그램을 작성하시오
		if(even%2 == 0) {
			System.out.println("짝수입니다");
		}else if(even%2 == 1) {
			System.out.println("홀수입니다");			
		}
		
		if(odd%2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");			
		}
		
		// 택시를 타려면 돈이 3300원 이상 있어야합니다
		// 집에서 한울까지 택시를 타면 15분이 걸리고 버스를 타면 30분이 걸립니다
		// 지각을 12번이상을 하면 수당을 못 받는다
		// 나는 지금 11번 지각을 했다
		
		int myMoney = 200;
		int arrivedTime;
		int late = 11;  // 지각까지 남은 시간 : 25분
		int busMoney = 1250, taxiMoney = 4200;		
		
		if(myMoney >= 4200) {
			System.out.println("택시를 탄다");
			arrivedTime = 15;
			myMoney = myMoney - taxiMoney;
		}else if(myMoney >= 1250){
			System.out.println("버스를 탄다");	
			arrivedTime = 30;
			// 지각을 했으니 late(지각변수)에 1을 더한다
			//++late; late++; late += 1; late = late + 1;
			late++;
			myMoney = myMoney - busMoney;
		}else {
			System.out.println("뚜벅이 -> 걸어서 간다");
			arrivedTime = 60;
			late++;
		} // if
		System.out.println(myMoney +", " + arrivedTime + ", " + late);
		
		// 지각이 12번 이상이면 수당이 지급되지 않는다고 출력하시오
		if(late >= 12) {
			System.out.println("수당지급 않됨");
		}else { // late < 12
			System.out.println("수당지급됨");			
		}
		
		// if문 안에 if문을 작성할수 있다
		int dadAge = 56, momAge = 56;
		
		if(dadAge > momAge) {
			System.out.println("아빠나이가 엄마나이보다 많다. 아빠나이 : " + dadAge);		
		}else {
			if(dadAge < momAge) {
				System.out.println("엄마나이가 아빠나이보다 많다. 엄마나이 : " + momAge);
			}else {
				System.out.println("엄마나이가 아빠나이가 같다.");	
			} // if(dadAge < momAge)
		} // if(dadAge > momAge)

		
	}

}

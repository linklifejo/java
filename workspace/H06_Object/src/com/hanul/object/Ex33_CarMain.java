package com.hanul.object;

public class Ex33_CarMain {

	public static void main(String[] args) {

		// 김현식 소유의 QM3 차종 객체를 생성하고 
		// 시동을 켜고 엑셀을 4번 밟고 밟을때마다 속도를 출력하고
		// 브레이크를 4번 밟고 밟을때마다 속도를 출력하세요
		// 시동을 끄세요
		Ex32_Car kim = new Ex32_Car();
		kim.owner = "김현식";
		kim.modelName = "QM3";
		
		kim.start();
		kim.stepAccel();
		System.out.println(kim.speed);
		kim.stepAccel();
		System.out.println(kim.speed);
		kim.stepAccel();
		System.out.println(kim.speed);
		kim.stepAccel();
		System.out.println(kim.speed);
		
		kim.stepBreak();
		System.out.println(kim.speed);
		kim.stepBreak();
		System.out.println(kim.speed);
		kim.stepBreak();
		System.out.println(kim.speed);
		kim.stepBreak();
		System.out.println(kim.speed);
		kim.stop();
	}

	
	
}

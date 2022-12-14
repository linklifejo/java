package com.hanul.pack;

import com.hanul.geometry.Ex47_Circle;

public class Ex48_CircleMain {

	public static void main(String[] args) {
		// 정보은닉 : 같은 패키지 안에서도 데이터를 수정하지 못하도록 방어
		
		// 반지름이 15 인 원의 객체 생성
		// 그 객체의 원의 넓이를 구해서
		// 반지름과 원의 넓이를 출력하시오
		Ex47_Circle cir1 = null;
		try {
			cir1 = new Ex47_Circle(15);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		// cir1에 대한 반지름 접근
		int ra1 = cir1.getRadius();
		// cir1에 대한 원의 넓이
		double area1 = cir1.getArea();
		// cir1에 대한 원의 둘레
		double round1 = cir1.getRoundLength();
		
		System.out.println(ra1 + "," + area1);				
				
		
		
	}

}

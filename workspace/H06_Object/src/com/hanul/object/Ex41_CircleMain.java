package com.hanul.object;

public class Ex41_CircleMain {

	public static void main(String[] args) {
		// 정보은닉 : 같은 패키지 안에서도 데이터를 수정하지 못하도록 방어
		
		// 반지름이 15 인 원의 객체 생성
		// 그 객체의 원의 넓이를 구해서
		// 반지름과 원의 넓이를 출력하시오
		Ex40_Circle cir1 = null;
		try {
			cir1 = new Ex40_Circle(15);
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
				
		// 반지름이 3 인 원의 객체 생성
		// 그 객체의 원의 넓이를 구해서
		// 반지름과 원의 넓이, 원의 둘레를 출력하시오
		Ex40_Circle cir2 = null;
		try {
			cir2 = new Ex40_Circle(3);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// cir2에 대한 반지름 접근
		int ra2 = cir2.getRadius();
		// cir2에 대한 원의 넓이
		double area2 = cir2.getArea();
		// cir2에 대한 원의 둘레
		double round2 = cir2.getRoundLength();
		
		System.out.println(ra2 + "," + area2  + "," + round2);
		
		// // cir2에 대한 원의 반지름을 재설정
		try {
			cir2.setRadius(8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ra2 = cir2.getRadius();
		// cir2에 대한 원의 넓이
		area2 = cir2.getArea();
		// cir2에 대한 원의 둘레
		round2 = cir2.getRoundLength();
		
		System.out.println(ra2 + "," + area2  + "," + round2);
		
		try {
			cir2.setRadius(-5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ra2 = cir2.getRadius();
		// cir2에 대한 원의 넓이
		area2 = cir2.getArea();
		// cir2에 대한 원의 둘레
		round2 = cir2.getRoundLength();
		
	}

}

package com.hanul.object;

public class Ex40_Circle {

	// 원 클래스
	// 반지름 데이터, 넓이를 구하는 기능, 원의 둘레를 구하는 기능
	private int radius;
	
	// 생성자
	public Ex40_Circle(int radius) throws Exception{
		if(radius < 0) {
			throw new Exception("생성자:길이가 0보다 커야 됩니다"); 
		}
		this.radius = radius;
	}
	
	// 원의 반지름을 가져올수 있는 매소드를 생성
	int getRadius(){
		return this.radius;
	}
	
	// 원의 반지름을 셋팅 있는 매소드를 생성
	void setRadius(int radius) throws Exception{
		if(radius < 0) {
			throw new Exception("길이가 0보다 커야 됩니다"); 
		}
		this.radius = radius;
	}
	
	// 원 넓이 구하는 공식 : 2 x 3.14 x 반지름 
	double getArea() {
		return 2*3.14*radius;
	}
	
	double getRoundLength() {
		return 3.14*radius*radius;
	}
	
}

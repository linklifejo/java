package com.hanul.mini;

public class MINI_CircleMain {

	public static void main(String[] args) {
     MINI_Circle cir = new MINI_Circle(7);
     printCircle(cir);
	}
static void printCircle(MINI_Circle cir) {
	System.out.println("반지름: " + cir.getRadius());
	System.out.println("원의넓이: " + cir.getCircleAdd());
}
}

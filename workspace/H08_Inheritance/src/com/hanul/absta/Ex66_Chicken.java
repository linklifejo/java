package com.hanul.absta;

public class Ex66_Chicken extends Ex63_Animal{

	public Ex66_Chicken(String kind) {
		super(kind);
	}
	
	@Override
	void sound() {
		System.out.println(kind + " 가 꼬끼오라고 운다");
	}
	

}

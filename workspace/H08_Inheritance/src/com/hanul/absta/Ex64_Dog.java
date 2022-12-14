package com.hanul.absta;

public class Ex64_Dog extends Ex63_Animal{

	public Ex64_Dog(String kind) {
		super(kind);
	}
	
	@Override
	void sound() {
		System.out.println(kind + " 가 멍멍이라 짖는다");
	}
	

}

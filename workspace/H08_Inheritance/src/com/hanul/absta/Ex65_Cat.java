package com.hanul.absta;

public class Ex65_Cat extends Ex63_Animal{

	public Ex65_Cat(String kind) {
		super(kind);
	}
	
	@Override
	void sound() {
		System.out.println(kind + " 가 야옹야옹 운다");
	}
	

}

package com.hanul.animal;

public class Ex61_Bird extends Ex59_Animal{

	public Ex61_Bird(String kind) {
		super(kind);
	}	
	
	@Override
	void doWhat() {
		System.out.println(kind + " 가 난다");
	}
	
}

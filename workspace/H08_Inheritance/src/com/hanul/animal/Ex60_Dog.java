package com.hanul.animal;

public class Ex60_Dog extends Ex59_Animal{

	public Ex60_Dog(String kind) {
		super(kind);
	}

	@Override
	void doWhat() {
		System.out.println(kind + " 가 달린다");		
	}
	

}

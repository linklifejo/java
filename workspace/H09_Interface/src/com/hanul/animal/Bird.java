package com.hanul.animal;

public class Bird extends Animal implements IAnimal{

	public Bird(String kind) {
		super(kind);
	}

	@Override
	public	void doWhat() {
		System.out.println(kind + " 가 난다");		
	}
	
	

	
}

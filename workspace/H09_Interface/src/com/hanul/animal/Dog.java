package com.hanul.animal;

public class Dog extends Animal implements IAnimal{

	public Dog(String kind) {
		super(kind);
	}

	@Override
	public void doWhat() {
		System.out.println(kind + " 가 달린다");	
		
	}


	

}

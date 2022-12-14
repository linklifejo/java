package com.hanul.animal;

abstract public class Ex59_Animal {

	String kind;

	public Ex59_Animal(String kind) {
		this.kind = kind;
	}
	
	void eat() {
		System.out.println(kind + " 먹는다");
	}
	
	void sleep() {
		System.out.println(kind + " 잠잔다");
	}	
	
	// 비슷한 일을 추상매소드로 선언하고 구현하지 않는다
	abstract void doWhat();
	
}

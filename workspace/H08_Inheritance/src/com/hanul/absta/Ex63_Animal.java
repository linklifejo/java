package com.hanul.absta;

abstract public class Ex63_Animal {

	String kind;

	public Ex63_Animal(String kind) {
		this.kind = kind;
	}
	
	void eat() {
		System.out.println(kind + " 먹는다");
	}
	
	void sleep() {
		System.out.println(kind + " 잠잔다");
	}
	
	abstract void sound();
	
}

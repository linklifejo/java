package com.hanul.animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog("바둑이");
		dog.eat();
		dog.sleep();
		dog.doWhat();
		
		Bird bird = new Bird("부엉이");
		bird.eat();
		bird.sleep();
		bird.doWhat();
		
	}
	
}

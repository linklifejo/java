package com.hanul.abst;

import com.hanul.animal.Ex60_Dog;

public class Ex67_AnimalMain {

	public static void main(String[] args) {
        Ex64_Dog dog = new Ex64_Dog("바둑이");
        dog.eat();
        dog.sleep();
        dog.cry();
        dog.doWhat();
        Ex65_Cat cat = new Ex65_Cat("나비");
        cat.eat();
        cat.sleep();
        cat.cry();
        cat.doWhat();
        Ex66_Chicken ch = new Ex66_Chicken("라즈베리");
        ch.eat();
        ch.sleep();
        ch.cry();
        ch.doWhat();

	}

}

package com.hanul.Inheritance;

public class Ex54_PeopleMain {

	public static void main(String[] args) {
		
		Ex51_Student hong = new Ex51_Student("홍길동", 32, "20220001");
		hong.eat();
		hong.sleep();
		hong.go();
		
		System.out.printf("%s 의 나이는 %d 이고 학번은 %s 입니다\n", 
				hong.name, hong.age, hong.studentNo);
		
		Ex52_Worker jeun = new Ex52_Worker("전우치", 36, "hanul220003");
		jeun.eat();
		jeun.sleep();
		jeun.go();
		System.out.printf("%s 의 나이는 %d 이고 사번은 %s 입니다\n", 
				jeun.name, jeun.age, jeun.workNo);
		
	}

}

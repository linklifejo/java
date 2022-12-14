package com.hanul.interfac;

public interface IShape {
	// 1. 선언은 class가 아니라 interface로 시작한다
	// 2. 추상메소드와 상수필드만 선언할수 있다
	//    public abstract를 명시하지 않아도 컴파일러가 자동으로 지정한다
	// 3. 생성자를 가질수 없고 인터페이스 역시 추상임을 알수있다
	// 4. 선언된 메소드는 반드시 오버라이드 해야 한다 그리고 public으로 선언한다
	// 5. 서브클래스(자식클래스)는 implements를 이용하여 인터페이스를 구현하다
	//    class 클래스명 implements 인터페이스명
	// 6. 클래스는 인터페이스를 다중구현 할수 있다
	//    class 클래스명 implements 인터페이스명1,인터페이스명2.....
	// 7. 서브클래스가 클래스상속과 인터페이스를 동시에 구현하고자 할때는 상속 먼저 지정한다
	//    class 클래스명 extends 슈퍼클래스명 implements 인터페이스명
	// 8. 인터페이스는 인터페이스를 다중상속 할수 있다
	//    interface 인터페이스명 extends 인터페이스명1,인터페이스명2
	public void getArea();
	public void getAround();
	}

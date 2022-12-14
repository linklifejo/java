package com.hanul.method;

public class Ex24_Method01 {

	// 클래스의 구성요소는 필드, 매소드, 생성자 이다
	// 매소드란 클래스가 가지고 있는 데이터(변수,필드)를 
	// 어떻게 처리할것이지에 대한 기능적인 부분을 담당한다
	
	public static void main(String[] args) {

		// 접근제한자 : public, protected, default, private 
		//			   => 여기서는 public : 접근제한이 없다 => 아무데서나 호출할수 있다	
		// 지정 예약어 : static 
		// 리턴타입 : void => 넘겨주는게 없다
		//			int => int형을 넘겨준다 , String => String를 넘겨준다
		//			즉 어떤타입이든 넘길수 있고 넘겨받는곳에서는 반드시 같은 타입으로 받아야한다
		// 매소드명(매개변수:파라메타) : main 매소드는 문자열배열 타입의 매개변수를 갖는 형태로
		// 정해져 있지만 일반적인 매소드는 매개변수가 있을수도 없을수도 있다
		// 기본적인 매소드의 정의는 
		// 리턴타입 + 매소드명(매개변수){....}		
		
		printCharacter();
		System.out.println("Hello Hanul !!!");
		printCharacter();
		
		printCharPara('#');
		System.out.println("Hello Hanul !!!");
		printCharPara('$');
		
		printCharParaCnt('&', 15);
		System.out.println("Hello Hanul !!!");
		printCharParaCnt('@', 10);
		
		printCharParaCnt(15, '&');
		System.out.println("Hello JAVA !!!");
		printCharParaCnt(10, '@');
	}
	
	// 문자를 출력하는 매소드를 만든다
	static void printCharacter() {
		for(int i=0; i<13; i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	
	static void printCharPara(char ch) {
		for(int i=0; i<13; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	static void printCharParaCnt(char ch, int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	static void printCharParaCnt(int cnt, char ch) {
		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}

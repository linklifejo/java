package com.hanul.object;

public class Ex30_PiggyBank {

	// 클래스 : 변수(필드, 멤버변수), 매소드, 생성자(나중에)
	// 돼지저금통의 특징은 주인이 누구, 총액이 얼마 => 데이터:변수(필드)
	// 행위는 돈을 넣는다, 돈을 빼낸다   => 매소드
	// 데이터 : 타입,      변수
	// 주인  : String    owner
	// 총액  :  int      total
	// 행위       :   리턴타입,   매소드 이름(파라메터1, 파라메터2, ...)
	// 돈을 넣는다  :    int     inputMoney(int money)
	// 돈을 빼낸다  :    int     outputMoney(int money)
	
	String owner;
	int total;
	
	int inputMoney(int money) {
		total += money;
		return total;
	}
	
	int outputputMoney(int money) {
		total -= money;
		return total;
	}
	
}

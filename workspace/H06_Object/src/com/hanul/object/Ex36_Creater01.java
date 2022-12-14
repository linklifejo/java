package com.hanul.object;

public class Ex36_Creater01 {
	// 클래스 구성요소
	// 필드, 매소드, 생성자
	// 생성자는 객체를 생성할때 필드에 값을 주면서 생성
	// 1. 생성자는 클래스안에 선언 
	// 2. 생성자명은 클래스명과 동일
	// 3. 리턴타입이 없는 매소드 형식이다
		
		String owner;
		int total;
		
		// 생성자
		Ex36_Creater01(){ }	
		
		// 자신의 클래스를 가리키는 예약어 this
		Ex36_Creater01(String owner, int total){
			this.owner = owner;
			this.total = total;			
		}
		
		int inputMoney(int money) {
			total += money;
			return total;
		}
		
		int outputputMoney(int money) {
			total -= money;
			return total;
		}
		
}

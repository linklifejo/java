package com.hanul.reference;

public class Ex68_String {

	public static void main(String[] args) {
		// 레퍼런스 타입은 new 라는 키워드로 객체생성을 하고 사용
		// 하지만 String타입은 객체생성없이 인스턴스화 되었고 마치 프리미티브 타입처럼 사용
		// 그 이유는 너무 많이 사용하기 때문에 내부적으로 처리를 해줌
		// 
		String str1 = "안녕";
		String str2 = "안녕";
		if(str1==str2) {
			System.out.println("같은 인스턴스");
		}
		else {
			System.out.println("다른 인스턴스");
		}
		String str3= new String("안녕");
		String str4= new String("안녕");
		// 시작주소 비교
		if(str3==str4) {
			System.out.println("같은 인스턴스");
		}
		else {
			System.out.println("다른 인스턴스");
		}
		// 내용 비교
		if(str3.equals(str4)) {
			System.out.println("같은 내용");
		}
		else {
			System.out.println("다른 내용");
		}
		str1 += "여러분";
		if(str1==str2) {
			System.out.println("같은 인스턴스");
		}
		else {
			System.out.println("다른 인스턴스");
		}
		// 내용 비교 : trim() -> 좌우 공백을 없애준다
		if(str3.trim().equals(str4.trim())) {
			System.out.println("같은 내용");
		}
		else {
			System.out.println("다른 내용");
		}

	}

}

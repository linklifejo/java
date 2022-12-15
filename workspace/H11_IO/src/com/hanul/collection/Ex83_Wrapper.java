package com.hanul.collection;

public class Ex83_Wrapper {

	public static void main(String[] args) {
		// 기본데터타입(프리미티브타입)의 값을 감싼 형태로 객체를 생성해서
		// 사용하게 만드는 클래스가 있는데 이러한 클래스를 Wapper 클래스라 한다
		// 프리미티브타입  : byte, short, int, long, char, float, double, boolean
		// Wrapper클래스 : Byte, Short, Integer, Long, Character, Float, Double, Boolean
		Byte data1 = new Byte((byte)12);
		Integer data2 = new Integer(20000);
		Double data3 = new Double(3.14);
		Character data4 = new Character('봄');
		Boolean data5 = new Boolean(true);
		byte data10 = data1.byteValue();
		System.out.println(data10);
		int data11 = data2.intValue();
		// 박싱/언박싱
		// 문자열 : 레퍼런스타입, 숫자 : 프리미티브타입 => 형변환 안됨
		// 따라서 숫자를 Wrapper클래스로 변경하여 사용
		// int a = (int)str1 -> x
		String str1 = "123", str2 ="321";
		int no1 = Integer.parseInt(str1);
		int no2 = Integer.parseInt(str2);
		System.out.println(no1+no2);
		// int -> String 형으로 변환
		String str3 = String.valueOf(no1);
		String str4 = String.valueOf(no2);
		System.out.println(str3+str4);
		
	}

}

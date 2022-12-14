package com.hanul.variable;

public class Ex02_Number {

	public static void main(String[] args) {
		// byte(1byte->8bit) : -128 ~ 127
		// short(2byte->16bit) : -32768 ~ 32757
		// int(4byte) : -2147483648 ~ 2147483647
		// long(8byte) : -9223372036854775808 ~ 9223372036854775807
		
		
		byte no1 = -128;
//		byte no2 = 128;
		
		short no3 = 10000;
		int no4 = 1234567890;
		long no5 = 1234567890;
		long no6 = 12345678900L;
		
		int no7 = 800, no8 = 900;
		int sum = no7 + no8;
		System.out.println(sum);
		
		int no9 = 123, no10;
		no10 = no8;
		System.out.println(no10);
	}

}

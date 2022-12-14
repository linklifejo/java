package com.hanul.reference;

public class Ex69_String2 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍 입문  ";
		int leng = str.length();
		System.out.println(leng);
		// 문자열을 잘라서 일부를 리턴해주는 메소드 : substring()
//		String str1 = str.substring(3,8);
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i + 1));
		}
//		System.out.println(str1);
//		int[] arr = {10,11,12,13,15};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		
		// 문자열 연결 메소드 : concat()
		String str5 = "  Do it";
		str5 = str5.concat(str);
		System.out.println(str5.trim());
		// 영문자에 대한 대/소문자화 메소드 : toUpperCase()/toLowerCase()
		System.out.println(str5.toUpperCase());
		// 문자열 변경 메소드 : replace(기존문자열, 변경할 문자열)
		String str6 = "Hi Hanul";
		str6 = str6.replace("Hi", "Hello");
		System.out.println(str6);

		str6 = str6.replace('H', 'A');
		System.out.println(str6);
		// 위의 것들을 한줄로
		String str7 = " Hi Hanul ";
		str7 = str7.replace("Hi", "Hello").replace('H', 'A').substring(0, 10).trim();
		System.out.println(str7);
		// 문자열에서 특정 문자열의 시작위치의 인덱스를 리턴하는 메소드
		// indexOf(), lastIndexOf()
		String str8 = "문자열에서 특정 문자나 문자열이 있는 시작위치를 리턴";
		// 왼쪽부터 시작해서 "문자열" 이라는 문자열의 시작위치
		System.out.println(str8.indexOf("문자열"));
		// 오른쪽부터 시작해서 "문자" 이라는 문자열의 시작위치
		System.out.println(str8.lastIndexOf("문자"));

		// 특정위치(왼쪽6위치)에서부터 "문자" 이라는 문자열의 시작위치
		System.out.println(str8.indexOf("문자", 6));
		String str9 = "안녕 나는 홍길동이야";
		String[] arr1 = str9.split("");
		for (String str1 : arr1) {
			System.out.println(str1);

		}
	}
}

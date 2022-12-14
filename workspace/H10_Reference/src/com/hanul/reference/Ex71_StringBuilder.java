package com.hanul.reference;

public class Ex71_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("여러분");
		sb.append("안녕");
		sb.append("~");
		System.out.println(sb);
	}

}

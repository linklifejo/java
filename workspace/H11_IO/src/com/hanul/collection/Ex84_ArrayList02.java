package com.hanul.collection;

import java.util.ArrayList;

public class Ex84_ArrayList02 {

	public static void main(String[] args) {
		// 모든 자료구조는 레퍼런스타입만 저장할수 있으므로
		// 동일한 데이타의 중복저장이되고, 자동으로 사이즈가 커진다
		// 속도는 빠르다
		// 데이타베이스에서 가져온 데이타를 사용할때 ==> 주로 조회용으로 사용 되는 경우 중요*****
		// 프리미티브타입의 데이터를 자료구조에 저장할때는 Wrapper클래스를 사용한다
		ArrayList<Integer> list = new ArrayList<>();
		Integer a = new Integer(10);
		list.add(a);
		list.add(new Integer(20));
		int b = 25; // int타입이 Integer타입으로 AutoBoxing 됨
		list.add(a);
		list.add(30);
		for(int aa : list) {
			System.out.println(aa + " ");
		}
		System.out.println();
	}

}

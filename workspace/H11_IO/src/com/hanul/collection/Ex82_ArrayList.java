package com.hanul.collection;

import java.util.ArrayList;

public class Ex82_ArrayList {

	public static void main(String[] args) {
		// 자료구조
		// 여러 데이터타입을 모아둔 데이터 그룹으로 데이터의 검색, 추가, 삭제, 변경이
		// 가능하도록 만들어진 논리적인 구조
		// 필드의 데이터 타입을 클래스 선언시 결정하지 않고 객체생성시 결정한다
		// ArrayList<E>,HashMap<K,V>
		// 디폴트로 10개의 저장공간이 생긴다. 더 필요하면 알아서 크기를 키워준다
		// 선언 new
		ArrayList<String> list = new ArrayList<String>();
		// 저장 : add()
		list.add("배");  // list의 0번째 삽입
		list.add("사과");  // list의 1번째 삽입
		list.add("귤");  // list의 2번째 삽입
		list.add("수박");  // list의 3번째 삽입
		list.add("파인애플");  // list의 4번째 삽입
		// 리스트에 데이타가 몇개인지 -> size()
		System.out.println(list.size());
		// 조회 : get(인덱스)
		// 
		printList(list);
		// 삽입 저장 : add(삽입할 인덱스,데이터)
		list.add(1,"바나나");
		printList(list);
		// 변경 저장 : set(변경할 인덱스,변경할 데이터)
		list.set(4, "감");
		printList(list);
		// 삭제 : remove(삭제할 인덱스),remove(삭제할 값)
		list.remove(2);
		list.remove("파인애플");
		printList(list);
		// 데이터의 위치 찾기 : indexOf(데이터)
		int idx = list.indexOf("귤");
		System.out.println(idx);
		list.add("배");
		printList(list);
		idx = list.lastIndexOf("배");
		System.out.println(idx);
		
	}
	static void printList(ArrayList<String> list) {
		for(int i=0; i<list.size();i++) {
			String fruit = list.get(i);
			System.out.print(i + ":" + fruit + "\t");
		}
		System.out.println();
		
	}

}

package com.hanul.collection;

import java.util.HashMap;

public class Ex85_HashMap {

	public static void main(String[] args) {
		// HashMap<Key,Value> 형태로 저장
		// 저장공간을 key별로 구분하여 저장하기때문에 접근속도가 빠르다
		HashMap<String,Integer> map = new HashMap<>();
		//HashMap<String,Integer> map = new HashMap<>(30); 저장공간 제한
		// 데이타 저장 : put(키,데이터), 이름, 영어점수
		map.put("홍길동", 88);
		map.put("심청", 90);
		map.put("전우치", 88);
		map.put("박문수", 98);
		// 데이터 조회 : get(키값)
		int score = map.get("심청");
		System.out.println(score);
		// 데이터 삭제 : remove(키값)
		map.remove("전우치");
		score = map.get("전우치");
		//System.out.println(score); => null : error
		
	}

}

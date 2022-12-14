package com.hanul.object;

public class Ex46_SingleTon {
	// 싱클톤 : 공유영역에 한개만 인스턴스를 생성
	private static Ex46_SingleTon instance;

	private   Ex46_SingleTon() {
	}

	static Ex46_SingleTon getInstance() {
		if (instance == null) {
			instance = new Ex46_SingleTon();
		}
		return instance;
	}

}

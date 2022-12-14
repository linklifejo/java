package com.hanul.abst;

public class Ex65_Cat extends Ex63_Animal {
	Ex65_Cat(String kind){
		super(kind);
	}
	public void cry() {
		System.out.println(kind + " 야옹야옹 운다");	 
		 }
	@Override
	void doWhat() {
		System.out.println(kind + " 달린다");	 
		// TODO Auto-generated method stub
		
	}
}

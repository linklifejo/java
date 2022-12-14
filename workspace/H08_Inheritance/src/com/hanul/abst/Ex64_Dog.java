package com.hanul.abst;

public class Ex64_Dog extends Ex63_Animal{
	Ex64_Dog(String kind){
		super(kind);
	}
	public void cry() {
		System.out.println(kind + " 멍멍 운다");	 
		 }
	void doWhat() {
		System.out.println(kind + " 달린다");	 
		
	}
}

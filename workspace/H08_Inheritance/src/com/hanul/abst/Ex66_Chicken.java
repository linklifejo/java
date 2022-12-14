package com.hanul.abst;

public class Ex66_Chicken extends Ex63_Animal{
	Ex66_Chicken(String kind){
		super(kind);
	}	
	public void cry() {
		System.out.println(kind + " 꼬끼오 운다");	 
		 }
	@Override
	void doWhat() {
		System.out.println(kind + " 달린다");	 
		// TODO Auto-generated method stub
		
	}
}

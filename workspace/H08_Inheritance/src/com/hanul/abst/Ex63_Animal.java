package com.hanul.abst;

abstract class Ex63_Animal {
 protected String kind;
 
 public Ex63_Animal(String kind) {
	this.kind = kind;
}
public String getKind() {
	return kind;
}
public void setKind(String kind) {
	this.kind = kind;
}
public void eat() {
System.out.println(kind + " 먹는다");	 
 }
public void cry() {
System.out.println(kind + " 운다");	 
 }
public void sleep() {
	 
	System.out.println(kind +" 잠을잔다");	 
 }
abstract void doWhat();

}

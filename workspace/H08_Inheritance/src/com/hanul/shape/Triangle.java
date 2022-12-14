package com.hanul.shape;

public class Triangle extends Shape {
int base;

@Override
int getArea() {
	return (base * height)/2;
}

public Triangle(int height, int base) {
	super(height);
	this.base = base;
}

public int getBase() {
	return base;
}

public void setBase(int base) {
	this.base = base;
}
}

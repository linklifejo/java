package com.hanul.shape;

abstract public class Shape {
	int height;

	abstract int getArea();

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Shape(int height) {
		this.height = height;
	}
}

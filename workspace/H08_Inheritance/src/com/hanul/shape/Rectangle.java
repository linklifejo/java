package com.hanul.shape;

public class Rectangle extends Shape {
	int width;

	@Override
	int getArea() {
		return width * height;
	}

	public Rectangle(int height, int width) {
		super(height);
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}

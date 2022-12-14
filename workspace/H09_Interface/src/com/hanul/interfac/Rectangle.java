package com.hanul.interfac;

public class Rectangle extends Shape implements IShape {

	int width;

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
	@Override
	public void getArea() {
     System.out.printf("높이 %d 밑변 %d인 직각사각형의 넓이는 %d 이다\n",
    		 height, width, (width + height)
    		 );
	}

	@Override
	public void getAround() {
	     System.out.printf("높이 %d 밑변 %d인 직각사각형의 둘레는 %d 이다\n",
	    		 height, width, (width + height)*2
	    		 );
	}

}

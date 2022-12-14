package com.hanul.interfac;

public class Triangle extends Shape implements IShape {
	int width;

	public Triangle(int height, int width) {
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
     System.out.printf("높이 %d 밑변 %d인 직각삼각형의 넓이는 %.2f 이다\n",
    		 height, width, (width + height)
    		 + (width*width) / (double)2);
	}


	@Override
	public void getAround() {
	     System.out.printf("높이 %d 밑변 %d인 직각삼각형의 둘레는 %.2f 이다\n",
	    		 height, width, (width + height)
	    		 + Math.sqrt(width*width + height*height));
	}

}

package com.hanul.shape;

public class ShapeMain {

	public static void main(String[] args) {
     Rectangle r = new Rectangle(3,4);
     System.out.println("사각형 넓이 :" + r.getArea());
     
     Triangle t = new Triangle(3,4);
     System.out.println("삼각형 넓이 :" + t.getArea());
     Shape r2 = new Rectangle2(3,4);
     System.out.println("다형성 사각형 넓이 :" + r2.getArea());
     Shape r3 = new Rectangle(3,4);
     System.out.println("다형성 사각형 넓이 :" + r3.getArea());
     Shape r4 = new Triangle(3,4);
     System.out.println("다형성 사각형 넓이 :" + r4.getArea());

	}

}

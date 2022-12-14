package com.hanul.object;

public class Ex41_CicleMain {

	public static void main(String[] args) 
		{
			// 정보은닉
		    // 반지름이 15 인 원의 객체 생성
			// 그 객체의 원의 넓이를 구해서
			// 반지름과 원의 넓이를 출력하시오
			Ex40_Circle c1=null;
				try {
					c1 = new Ex40_Circle(15);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			double a1 =c1.getArea();
			System.out.printf("반지름%d, %.02f\n",c1.getRadius(),a1);
			// 반지름이 3 인 원의 객체 생성
			// 그 객체의 원의 넓이를 구해서
			// 반지름과 원의 넓이, 원의 둘레를 출력하시오
			Ex40_Circle c2=null;
			try {
				c2 = new Ex40_Circle(3);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double a2=c2.getArea();
			System.out.printf("반지름%d, %.02f\n",c2.getRadius(),a2);
		    
		}

}

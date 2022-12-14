package com.hanul.method;

import java.util.Scanner;

public class Ex27_Method04 {

	public static void main(String[] args) {
		
		// 실습1
		// Scanner로 두 수를 입력받아 곱셈연산을 한 결과와 나눗셈 연산을 한 결과를
		// 리턴하는 매소드를 만들어 그 결과들을 더하고(변수 sum) 뺀(변수 sub) 경우를
		// 변수에 입력하여 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 -> ");
		int no1 = sc.nextInt();
		System.out.println("숫자를 입력하세요 -> ");
		int no2 = sc.nextInt();
		int mul = multi(no1, no2);
		double divi = div(no1, no2);
		double sum = mul + divi;
		double sub = mul - divi;
		System.out.printf("%d 에서 %.2f 를 더한값은 %.2f 이고 뺀값은 %.2f 이다\n",
				mul, divi, sum, sub);
		
		// 실습2
		// 위에서 입력받은 두 수로 더 작은수에서 더 큰수까지 누적합을 구한 결과값을 리턴하는 
		// 매소드를 만들고 메인에서 그 수를 출력하는 프로그램을 작성하시오
		// 예) 큰수 v1 = 25, 작은수 v2 = 10 일때 위치 바꾸는 방법
		// if(v1 > v2){
		// 		int tmp = v1;
		//		v1 = v2;
		//		v2 = tmp;
		// }
		
		int hap = numHap(no1, no2);
		System.out.println("두수 사이의 숫자의 합은 : " + hap);

	}
	
	static int numHap(int no1, int no2) {
		// no1과 no2중 no1이 크다면 자리를 바꿔준다
		int sum = 0;
		if(no1 > no2) {
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
		for(int i=no1; i<=no2; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

	static int multi(int no1, int no2) {	
		
		return no1 * no2;
	}
	
	static double div (int no1, int no2) {	
		
		return no1 / (double)no2;
	}
	

}

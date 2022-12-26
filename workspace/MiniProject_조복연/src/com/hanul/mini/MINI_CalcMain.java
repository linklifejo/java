package com.hanul.mini;

public class MINI_CalcMain {

	public static void main(String[] args) {
		int result=0;
		int a = 5; int b = 4;

    MINI_Cal ca = new MINI_Cal();
    result = ca.add(a,b);
    printCal("더하기",result);
    result = ca.sub(a,b);
    printCal("빼기",result);
    result = ca.mul(a,b);
    printCal("곱하기",result);
    result = ca.div(a,b);
    printCal("나누기",result);
    

	}
static void printCal(String str,int result) {
	System.out.println(str + ": " + result);
}
}

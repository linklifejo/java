package com.hanul.reference;

public class Ex70_Homework {

	public static void main(String[] args) {
//		[과제] 다음의 이메일 주소에 대해서 for 문으로 아이디와 이메일서비스를 분류해서 출력하세요.
//		String email[] = { "hong1234@naver.com", "park901031@hanmail.net", "jeon@daum.net" };
//		출력결과)  이메일: hong1234@naver.com
//			 아이디 : hong2021
//		              이메일서비스: naver.com
		//str8.indexOf("문자열") .substring(0,10).trim()
		
		int ch,ch_last,ch_first;
		String email[] = { "hong1234@naver.com", "park901031@hanmail.net", "jeon@daum.net" };
		for(String str : email) {
		 ch=	str.indexOf("@");
		 ch_last= ch-1;
		 ch_first=ch+1;
		 System.out.println("아이디:     " + str.substring(0, ch_last));
		 System.out.println("이메일서비스: " + str.substring(ch_first));
		 System.out.println("------------------------------------");
		}
	}

}

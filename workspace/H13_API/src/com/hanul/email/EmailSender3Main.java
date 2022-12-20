package com.hanul.email;

public class EmailSender3Main {

	public static void main(String[] args) {
		// 이메일 전송 클래스
		EmailSender3 sender = new EmailSender3("linklife@naver.com","456852aa**","관리자");
//		sender.sendSimple("linklife@naver.com","조복연");
		sender.sendHtml("linklife@naver.com","조복연");	// TODO Auto-generated method stub

	}

}

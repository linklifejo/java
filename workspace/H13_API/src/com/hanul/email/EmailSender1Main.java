package com.hanul.email;

import java.io.BufferedReader;
import java.io.FileReader;

public class EmailSender1Main {

	public static void main(String[] args) {
		// 이메일 전송 클래스
		EmailSender1 sender = new EmailSender1("linklife@naver.com","456852aa**","관리자");
//		sender.sendSimple("linklife@naver.com","조복연");
		sender.sendAttach("linklife@naver.com","조복연");

	}

}

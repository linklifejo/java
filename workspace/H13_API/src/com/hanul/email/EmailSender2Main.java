package com.hanul.email;

import java.io.BufferedReader;
import java.io.FileReader;

public class EmailSender2Main {

	public static void main(String[] args) {
		// 이메일 전송 클래스
		EmailSender1 sender = new EmailSender1("linklife@naver.com","456852aa**","관리자");
		BufferedReader in = null;
		String filename="list.txt";
		try {
			in = new BufferedReader(new FileReader(filename));
			String data;
			String[] s= {};
			while((data=in.readLine())!=null) {
				s = data.split(",");
				sender.sendSimple(s[3].trim(),s[0].trim());
				
			}

		} catch (Exception e) {
		}finally {
			try {
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

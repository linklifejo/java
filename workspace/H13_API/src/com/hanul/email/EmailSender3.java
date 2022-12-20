package com.hanul.email;

import java.net.URL;
import java.util.ArrayList;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender3 {
	
	private String emailAddress, password, sendName; // 메일 보내는 관리자 정보

	public EmailSender3(String emailAddress, String password, String sendName) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
		this.sendName = sendName;
	}
	
	// 메일 받는 사람 정보
	void sendSimple(String email, String arriveName) {
		
		// 기본 메일 객체 생성
		SimpleEmail mail = new SimpleEmail();
		// 이메일을 보내는 사람의 메일 서버 지정 : smtp.naver.com, smtp.gmail.com
		mail.setHostName("smtp." + emailAddress
				.substring(emailAddress.indexOf("@") + 1));
		mail.setCharset("utf-8");
		// 메일 전송처리 확인을 위한 로그출력 지정
		mail.setDebug(true);
		// 로그인하기 위한 아이디/비번을 지정:보내는 사람 메일의 인증 id와 비번 지정
		mail.setAuthentication(emailAddress, password);
		mail.setSSLOnConnect(true);
		
		try {
			// 메일 보낼사람 지정 : 송신인 메일주소를 full로 지정해야함		
			mail.setFrom(emailAddress, this.sendName);
			// mail.setFrom("eyedial@naver.com", "관리자");
			// 메일 받을사람 지정 : 수신인 지정 -> 여러명에게 보낼땐 addTo만 추가
			mail.addTo(email, arriveName);
			// mail.addTo("eyedial333@gmail.com", "조순섭");
			// 메일 제목, 내용
			mail.setSubject("생일 축하 메세지");
			mail.setMsg(arriveName + "님! 생일을 축하합니다.\n생일 쿠폰이 "
					+ "발급 되었으니\n당사 사이트 쿠폰함을 확인하세요");
			// 메일 전송버튼 클릭
			mail.send();
			
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// 첨부파일이 있는 이메일 전송 메소드
	void sendAttach(String email, String arriveName) {
		
		MultiPartEmail mail = new MultiPartEmail();
		mail.setHostName("smtp." + emailAddress
				.substring(emailAddress.indexOf("@") + 1));
		mail.setCharset("utf-8");
		// 메일 전송처리 확인을 위한 로그출력 지정
		mail.setDebug(true);
		// 로그인하기 위한 아이디/비번을 지정:보내는 사람 메일의 인증 id와 비번 지정
		mail.setAuthentication(emailAddress, password);
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom(emailAddress, this.sendName);
			mail.addTo(email, arriveName);
			
			mail.setSubject("생일 축하 메세지 - 첨부파일 확인요망");
			mail.setMsg(arriveName + "님! 생일을 축하합니다.\n생일 쿠폰이 "
					+ "발급 되었으니\n당사 사이트 쿠폰함을 확인하세요");
			// 파일 첨부하기 : 첨부파일 객체 생성
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_JAVA\\content\\list.txt");
			mail.attach(file);
			// 첨부할 파일마다 첨부파일 객체를 생성한다
			// URL을 통해 파일 첨부하기 : setPath() 대신 setURL() 매소드 사용
			file = new EmailAttachment();
			file.setURL(new URL("https://www.lifewire.com/thmb/0VQWHr3kGUIq57dtJFrFhEOz9zI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/png-file-photos-app-5b75972f46e0fb002c692c03.png"));
			mail.attach(file);
			
			mail.send();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void sendHtml(String email, String arriveName) {

		// Html형식의 내용 이메일 전송
		HtmlEmail mail = new HtmlEmail();
		mail.setHostName("smtp."+ emailAddress.substring(emailAddress.indexOf("@")+1) ); 
		mail.setCharset("utf-8");
		mail.setDebug(true);

		mail.setAuthentication(emailAddress, password);
		mail.setSSLOnConnect(true);

		try {
			mail.setFrom(emailAddress, this.sendName);		
			mail.addTo(email, arriveName);
			mail.setSubject("생일 축하 메시지");

			StringBuffer msg = new StringBuffer();
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<h2>생일 축하</h2><hr>");
			msg.append(arriveName + "님! 생일을 축하합니다");
			msg.append("<p>생일 쿠폰이 발급되었으니</p>");
			msg.append("<p>당사 사이트 쿠폰함을 확인하세요</p>");
			msg.append("</body>");
			msg.append("</html>");
			mail.setHtmlMsg( msg.toString() );

			EmailAttachment file = new EmailAttachment();
			file.setURL(new URL("http://hanuledu.co.kr/data/menu/075399.jpg"));
			mail.attach(file);

			file = new EmailAttachment();
			file.setPath( "D:\\Study_Java\\workspace\\15.API\\src\\test.java" );
			mail.attach(file);

			mail.send();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}

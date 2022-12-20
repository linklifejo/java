package com.hanul.email;

import org.apache.commons.mail.SimpleEmail;

public class EmailSender2 {
    // 이메일 전송 클래스
	// 1. 프로젝트에 lib폴더를 만든다
	// 2. javax.mail.jar, common-email-1.5.jar,activation-1.1.jar
	// 3. 위의 3개의 파일을 다운로드 받아서 lib폴더에 넣는다
	// 3-1. BuidPath에 들어가서 Add External Jars..에 3개 파일추가
	// 4. 송신할 메일의 환경설정에서 SMTP 사용을 설정해야 한다
	//    naver -> 하단 환경설정 -> POP3/IMAP 설정-> POP3/SMTP 사용함으로 선택
	//    gmail -> 상단 환경설정 -> 전달 및 POP3/IMAP -> IMAP 액세스:IMAP 사용으로 선택
	//             상단 내계정 -> 로그인 및 보안 -> 맨아래 연결된
	//             -> 보안수준이 낮은 앱 허용: 사용
	// Common Email API는 메일 발송을 처리해주는 SimpleEmail, HtmlEmail과 같은
	// 클래스를 제공하고 있으며 이들 클래스를 사용하여 일반 텍스트 메일, HTML메일,
	// 첨부메일 등을 매우 간단하게 발송할 수 있다
	private String emailAddress, password,sendName; // 메일 보내는 관리자 정보

	public EmailSender2(String emailAddress, String password, String sendName) {
		this.emailAddress = emailAddress;
		this.password = password;
		this.sendName = sendName;
	}
	// 메일 받는 사람 정보
	void sendSimple(String email, String arriveName) {
		// 기본 메일 객체 생성
		SimpleEmail mail = new SimpleEmail();
		// 이메일을 보내는 사람의 메일 서버 지정 : stmp.naver.com, stmp.gmail.com
		mail.setHostName("smtp." + emailAddress
				.substring(emailAddress.indexOf("@") +1));
		mail.setCharset("utf-8");
		// 메일 전송처리 확인을 위한 로그출력 지정
		//mail.setDebug(true);
		// 로그인하기 위한 아이디/비번을 지정:보내는 사람 메일의 인증 id와 비번 지정
		mail.setAuthentication(emailAddress,password);
		mail.setSSLOnConnect(true);
		try {
			// 메일 보낼사람 지정 : 송신인 메일주소를 full로 지정해야함
			mail.setFrom(emailAddress,this.sendName);
			// 메일 받을사람 지정 : 수신인 지정 -> 여러명에게 보낼땐 addTo만 추가
			mail.addTo(email,arriveName);
			// mail.addTo("메일주소","조순섭");
			// 메일 제목, 내용
			mail.setSubject("생일 축하 메세지");
			mail.setMsg(arriveName + "님 생일을 축하합니다.\n 생일 쿠폰이"
				+ "발급 되었으니\n당사 사이트 쿠폰함을 확인하세요"	);
			mail.send();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}

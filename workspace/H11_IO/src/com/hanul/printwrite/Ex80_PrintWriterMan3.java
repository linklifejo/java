package com.hanul.printwrite;

import java.io.File;
import java.io.PrintWriter;

public class Ex80_PrintWriterMan3 {

	public static void main(String[] args) {
		File dir = new File("src/printwrite");
		if(!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(dir + "/" + "student.html");
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>학생 명단</h1>");
			writer.println("<table border='1'>");
			writer.println("<tr><th>성별</th><th>연락처</th><th>이메일</th></tr>");
			writer.println("<tr><td>홍길도</td>");
			writer.println("<tr>");
			writer.println("<th>성별</th><td>남</td>");
			writer.println("<th>연락처</th><td>00-00-00</td>");
			writer.println("<th>이메일</th><td>hanul@naver.com</td>");
			writer.println("<th>성명</th><td>성명</td>");
			writer.println("</tr>");
			writer.println("<body/>");
			writer.println("<html/>");
		} catch (Exception e) {
		}
		finally {
			writer.close();
		}
	}

}

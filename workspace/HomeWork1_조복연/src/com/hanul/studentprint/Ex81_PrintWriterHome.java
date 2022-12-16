package com.hanul.studentprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Ex81_PrintWriterHome {

	public static void main(String[] args) {
		//[과제]
		// printwrite 패키지에서 studentlist.txt 파일을 만들어서 패키지에 붙여넣는다.
		// 파일형태는 성명, 성별, 연락처, 이메일

		// 1. 문자열 22 개를 저장할  배열변수를 선언한다.
		// 2. BufferedReader 클래스를 사용해 studentlist.txt 파일에서 
		//		데이터를 한 줄씩 읽어온(readline()) 후 
		//   읽어온 데이터를 그대로 선언한 배열변수에 저장한다.
		// 3. 문자열 배열변수에 담긴 학생목록을 표의 형식으로 출력되게 
		//   src/printwrite/list.html 파일로 저장한다.
		File dir = new File("src/printwrite");
		if(!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
//		String[] source= {"","","","","","","","","","",""};
		String[] source= new String[10];
		PrintWriter writer = null;
		BufferedReader in = null;
		String filename="studentlist.txt";
		try {
			in = new BufferedReader(new FileReader(filename));
			int i=0;
			String str = " ";
			while((str=in.readLine())!=null && str.length()!=0) {
			    source[i] = str;
			    i++;
			}
		} catch (Exception e) {
		}finally {
			try {
				in.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		try {
			
			writer = new PrintWriter(dir + "/" + "list.html");
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>학생 명단</h1>");
			writer.println("<table border='1'>");
			writer.println("<tr><th>이름</th><th>성별</th><th>연락처</th><th>이메일</th></tr>");
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(String ch : source) {
			String[] printData= ch.split(",");
			try {
				writer.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>\n"
						, printData[0], printData[1], printData[2], printData[3]);
			} catch (Exception e) {
			}
		}
		writer.println("</table>");
		writer.println("<body/>");
		writer.println("<html/>");
		writer.close();
	}

}

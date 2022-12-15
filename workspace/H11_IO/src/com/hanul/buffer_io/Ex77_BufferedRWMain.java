package com.hanul.buffer_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex77_BufferedRWMain {

	public static void main(String[] args) {
		String path = "src/buffer_io";
		File dir = new File(path);
		if(!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
		// 날짜형태로 하위 디렉토리를 만들어야 하는 경우
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String today = sdf.format(new Date());
		File filepath3 = new File("D:/Study_JAVA/workspace/H11_IO/src/" + today);
		if(!filepath3.exists() || !filepath3.isDirectory()) {
			filepath3.mkdirs();
		}
		
		String filename = filepath3 + "/buffered.dat";
		// 쓰기
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter(filename));
//			char data[] = {'안','녕','\n'};
			String data ="안녕하세요\n홍길동 입니다\n";
			out.write(data);
			out.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				out.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));
			int data;
			in.
//			data = (char)in.read();
//			System.out.println(data + " ");
			while((data = in.read()) != -1) {
				System.out.print((char)data + " ");
			}
		} catch (Exception e) {
		}finally {
			try {
				in.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}

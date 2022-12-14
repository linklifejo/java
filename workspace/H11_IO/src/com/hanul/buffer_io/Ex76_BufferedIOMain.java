package com.hanul.buffer_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex76_BufferedIOMain {

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
		BufferedOutputStream out = null;
		try {
			out = new BufferedOutputStream(new FileOutputStream(filename));
			byte data[] = {10,20,30,40,50,60,70,80,90,100,110,120};
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
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(filename));
			byte data;
			while((data = (byte)in.read()) != -1) {
				System.out.println(data + " ");
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

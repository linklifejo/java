package com.hanul.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex72_FileReader {
// 프로젝트파일 디렉토리에 텍스트 파일을 생성해야한다
	public static void main(String[] args) throws FileNotFoundException {
		// 문자타입 읽고 쓰기
		FileReader reader = null;
		try {
			reader = new FileReader("reader.txt");
			while(true) {
				int data = reader.read();
				if(data==-1) break;
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

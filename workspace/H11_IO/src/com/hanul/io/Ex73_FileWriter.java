package com.hanul.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex73_FileWriter {

	public static void main(String[] args) {
		try {
			String data ="자바 프로그래밍 전문가";
			FileWriter writer = new FileWriter("output.txt");
			writer.write(data);
			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		FileReader reader = null;
		try {
			reader = new FileReader("output.txt");
			while(true) {
				int data = reader.read();
				if(data==-1) break;
				System.out.print((char)data);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
	
		
	}
	}
}
package com.hanul.byte_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex74_OutputMain01 {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("output.dat");
			byte[] data = {0,1,2,3,4,5,6,7,8,9};
			out.write(data);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		try {
			FileInputStream in = new FileInputStream("output.dat");
			int data ;
			while((data = in.read()) != -1) {
				System.out.print(data);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}

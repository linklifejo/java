package com.hanul.byte_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex75_ByteIOMain {

	public static void main(String[] args) {
		System.out.print("단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
		try {
			FileOutputStream out = new FileOutputStream(dan + "단.dat");
			byte[] data= {0,0,0,0,0,0,0,0,0};
			for(int i=0;i<9;i++) {
				data[i] = (byte)(dan * (i+1));
			}
			out.write(data);
			out.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		try {
			FileInputStream in = new FileInputStream(dan +"단.dat");
			int data ;
			while((data = in.read()) != -1) {
				System.out.println(data);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}

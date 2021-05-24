package com.acte.io;

import java.io.*;

public class BufferedOutputStreamExample {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout = new FileOutputStream("D:\\Training\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to BufferedOutputStreamExample.";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush(); // Manual Flush
		bout.close();
		fout.close();
		System.out.println("write using BufferedOutputStream success");
	}
}
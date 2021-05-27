package com.acte.io;

import java.io.*;  
public class BufferedWriterExample {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:\\\\Training\\\\testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to Bufferedwriter Example.");  
    buffer.close();  
    System.out.println("Write complete");  
    }  
}  
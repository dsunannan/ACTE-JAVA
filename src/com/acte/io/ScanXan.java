package com.acte.io;

import java.io.*;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;
      

        try {
            s = new Scanner(new BufferedReader(new FileReader("D:\\Training\\assignment1.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
       
        
     }
}
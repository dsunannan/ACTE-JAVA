package com.acte.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByte {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D:/Training/assignment1.txt");
            out = new FileOutputStream("D:\\Training\\Byteio.txt");
            int c;  
            // variable C is 8 bit, Since IO is a byte operation.
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

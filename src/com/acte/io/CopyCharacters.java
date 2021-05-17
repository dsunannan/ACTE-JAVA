package com.acte.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;
              // Please change the drive folder values, If you don't have D:/ training folder..
        try {
            inputStream = new FileReader("D:\\Training\\assignment1.txt");
            outputStream = new FileWriter("D:\\Training\\characteroutput.txt");

            int c; // variable C is 16 bit 
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

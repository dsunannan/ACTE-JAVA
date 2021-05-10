package com.acte.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
* CheckedException example
*
*/
public class CheckedException {
    public static void main(String[] args) {
        File file = new File("C:/training/JavaFileRead.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            while (fis.read()!=-1){
                System.out.println(fis.read());
            }
        }catch (FileNotFoundException e){
        	System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
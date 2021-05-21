package com.acte.collections.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an array of strings
        String a[] = new String[]{"abc","klm","xyz","pqr"};
        
        List<String> liststrArr= Arrays.asList(a);
        System.out.println("String list before shuffle->"+liststrArr);
        Collections.shuffle(liststrArr);
        System.out.println("String list after shuffle->"+liststrArr);
	}

}

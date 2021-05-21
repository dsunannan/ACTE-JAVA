package com.acte.collections.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class DataManupulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an array of strings
        String a[] = new String[]{"abc","klm","xyz","pqr"};
        String b[] = new String[]{"Amber","Chocka","Sundar","Najeeb"};
        
        List<String> liststrArr= Arrays.asList(a);
        List<String> liststrBrr= Arrays.asList(b);
        
        System.out.println("String list->"+liststrArr);
        Collections.reverse(liststrArr);
        System.out.println("String list after reverse ->"+liststrArr);
        Collections.fill(liststrArr, "Amber N");
        
        System.out.println("String list after fill->"+liststrArr);
        
        Collections.copy(liststrArr, liststrBrr);
        
        String teama[] = new String[]{"Sachin","Afridi","Sehwag","Imran"};
        
        String teamb[] = new String[]{"Kohli","Babar","Sohail","Inzi"};
        
        List<String> liststrtArr= Arrays.asList(teama);
        List<String> liststrtBrr= Arrays.asList(teamb);
        
        System.out.println("Teamb before replacement->"+liststrtBrr);
        
        Collections.copy(liststrtBrr, liststrtArr);
        
        System.out.println("Teamb after replacement->"+liststrtBrr);
        
        Collections.swap(liststrtBrr, 1, 2);
        
        System.out.println("Teamb after swap->"+liststrtBrr);
        
         Collections.swap(liststrtBrr, 0, 3);
        
        System.out.println("Teamb after swap again->"+liststrtBrr);
        
        //Implement addAll
        
        
	}

}

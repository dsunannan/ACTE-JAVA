package com.acte.collections.algorithms;

import java.util.*;

/*1. Write a program to store array of 10 elements.
and print the smallest and biggest values in the int array.*/

public class Sort {
    public static void main(String[] args) {
    	
    	// create an array of strings
        String a[] = new String[]{"abc","klm","xyz","pqr"};
        
     // create an array of int
        Integer iArr[] = new Integer[]{11,4,35,17,8,35,10,1};
        
        Integer jArr[] = new Integer[]{100};
        
        List<String> list = Arrays.asList(a);
        Collections.sort(list);
        System.out.println("String list->"+list);
       
        System.out.println("String min->"+ Collections.min(list));
        System.out.println("String min->"+ Collections.max(list));
        
        // sorting array
        Arrays.sort(iArr);
   
     

        // let us print all the elements available in list
        System.out.println("The sorted int array is:");
        for (int number : iArr) {
           System.out.println("Number = " + number);
        }
        
        
        System.out.println("MIN of int array is:"+ Collections.min(Arrays.asList(iArr)));
        System.out.println("MAX of int array is:"+Collections.max(Arrays.asList(iArr)));
        
        // To check how many times an element is repeated in a collection
       int freq_int= Collections.frequency(Arrays.asList(iArr), 35);
       
       System.out.println("Frequency of the element "+ freq_int);
       
       // To check if there is any element that are common between the 2 collections
       boolean disjoint_boolean= 
    		   Collections.disjoint(Arrays.asList(iArr),Arrays.asList(jArr));
       
       System.out.println("Collections have disjoint element "+ disjoint_boolean);
    }
}
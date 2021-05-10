package com.acte.collections.algorithms;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create an array of int
        Integer iArr[] = new Integer[]{11,4,35,17,8,35,10,1};
        //sort it before calling binary search
        Collections.sort(Arrays.asList(iArr));
        
        for (int number : iArr) {
            System.out.println("Number = " + number);
         }
        
        int i=35;
        //Apply binary search to find the key element
        int i_found= Collections.binarySearch(Arrays.asList(iArr), i);
        
        System.out.println("Item found"+i+" is found :"+i_found);
	}

}

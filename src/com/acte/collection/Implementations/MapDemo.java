package com.acte.collection.Implementations;

import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> mapStr= new HashMap<String,String>();
		
		mapStr.put("9912121212", "A");
		mapStr.put("9912121213", "B");
		mapStr.put("9912121214", "C");
		
		Set setlist= mapStr.entrySet();
		
		System.out.println(setlist.toString());
		
		
	}

}

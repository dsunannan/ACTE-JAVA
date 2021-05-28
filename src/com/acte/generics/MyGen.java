package com.acte.generics;


import java.util.*;
class MyGen<T>{  
	ArrayList<T> obj= new ArrayList<T>();

	void add(T obj){this.obj.add(obj);}  
	ArrayList<T> get(){

		return obj;
	}  
	
	@SafeVarargs
	public static <T> List<T> list( final T... items )
	{
	    return Arrays.asList( items );
	}

}  


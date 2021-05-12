package com.acte.concurrency2;

public class DemoImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableRGB imobj = new ImmutableRGB(2,3,4,"TestRGB1");
		
		ImmutableRGB imobj2 = new ImmutableRGB(6,5,4,"TestRGB2");
		
		ImmutableRGB imobj3 = new ImmutableRGB(100,254,4,"TestRGB3");
		
		System.out.println("Immutable Object "+imobj.getName()+" "+imobj.getRGB());
		System.out.println("Immutable Object "+imobj2.getName()+" "+imobj2.getRGB());
		System.out.println("Immutable Object "+imobj3.getName()+" "+imobj3.getRGB());

	}

}

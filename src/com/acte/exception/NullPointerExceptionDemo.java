package com.acte.exception;

class CalcualtorApp {
	private String s_concat;

	public String addStrings(String firstName, String lastName) {
		 try {
		s_concat = firstName + lastName.charAt(0);
		 }catch(Exception ex) {
		 System.out.println(ex.getMessage());
		 }
		System.out.println("Value in s1" + firstName);
		System.out.println("Value in s2" + lastName);
		return s_concat;
	}
}

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalcualtorApp calapp = new CalcualtorApp();

		System.out.println("This calculator belongs to " 
		+ calapp.addStrings("Amber", null));
		System.out.println("This calculator belongs to " 
				+ calapp.addStrings("Amber", "Najeeb"));
	}

}

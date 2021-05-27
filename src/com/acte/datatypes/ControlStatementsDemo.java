package com.acte.datatypes;

public class ControlStatementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (true){ 
	        System.out.println("Inside if") ;
	    }
		
		if (false) {
			  System.out.println("Inside if") ;
	    } else {
	    	  System.out.println("Inside else") ;
	    } 
		
	// if then else if switch
	       int testscore = 76;
	        char grade;

	        if (testscore >= 90) {
	            grade = 'A';
	        } else if (testscore >= 80) {
	            grade = 'B';
	        } else if (testscore >= 70) {
	            grade = 'C';
	        } else if (testscore >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        
	        System.out.println("Grade : "+grade) ;
	        
	        
	        int month = 8;
	        String monthString;
	        switch (month) {
	            case 1:  monthString = "January";
	                     break;
	            case 2:  monthString = "February";
	                     break;
	            case 3:  monthString = "March";
	                     break;
	            case 8:  monthString = "August";
	                     break;
	          
	            case 11: monthString = "November";
	                     break;
	            case 12: monthString = "December";
	                     break;
	            default: monthString = "Invalid month";
	                     break;
	        }
	        // remember to use break in switch statements
	        System.out.println("monthString : "+monthString) ;
	        
	}

}

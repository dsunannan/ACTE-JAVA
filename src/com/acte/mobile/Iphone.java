package com.acte.mobile;

// Interface 

interface IPhoneResolution{
	 String s_cameraResolution="4mp";
	  void setCameraRsolution(String resolution);
	  void getCameraRsolution() ;
}

//Astraction 
abstract class PhoneResolution{
	
	public String s_cameraResolution;
	
	abstract public void setCameraRsolution(String resolution) ;
	
	 public void getCameraRsolution() {
		 System.out.println("Camera resolution set is "+s_cameraResolution);
	 }
		
}
//Encapsulation
public class Iphone extends PhoneResolution {

	 private long l_mobileno;
	 private String s_mobilename;
	
	 public void setCameraRsolution(String resolution) {
		 super.s_cameraResolution=resolution;
	 }
	 
	 public void getCameraRsolution() {
		 System.out.println("Camera resolution set is "+super.s_cameraResolution);
	 }
	 public void makeCall(long l_mobileno) {
		 System.out.println("Calling mobile no"+l_mobileno);
	 }
	 
     public void sendMessage(long l_mobileno,String message) {
    	 System.out.println("Sendind message: "+message+" mobile no"+l_mobileno);
	 }
     
     // starting point of class Iphone
     public static void main(String args[]) {
    	 Iphone ip = new Iphone(); // Default constructor
    	 ip.setCameraRsolution("128mp");
    	 
    	 ip.makeCall(99940299133L);
    	 ip.sendMessage(99940299133L, "Hi, thanks for purchasing the Iphone");
    	 ip.getCameraRsolution();
    	 
     }
	 
}

//Polymorphism

class Calculator {

	 private int i,j; // int
	 private float l,m; // float

	  /** Method overloading */
	 
	public int addNumber(int i,int j){  // returns addition of to integers
	return i+j;
	}
	public float addNumber(float l,int m){  // returns addition of to float
	return l+m;
	}
    
	public float addNumber(double x,double y){  // returns addition of two double
		return l;
		}
	
	}


/**
 * 
 * @author Polymorphism method overriding
 *
 */
class ScientificCalculator extends  Calculator {

	 private float z;
	 
	 // method addNumber is overridden in extended class.
	public float addNumber(double x,double y){  // returns addition of two double
	return z;
	}

	}



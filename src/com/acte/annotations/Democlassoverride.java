package com.acte.annotations;

public class Democlassoverride {
	   //some code
	   //some code
    
	  int i;
	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Democlassoverride other = (Democlassoverride) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	@Deprecated
	  public void m1() {
	  
	  }
	 
	  public void m2() {
		  
	  }
	public static void main(String args[]) {
		  Democlassoverride dmco = new Democlassoverride();
		  System.out.println("toString-"+dmco.toString());
		  System.out.println("hashCode-"+dmco.hashCode());
	  }

}

class Democlassoverride2 extends Democlassoverride {
	@Override
public void m1() {
		
	}
}

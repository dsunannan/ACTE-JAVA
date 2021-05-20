package com.acte.mobile;


class OneplusImpl implements IPhoneResolution {
	String s_cameraResolution="";
	public void setCameraRsolution(String resolution) {
		s_cameraResolution=resolution;
	}
	 public void getCameraRsolution() {
		System.out.println("Camera resolution set is "
				+s_cameraResolution); 
	 }
}


public class Oneplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneplusImpl opi = new OneplusImpl();
		opi.setCameraRsolution("256mp");
		opi.getCameraRsolution();
	}

}

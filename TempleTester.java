package com.xworkz.copies.constructor;

public class TempleTester {

	public static void main(String[] args) {
		
		Temple temple;
		
		temple=new Temple("Sai-baba","Gadag",6.00f,"puliyogare",8.00f);
		
		String name=temple.getName();
		String location=temple.getLocation();
		float startTime=temple.getOpenTime();
		float closingTime=temple.getCloseTime();
		String prasada=temple.getPrasada();
		
		System.out.println(name);
		System.out.println(location);
		System.out.println(startTime);
		System.out.println(closingTime);
		System.out.println(prasada);
	}
}

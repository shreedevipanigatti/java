package com.xworkz.copies.constructor;

public class PaperTester {

	public static void main(String[] args) {
		
        Paper paper;
		
	  Paper	paper1=new Paper(1.02f,15.00f,"white");
		
		String brand=paper1.getBrand();
		float width=paper1.getWidth();
		float height=paper1.getHeight();
		String colour=paper1.getColour();
		
		System.out.println(brand);
		System.out.println(width);
		System.out.println(height);
		System.out.println(colour);
		
		
		}

	}

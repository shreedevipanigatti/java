package com.xworkz.copies.constructor;

public class Paper {
	
	private String brand;
	 float width;
	float height;
	public String colour;
	
	public Paper( String brand,float wight,float height,String colour)
	{
		System.out.println("created Paper");
	
		this.width=width;
		this.height=height;
		this.colour=colour;
		
	}

	public Paper(float f, float g, String string) {
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public String getColour() {
		return colour;
	}
}


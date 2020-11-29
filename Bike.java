package com.xworkz.copies.constructor;

public class Bike {
		public String colour;

	public Bike(String bikeColour)
	{
		System.out.println("Invoked Bike constructor");
		System.out.println("argument value before::" +colour);
		colour=bikeColour;
		System.out.println("argument value after::" +bikeColour);
	}
	}


package com.xworkz.bakery.cake;

public class Cake extends Object {

	private String flavour;// encapsulation
	private double size;
	private String shape;

	public boolean taste() {
		System.out.println("invoked taste");
		boolean tastesGood = true;
		return tastesGood;

	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

}
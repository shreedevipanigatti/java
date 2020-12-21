package com.xworkz.bakery.chocolate;

public class Chocolate extends Object {
	
	

		private String chocolateName;// encapsulation
		private double price;
		private String shape;

		public void taste() {
			System.out.println("invoked taste");
			}

		public String getChocolateName() {
			return chocolateName;
		}

		public void setChocolateName(String chocolateName) {
			this.chocolateName = chocolateName;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getShape() {
			return shape;
		}

		public void setShape(String shape) {
			this.shape = shape;
		}

}

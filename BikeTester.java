
package com.xworkz.copies.constructor;
import com.xworkz.copies.constructor.Bike;

	public class BikeTester {

		public static void main(String[] args) {
			Bike bike=new Bike("blue");
			System.out.println(bike.colour);
			Bike bike1=new Bike("black") ;
			System.out.println(bike1.colour);
		
}
	}
package com.xworkz.copies.constructor;

public class AquariumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@SuppressWarnings("unused")
		Aquarium aquarium=new Aquarium();
			
			Aquarium aquarium1=new Aquarium("Rectangle");
			System.out.println(aquarium1.aquariumShape);
			
			Aquarium aquarium2=new Aquarium(100);
			System.out.println(aquarium2.totalFishes);
			
			Aquarium aquarium3=new Aquarium("Rectangle",100,"Gold fish","gold");
			System.out.println(aquarium3.aquariumShape);
			System.out.println(aquarium3.totalFishes);
			System.out.println(aquarium3.fishType);
			System.out.println(aquarium3.fishColour);

		}
}



package com.xworkz.copies.constructor;

public class Aquarium {
	

	public String fishType;
	public String fishColour;
	public String aquariumShape;
	public int totalFishes;
	
	public Aquarium() {
		System.out.println("Invoked default constructor");
	}

	public Aquarium(String aquariumShape) {
		System.out.println("Constructor shape");
		this.aquariumShape = aquariumShape;
	}

	public Aquarium(int totalFishes) {
		System.out.println("Constructor total fishes");
		this.totalFishes = totalFishes;
	}

	public Aquarium(String fishType,String fishColour) {
		System.out.println("Constructor type & colour");
		this.fishType = fishType;
		this.fishColour = fishColour;
	}

	public Aquarium(String aquariumShape, int totalFishes, String fishType, String fishColour) {
		System.out.println("Constructor all");
		this.aquariumShape = aquariumShape;
		this.totalFishes = totalFishes;
		this.fishType = fishType;
		this.fishColour = fishColour;
	}


}




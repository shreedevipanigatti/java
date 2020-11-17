package com.xworkz.online;

public class BusSearch {
	
	public static void main(String[] args) {
		
        System.out.println("jvm kareyuvudu main");

		System.out.println("Total places to search" + Places.totalPlaces());
		Places.search("Hubli");

		System.out.println("main nirgamana");
	}

}



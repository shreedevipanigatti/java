package com.xworkz.online;

public class Places {

	private static String[] places = { "Hubli", "Dharwad", "Bengalor", "Belagavi", "Dhavanageri" ,"Karavar","Gadag"};

public static void search(String place) {
    System.out.println("search kareyuvudu");
	System.out.println("Total places available" + places.length);
	System.out.println("arg1 :" + place);
boolean placesFound = false;
	for (int count = 0; count < places.length; count++) {
			//System.out.println("item at position " + items[count]);
			String bus = places[count];
	if (places.equals(place)) {
				// System.out.println("item is found");
				placesFound = true;
				break;
			} else {
				// System.out.println("item is not found");
				placesFound = false;
			}

		}

	if (placesFound) {
			System.out.println("place is found ");
		} else {
			System.out.println("place is not found");
		}
		System.out.println("search nirgamana");

	}
public static int totalPlaces() {
		return places.length;
	}

}






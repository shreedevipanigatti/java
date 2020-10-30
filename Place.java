public class Place{

	public static String finder(int distance){

		System.out.println("finder method invoked");

		System.out.println("distance "+distance);

		if(distance==300){

			System.out.println("Mysore");

			return "Mysore";

		}

		if(distance==150){

			System.out.println("Dharwad");

			return "Dharwad";

		}

		if(distance==1000){

			System.out.println("Hariyana");

			return "Hariyana";

		}

		if(distance==550){

			System.out.println("Bengalore");

			return "Bengalore";

		}

		if(distance==350){

			System.out.println("Ballari");

			return "Ballari";

		}

		if(distance>=100000){

			System.out.println("place Not in earth");

			return "place Not in earth";

		}

		return "place not found";

	}

}
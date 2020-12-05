package com.xworkz.method;

//import java.util.Array;
 import com.xworkz.method.theater.MovieHub;
public class MovieHubTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] movieNames= {"Diya","KGF","Arasu","Titanic"};
		 
		MovieHub movieHub=new MovieHub("PVR",500,movieNames);
		
		System.out.println(movieHub.getTheaterName());
		System.out.println(movieHub.getTotalTickets());
		//String convertedMovieNames=Array.toString(movieHub.getMovieName());
	//	System.out.println(convertedMovieNames());
		
		movieHub.bookTicketsAndGetTotalPrice("Yajaman",5,"Shree");
		movieHub.bookTicketsAndGetTotalPrice("LoveMakatail",15,"Sahana");
		movieHub.bookTicketsAndGetTotalPrice("Diya",50,"Shushma");
		
		
		}

}

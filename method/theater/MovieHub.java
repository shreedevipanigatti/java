package com.xworkz.method.theater;

public class MovieHub {
	
	private String theaterName;
	private int totalTickets;
	private String[] movieNames;
	
	public MovieHub(String theaterName,int totalTickets, String[] movieNmaes)
	{
		System.out.println("created & init movieHub");
		System.out.println("arg1"+theaterName);
		System.out.println("arg2"+totalTickets);
		System.out.println("arg3"+movieNames);
		 
		this.movieNames=movieNames;
		this.theaterName=theaterName;
		this.totalTickets=totalTickets;
		
		System.out.println("crated & init movieHub computed");
	}
	
	public double bookTicketsAndGetTotalPrice(String movieName,int noOfTickets,String bookBy)
	{
		double totalPrice=0;
		System.out.println("invoked bookTickets");
		System.out.println("arg1"+movieName);
		System.out.println("arg2"+noOfTickets);
		System.out.println("arg3"+bookBy);
		
	
		return totalPrice;
	}
	public String[] getMovieNames() {
		return movieNames;
	}
	public String getTheaterName() {
		return theaterName;
	}
				
	public int getTotalTickets() {
		return totalTickets;
	}
}	
	


public class PlaceFinders{

	

	public static void main(String[] arg)

	{

		System.out.println("Main Invoked by JVM");

	

		String distanceInString=arg[0];

		

	    int dist=Integer.parseInt(distanceInString) ;

		String Distance=Place.village(dist);

		

		System.out.println(Distance);

		

		System.out.println("Exit:: main");



	}

}
  public class TheaterFinder{
	
	public static void main(String[] names){
		System.out.println("Invoked main");
		
		bestTheater(Theater.PVR);
		
		
		System.out.println("EXIT :: main");
	}
	
	public static void bestTheater(Theater theaterName)
	{
		System.out.println("Invoked bestTheater");
		switch(theaterName){
			case PVR:
				System.out.println("case is "+theaterName);
                System.out.println(theaterName +" theater rating is 5");
				break;
			
			case JANATA:
				System.out.println("case is "+theaterName);
                System.out.println(theaterName +" theater rating is 4");
				break;
				
			case KRISHNA:
				System.out.println("case is "+theaterName);
			    System.out.println(theaterName +" theater rating is 3");
				break;
				
			case RAVI:
				System.out.println("case is "+theaterName);
				System.out.println(theaterName +"theater rating is 3");
				break;
				
			case ANAND:
				System.out.println("case is "+theaterName);
				System.out.println(theaterName +"theater rating is 5");
				break;
				
		}
		
		System.out.println("EXIT :: BestTheater");
		
	}
}

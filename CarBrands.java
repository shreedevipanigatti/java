public class CarBrands{
	
	public static String[] getBrands(){
		System.out.println("getBrands method invoked");
		
		String[] carBrands={"Audi","BMW","Maruti Suzuki","Toyota","Tata", "Jaguar"};
		
		System.out.println("brands size  "+carBrands.length);
		
		for(int cars=0;cars<carBrands.length;cars++)
		{
			System.out.println("Brands count "+cars);
			
			String message=carBrands[cars];
			
			System.out.println("Car Brand "+ message);
		}
	  	return carBrands; 
	}
}
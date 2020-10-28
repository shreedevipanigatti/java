public class Exchange{
	
	public static void main(String[] value)
	{
		System.out.println("JVM invoked main");
		System.out.println("The Program will convert string to number");
		
		String priceOfPen="5";
		byte convertedpriceOfPen=Byte.parseByte(priceOfPen);
		System.out.println("converted byte : "+convertedpriceOfPen);
		
		
		String daysInAYear="365";
		short converteddaysInAYear=Short.parseShort(daysInAYear);
		System.out.println("converted short : "+converteddaysInAYear);
		
		
		String priceOfHpLapy="45000";
		int convertedpriceOfHpLapy=Integer.parseInt(priceOfHpLapy);
		System.out.println("converted int : "+convertedpriceOfHpLapy);
		
		String populaOfIndia="21000000";
		long convertedpopulaOfIndia=Long.parseLong(populaOfIndia);
		System.out.println("converted long: "+convertedpopulaOfIndia);
		
		String presentageInSslc="4.9f";
		float convertedpresentageInSslc=Float.parseFloat(presentageInSslc);
		System.out.println("converted float: "+convertedpresentageInSslc);
		
	    String chargeOfElectron="1.62021766200000";
		double convertedchargeOfElectron=Double.parseDouble(chargeOfElectron);
		System.out.println("converted double: "+convertedchargeOfElectron);
		
		String sevenDaysInAWeek="true";
		boolean convertedsevenDaysInAWeek=Boolean.parseBoolean(sevenDaysInAWeek);
		System.out.println("converted boolean: "+convertedsevenDaysInAWeek);
		
	    System.out.println("EXIT :: main");
					
	}
	
	
}
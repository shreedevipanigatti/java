public class AgeCalculatorTester{


public static void main(String[] args)
{
	
	System.out.println("JVM invoked main");
	
	String ageInString=args[0];
	String ageInString=args[1];
	
	byte age=Byte.parseByte(ageInString);
	byte age=Byte.parseByte(ageInString);//type
	AgeCalculator.ageDefinition(age);
	
	System.out.println("EXIT :: main");
	}

}

public class CountryNames{


public static void main(String[] names)
{

   
	   
	   System.out.println("JVM invoked main");
	   
	   System.out.println("Program to print all the arguments of the main method");
	   System.out.println("By Making use of for loop, which is dynamic");
	   for(int country=0;country<names.length;country++)
	   {
		   System.out.println("country number"+country);
		   String mainMethodArg=names[country];
		   System.out.println("mainMethodArg "+mainMethodArg);
	   }
	   
	   
	   System.out.println("EXIT  :: main");
	   
   }

}
	


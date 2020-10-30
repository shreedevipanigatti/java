public class Charger

{
   public static void charging(String light)

{
   System.out.println("invoked Charging");

		System.out.println("arg light: "+light);

		}

	public static void  charging(String wire,String priceOfCharger)

	{
	    System.out.println("invoked Charging with two parameters ");

		System.out.println("String and String");

		System.out.println("arg1 wire"+wire);

		System.out.println("arg2 priceOfCharger"+  priceOfCharger);

			}
	
	public static void charging(String wire,int priceOfCharger)

	{

		System.out.println("invoked charging with two parameters ");

		System.out.println("String and int");

		System.out.println("arg1 wire"+wire);

		System.out.println("arg2 priceOfCharger"+ priceOfCharger);

	}

	public static void charging(int  priceOfCharger,String wire)

	{

		System.out.println("invoked charging with two parameters ");

		System.out.println("int and String");

		System.out.println("arg1 pirceOfCharger"+ priceOfCharger);

		System.out.println("arg2 wire"+wire);

		
}
}
	
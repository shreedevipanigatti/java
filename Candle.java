public class Candle 

{
   public static void lighting(String burn)

{
   System.out.println("invoked lighting");

		System.out.println("arg burn: "+burn);

		}

	public static void  lighting(String matchStick,String priceOfCandle)

	{
	    System.out.println("invoked lighting with two parameters ");

		System.out.println("String and String");

		System.out.println("arg1 matchStick"+matchStick);

		System.out.println("arg2  priceOfCandle"+ priceOfCandle);

			}
	
	public static void lighting(String matchStick,int  priceOfCandle)

	{

		System.out.println("invoked lighting with two parameters ");

		System.out.println("String and int");

		System.out.println("arg1 matchStick"+matchStick);

		System.out.println("arg2 priceOfCandle"+priceOfCandle);

	}

	public static void holding(int  priceOfCandle,String matchStick)

	{

		System.out.println("invoked lighting with two parameters ");

		System.out.println("int and String");

		System.out.println("arg1  priceOfCandle"+ priceOfCandle);

		System.out.println("arg2 matchStick"+matchStick);

		
}
}
	
public class Dress 

{
   
   public static void wearing(String size)

{
    
   System.out.println("invoked wearing");

		System.out.println("arg size: "+ size);

		}

	public static void wearing(String cleaning,String noOfDress)

	{

		System.out.println("invoked wearing with two parameters");

		System.out.println("String and String");

		System.out.println("arg1 cleaning"+cleaning);

		System.out.println("arg2 noOfDress"+noOfDress);

		}

	 public static void wearing(String cleaning,int noOfDress)

	{

		System.out.println("invoked wearing with two parameters");

		System.out.println("String and int");

		System.out.println("arg1 cleaning"+cleaning);

		System.out.println("arg2 noOfDress"+noOfDress);

	}

	
       public static void wearing(int noOfDress,String cleaning)

	{

		System.out.println("invoked wearing with two parameters");

		System.out.println("int and String");

		System.out.println("arg1 noOfDress"+noOfDress);

		System.out.println("arg2 cleaning"+cleaning);

		

	}

	
}
	

	
public class DressQuality{

public static void main(String[] shop)

{

	System.out.println("JVM invoked main");	

	System.out.println("main method args length"+shop.length);	

        

		String colour="Blue";

		Dress.wearing(colour);



		Dress.wearing(colour,8);

		

		Dress.wearing(colour,"Top");


	System.out.println("EXIT :: main");	

}



}
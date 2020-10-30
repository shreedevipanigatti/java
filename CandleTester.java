public class CandleTester{

public static void main(String[] plate)

{

	System.out.println("JVM invoked main");	

	System.out.println("main method args length"+plate.length);	

        

		String box="Aim";

		Candle.lighting(box);



		Candle.lighting(box,2);

		

		Candle.lighting(box,"Table");





	System.out.println("EXIT :: main");	

}



}
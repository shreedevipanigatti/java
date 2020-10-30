public class ChargerTester{

public static void main(String[] laptop)

{

	System.out.println("JVM invoked main");	

	System.out.println("main method args length"+laptop.length);	

        

		String model="Vivo";

		Charger.charging(model);



		Charger.charging(model,14000);

	
		Charger.charging("model","Computer");

       System.out.println("EXIT :: main");	

}



}
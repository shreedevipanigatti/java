public class CountryTester
{
public static void main (String[] best)
{
System.out.println("JVM invoked main");

Country.name="India";
System.out.println("name"+Country.name);

Country.population=210000000;
System.out.println("population"+Country.population);

Country.flagColours=3;
System.out.println("flagColours"+Country.flagColours);

Country.indianAnimal="Tiger";
System.out.println("animal"+Country.indianAnimal);

Country.noOfStates=28;
System.out.println("noOfStates"+Country.noOfStates);


System.out.println("EXIT :: main");

}
}

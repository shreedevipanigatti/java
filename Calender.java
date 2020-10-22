public class Calender {
 public static void main(String[] days)
 {
 System.out.println("invoked main method by JVM");
 arrayOfBoolean();
 }
 public static void arrayOfBoolean()
 {
 System.out.println("invoked arrayOfBoolean");

boolean rainbowIsClourless=false;
boolean skyIsBlue= true;
boolean eightDaysInAWeek=false;

 
boolean sets[]={rainbowIsClourless,skyIsBlue,eightDaysInAWeek};
 int sizeOfArray= sets.length;
 System.out.println("Lenghth of an array "+sizeOfArray);
 
 boolean elementAtIndex0=sets[0];
 System.out.println("elementAtIndex"+elementAtIndex0);
 
  boolean elementAtIndex1=sets[1];
 System.out.println("elementAtIndex"+elementAtIndex1);
 
  boolean elementAtIndex2=sets[2];
 System.out.println("elementAtIndex "+elementAtIndex2);
 
 
 }
}
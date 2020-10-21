public class Remote {
 public static void main(String[] keys)
 {
 System.out.println("invoked main method by JVM");
 arrayOfPercentage();
 }
 public static void arrayOfPercentage()
 {
 System.out.println("invoked arrayOfPercentage");

float sslcPercentage= 88.16f;
 float pucPercentage= 80.19f;
 float degreePercentage= 70.12f;
 
 float[] percentage={88.16f,80.19f,70.12f};
 float sizeOfArray= percentage.length;
 System.out.println("Total elements "+sizeOfArray);
 
 float elementAtIndex1=percentage[1];
 System.out.println("ElementAtIndex1 "+elementAtIndex1);
 
 }
}
public class Refrigerator {
 public static void main(String[] boxes)
 {
 System.out.println("invoked main method by JVM");
 arrayOfEmail();
 }
 public static void arrayOfEmail()
 {
 System.out.println("invoked arrayOfEmails");

String contactEmail= "contact@X-workz.in";
 String subscribeEmail= "subscribe@X-workz.in";
 String hrEmail= "vinay@X-workz.in";
 
 String[] emails={contactEmail,subscribeEmail,hrEmail,"akshara@X-workz.in"};
 int sizeOfArray=emails.length;
 System.out.println("Total elements "+sizeOfArray);
 
 String elementAtIndex1=emails[1];
 System.out.println("ElementAtIndex1 "+elementAtIndex1);
 
 }
}
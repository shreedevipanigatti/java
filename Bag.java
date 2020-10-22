public class Bag {
 public static void main(String[] money)
 {
 System.out.println("invoked main method by JVM");
 arrayOfChar();
 }
 public static void arrayOfChar()
 {
 System.out.println("invoked arrayOfChar");

char madhu= 'M';
 char shree= 'S';
 char sahana= 'S';
 char anusha= 'A';
 char banu= 'B';
 char abhi= 'A';
 char arun= 'A';
 char akash= 'A';
 char anita= 'A';
 char madhura='m';
 
 char[] names={ madhu,shree,sahana,anusha,banu,abhi,arun,akash,anita,madhura};
 int sizeOfArray= names.length;
 System.out.println("number of  Array "+sizeOfArray);
 
 char charcterAtIndex0=names[0];
 System.out.println("charcterAtIndex0 "+charcterAtIndex0);
 
 char charcterAtIndex1=names[1];
 System.out.println("charcterAtIndex1 "+charcterAtIndex1);
 
 char charcterAtIndex2=names[2];
 System.out.println("charcterAtIndex2 "+charcterAtIndex2);
 }
}
import java.util.*;
class StringHandling{
  public static void main(String []args)
  {
	  String s1,s2,s3;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a string value : ");
	  s1 = s.nextLine();
	  System.out.println("Enter a string value : ");
	  s2 = s.nextLine();
	  System.out.println(s1.toUpperCase());
	  char ch=s1.charAt(4);
	  System.out.println(ch);
	  System.out.println("string length is: "+s1.length());
	  System.out.println(s1.substring(2,4));
	  System.out.println(s1.substring(2));
	  
  }
}
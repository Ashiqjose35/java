import java.util.*;
class StringManipulation7
{
  public static void main(String args[])
     {
      Scanner sc=new Scanner(System.in);
    System.out.println("Length of a string");
    System.out.println("******************"+"\n");
    System.out.println("enter a string : ");
    String str1=sc.next();
    System.out.println(str1.length());
    System.out.println("\nString Concatenation");
    System.out.println("********************");
    System.out.println("enter string1 : ");
    String s1=sc.next();
    System.out.println("enter string2 : ");
    String s2=sc.next();
    String s3=s1+s2;
    System.out.println(s3);
    System.out.println("\nString Character Extraction");
    System.out.println("***************************");
    System.out.println("enter a string : ");
    String string1=sc.next();
    System.out.println("\nenter character position: ");
    int n=sc.nextInt();
    char ch=string1.charAt(n-1);
    System.out.println("character: "+ch);
    System.out.println("\nString Equals");
    System.out.println("*************");
    System.out.println("enter string1 : ");
    String st1=sc.next();
    System.out.println("enter string2 : ");
    String st2=sc.next();
    System.out.println(st1.equals(st2));
    System.out.println("\nUpper case and Lower case");
    System.out.println("*************************");
    System.out.println("enter a string : ");
    String stg=sc.next();
    String lower=stg. toLowerCase();
    System.out.println(lower);
    String upper=stg. toUpperCase();
    System.out.println(upper);
    
   }
}
    

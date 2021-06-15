import java.io.*;
import java.util.Scanner;
class Overload9
{   
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        over obj = new over();
        Scanner sc = new Scanner(System.in); 
        System.out.println(" ");
    System.out.print("Enter your choice : \n1. Square \n2. Cube \n ");
        char ch1 = sc.next().charAt(0);
      System.out.print("Enter a number: ");
        int n = in.nextInt();
        obj.calculate(n, ch1);
        System.out.println(" ");
    
        System.out.print("Enter your choice : \n1. Product \n2. Sum \n  ");
        char ch2 = sc.next().charAt(0);
        System.out.print("Enter the first number: ");
        n = in.nextInt();
        System.out.print("Enter the second number: ");
        int m = in.nextInt();
        
        obj.calculate(n, m, ch2);
        System.out.println( " ");
        
  System.out.println("Enter string 1:");
  String str1=in.next();
  System.out.println("Enter string 2:");
  String str2=in.next();
  obj.calculate(str1,str2);
  
        
    }
}

class over
{
    public void calculate(int n, char ch) 
    {
        if (ch == '1') 
  {
                System.out.println("The square value is:");
    System.out.println(n*n);
  }
           
        else 
  {
                System.out.println("The cube value is:");
    System.out.println(n*n*n);
        }
    }
     public void calculate(int n, int m, char ch) 
    {
        if (ch == 'p')
         {
            System.out.println("Product is : ");
      System.out.println(n*m);
          }
        else
          {
            System.out.println("Sum is : ");
      System.out.println(n+m);
          }
    }
    public void calculate(String str1, String str2)
   {
       if(str1.equals(str2) == true)
       {
            System.out.println("The Strings are equal");
  }
  else
       {
            System.out.println("The Strings are not equal");
  }
    }
}

import java.io.*;
import java.util.Scanner;
class Fact
{
public static void main(String args[])
{
int a,fact=1;
System.out.println("Enter the number ");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(int i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println("Factorial of " + a + " is " + fact);
}
}

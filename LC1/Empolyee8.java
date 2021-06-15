import java.io.*;
import java.util.Scanner;

class Employee8 
{
    int eNo, eSalary;
    String eName;

    void read() throws IOException 
    {
        System.out.print("\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        eNo = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        eName = sc.next();

        System.out.print("Enter Employee Salary: ");
        eSalary = sc.nextInt();
    }

    void Display() throws IOException {
        System.out.println("Name      : " + eName);
        System.out.println("Salary    : " + eSalary);
    }

    public static void main(String args[]) throws IOException 
    {
        int n;
        int emp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        n = sc.nextInt();

        Employee8 s[] = new Employee8[n];

        for (int i = 0; i < n; i++) 
        {
            s[i] = new Employee8();
            s[i].read();
        }
        
        System.out.print("\nEnter the Employee number to search: ");
        emp = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {
            if (emp == s[i].eNo) 
            {
                s[i].Display();
            }
        }
    }
}

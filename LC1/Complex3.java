import java.io.*;
import java.util.Scanner;

class Complex3 {
    int real, img;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.println("Enter the real part:");
        this.real = sc.nextInt();
        System.out.println("Enter the imaginary part:");
        this.img = sc.nextInt();
    }

    void display() {
        System.out.println("the complex number: " + this.real + "+" + this.img + "i");
        System.out.println("\n");
    }

    void add(Complex3 c1, Complex3 c2) {
        real = c1.real + c2.real;
        img = c1.img + c2.img;
        System.out.println("The sum of Complex number is: " + real + "+" + img + "i");
    }

    public static void main(String args[]) throws IOException {
        Complex3 c1 = new Complex3();
        Complex3 c2 = new Complex3();
        Complex3 c3 = new Complex3();
        c1.read();
        c1.display();
        c2.read();
        c2.display();
        c3.add(c1, c2);
    }

}


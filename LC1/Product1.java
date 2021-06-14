import java.io.*;
import java.util.Scanner;

class Product1 {
    int pcode;
    String pname;
    Float price;

    void read() throws IOException {
        System.out.print("\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Product code: ");
        pcode = sc.nextInt();

        System.out.print("Enter the product name: ");
        pname = sc.next();

        System.out.print("Enter the product price: ");
        price = sc.nextFloat();
    }
    void Display() throws IOException {
        System.out.print("Product code: " + pcode);
        System.out.print("\n");
        System.out.print("Name of the Product: " + pname);
        System.out.print("\n");
        System.out.print("Price of the product: " + price);
        System.out.print("\n");

    }

    public static void main(String args[]) throws IOException {
        Product1 obj1[] = new Product1[4];
        for (int i = 1; i <= 3; i++) {
            obj1[i] = new Product1();
            obj1[i].read();
        }

        int min = 1;
        for (int i = 1; i <= 3; i++) {

            if (obj1[min].price > obj1[i].price) {
                min = i;
            }
        }
        System.out.print("\nProduct having least price is  : \n\n");
        obj1[min].Display();

    }

}

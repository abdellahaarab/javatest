import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("-----------------------------\n");
        // the data type in java
        String word = "this is my first project in java ";
        int x = 2988;
        float price1= 5000.99f;
        double price2 = 8000.404083; /*this is the best one */
        boolean isif = true;
        char ha = 'h';
        // variabls methods
        String mybrt, is = " is ";
        mybrt = "My BRD ";
        word += "\n" + mybrt;
        word += (double) x;
        System.out.println("Hello, World!" + "\nHello, FFF " + "\n" + word);

        // inputs
        System.out.print("-----------------------------\nEnter Your Name : ");
        String name = new Scanner(System.in).nextLine(); // just for String
        System.out.print("\nEnter Your Age : ");
        int age = new Scanner(System.in).nextInt(); // just for int
        // int age = new Scanner(System.in).nextFloat(); // just for Float
        // int age = new Scanner(System.in).nextDouble(); // just for Double
        System.out.print("\nYour name is " + name);
        System.out.print("\nYour age is " + age);
    }
}






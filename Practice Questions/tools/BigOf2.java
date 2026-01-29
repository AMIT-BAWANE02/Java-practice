
import java.util.Scanner;

public class BigOf2 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("This program is to find the biggest of two numbera\n So, lest's start!\n");
        System.out.print("Enter the First number:");
        int a = sc.nextInt();
        System.err.print("Enter the second number:");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("The biggest number is " + a);
        } else if (a == b) {
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("The biggest number is " + b);
        }
        sc.close();
    }
}
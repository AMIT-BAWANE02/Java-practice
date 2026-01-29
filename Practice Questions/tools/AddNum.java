// package Practice Questions.If else;

import java.util.Scanner;

public class AddNum {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two numbers to add:");
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The sum is: " + sum);
        sc.close();
    }

}


import java.util.Scanner;

public class LargestOF3 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three numbers to find the largest among them: ");

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.print("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print("the largest number is: " + num2);
        } else {
            System.out.print("The largest number is: " + num3);
        }
        sc.close();

    }

}

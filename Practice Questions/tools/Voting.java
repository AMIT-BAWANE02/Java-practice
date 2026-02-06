
import java.util.Scanner;

public class Voting {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's check are you eligible for voting or not!");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 150) {
            System.out.println("We don't have voting facility in hell or heven!");
        } else if (age >= 18) {
            System.out.println("You are eligible for voting!");

        } else {
            System.out.println("You are not eligible for voting!");
        }
        sc.close();
    }

}

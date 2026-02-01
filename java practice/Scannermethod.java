
import java.util.Scanner;

public class Scannermethod {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Call methods that require input
            getUserName(sc);
            getUserAge(sc);
        } // Scanner is automatically closed here
    }

    public static void getUserName(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void getUserAge(Scanner sc) {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");
    }
    public static void getUserId(Scanner sc){
        System.out.println("Enter your ID: ");
    }
}


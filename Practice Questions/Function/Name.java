import java.util.Scanner;

public class Name {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("creting the function to print the name");
        String name = printName();
        greetUser(name);

    }

    public static String printName() {
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        return name;
    }

    public static void greetUser(String name) {
        System.out.print("hello " + name);
    }

}

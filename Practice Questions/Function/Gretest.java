import java.util.Scanner;

public class Gretest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating a function to find the greatest of three numbers");
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = gretest(a, b, c);
        gretest(a, b, c);

        System.out.println("The greatest number is: " + result);

    }

    public static int gretest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

}

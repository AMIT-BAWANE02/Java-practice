
import java.util.Scanner;

public class Div5and11 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("check whether a number is divisible by 5 and 11 or not ");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.print(num + " is divisible by 5 and 11");
        } else if (num % 5 == 0) {
            System.out.print(num + " is divisible by 5 but not divisible by 11");
        } else {
            System.out.print(num + " is divisible by 11 but not divisible by 5");
        }
        sc.close();
    }
}

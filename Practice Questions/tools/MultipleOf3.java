
import java.util.Scanner;

class MultipleOf3Checker {
    public static boolean isMultipleOf3(long num) {
        if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

public class MultipleOf3 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("check whether it is multiple of 3 or not ");
        System.out.print("Enter a number: ");
        long num = sc.nextInt();
        if (MultipleOf3Checker.isMultipleOf3(num)) {
            System.out.print(num + " is multiple of 3");
        } else {
            System.out.print(num + " is not multiple of 3");
        }
        sc.close();
    }

}

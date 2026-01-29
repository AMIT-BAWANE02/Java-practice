
import java.util.Scanner;

public class OddEven {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number to check whether it is odd or even: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.print("The Number is **EVEN**");
        } else {
            System.out.print("Thw Number is **ODD**");
        }
        sc.close();
    }

}

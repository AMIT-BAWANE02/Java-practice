
import java.util.Scanner;

public class PovNev {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entern your number to check weather it is pov or nev: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.print("The number is positive");
        } else if (num < 0) {
            System.out.print("The number is negative");
        } else {
            System.out.print("The number is nutral(Zero)");
        }
        sc.close();
    }
}

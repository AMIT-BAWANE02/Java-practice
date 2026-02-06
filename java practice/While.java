
import java.util.Scanner;

public class While {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;

        while (n != 0) {
            System.out.print("Enter number (0 to stop): ");
            n = sc.nextInt();
        }
        sc.close();
    }
}

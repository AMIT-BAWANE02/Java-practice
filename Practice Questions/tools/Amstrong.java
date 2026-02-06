
import java.util.Scanner;

class Amstrongcheck {
    public Amstrongcheck(int a) {
        int sum = 0;
        int temp = a;
        while (a > 0) {
            int r = a % 10;
            sum = sum + (r * r * r);
            a = a / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is an Amstrong number");
        } else {
            System.out.println(temp + " is not an Amstrong number");
        }
    }
}

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Amstrong or not: ");
        int num = sc.nextInt();
        Amstrongcheck obj = new Amstrongcheck(num);
        sc.close();

    }

}

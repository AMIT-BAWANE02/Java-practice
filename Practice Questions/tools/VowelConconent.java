
import java.util.Scanner;

public class VowelConconent {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a alphabet to check whether it is vowel or conconent: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u' || ch == 'A' || ch == 'E'
                || ch == 'I' || ch == '0' || ch == 'U') {
            System.out.println("The alphabet is vowel");
        } else {
            System.out.print("The alphabet is conconent");
        }

    }
}


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Choose an option:");
        System.out.println(
                "1. Add two numbers\n2. Amstrong\n3. Biggest\n4. Biggest amoung two number\n5. Check number is Divisible by 5 and 11 \n6. Largest of three numbers\n7. Leap Year\n8. Multiple of 3 \n9. Odd or Even\n10. Palindrome\n11. Positive or Negative\n12. Temparature \n13. Voting Eligibility\n14. Vowel or Consonant\n15. Exit");

        System.out.println("Choose an option:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                AddNum.main(args);
                break;
            case 2:
                FunSquare.main(args);
                break;
            case 3:
                Biggest.main(args);
                break;
            case 4:
                BigOf2.main(args);
                break;
            case 5:
                Div5and11.main(args);
                break;
            case 6:
                LargestOF3.main(args);
                break;
            case 7:
                LeapYear.main(args);
                break;
            case 8:
                MultipleOf3.main(args);
                break;
            case 9:
                Oddoreven.main(args);
                break;
            case 10:
                palindrome.main(args);
                break;
            case 11:
                PovNev.main(args);
                break;
            case 12:
                Temperature.main(args);
                break;
            case 13:
                Voting.main(args);
                break;
            case 14:
                VowelConconent.main(args);
                break;
            default:
                System.out.println("Exiting...");
        }
    }

}

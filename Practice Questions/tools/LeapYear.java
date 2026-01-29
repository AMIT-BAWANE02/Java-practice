
import java.util.Scanner;

class LeapYearChecker {
    public static boolean isleapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}

public class LeapYear {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a year to check whether it is leap year or not: ");
        int year = sc.nextInt();
        if (LeapYearChecker.isleapYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();

    }

}

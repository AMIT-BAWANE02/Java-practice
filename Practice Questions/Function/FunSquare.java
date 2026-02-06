import java.util.Scanner;

public class FunSquare {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Creating a function to print the square of a number");
        int result = square();// sq value is stored in result which we returned from square function
        System.out.println("The square of the number is: " + result);// then result is printed
    }

    public static int square() {
        System.out.println("Enter a number to find its square:");
        int num = sc.nextInt();
        int sq = num * num;
        return sq;
    }
}

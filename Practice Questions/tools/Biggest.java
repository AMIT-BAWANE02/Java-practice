
import java.util.Scanner;

public class Biggest {

    public static int findGreatest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {

            return Integer.MIN_VALUE;
        }

        int greatestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > greatestNumber) {
                greatestNumber = numbers[i];
            }
        }

        return greatestNumber;
    }

    public static int arrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 2. THE MAIN FUNCTION (Execution Flow)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces to find the biggest among them: ");
        int[] data = sc.next().lines().mapToInt(Integer::parseInt).toArray();
        sc.close();

        int max = findGreatest(data);

        System.out.println("The numbers are: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println("The biggest number is: " + max);
    }
}
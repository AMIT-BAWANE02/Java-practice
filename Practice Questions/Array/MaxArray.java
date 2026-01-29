import java.util.Scanner;

public class MaxArray {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();

        int[] ary = new int[size];

        System.out.println("enter the elements of the array:");
        for (int i = 0; i < ary.length; i++) {
            ary[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] > max) {
                max = ary[i];
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}

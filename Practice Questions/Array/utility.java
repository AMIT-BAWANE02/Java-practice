import java.util.Arrays;

public class utility {
    public static void main(String[] args) {
        int[] num1 = { 5, 3, 8, 1, 2 };
        int[] num2 = { 5, 3, 8, 1, 2 };
        // System.out.println("Original array:" + Arrays.toString(num1));
        // Arrays.sort(num1);
        // System.out.println("Sorted array: " + Arrays.toString(num1));
        System.out.println("Array are equal: " + Arrays.equals(num1, num2));
    }
}

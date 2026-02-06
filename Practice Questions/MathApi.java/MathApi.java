import java.lang.Math;

public class MathApi {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double sqrt_a = Math.sqrt(a);
        double sqrt_b = Math.sqrt(b);
        System.out.println("Square Root of a: " + sqrt_a);
        System.out.println("Square Root of b: " + sqrt_b);
        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        double quotient = divide(a, b);

        // creating Apis for basic math operations
        int max = Math.max(a, b);
        int min = Math.addExact(a, b);
        int add = Math.addExact(a, b);
        int subtract = Math.subtractExact(b, a);
        int multiply = Math.multiplyExact(a, b);
        double divide = Math.divideExact(a, b);
        int sqrt = Math.getExponent(a);

        // disple results
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Add: " + add);
        System.out.println("Subtract: " + subtract);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divide: " + divide);
        System.out.println("Sqrt: " + sqrt);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);

    }

    public static double sqrt(int x) {
        return Math.sqrt(x);
    }

    public static int add(int x, int y) {
        return Math.addExact(x, y);
    }

    public static int subtract(int x, int y) {
        return Math.subtractExact(x, y);
    }

    public static int multiply(int x, int y) {
        return Math.multiplyExact(x, y);
    }

    public static double divide(int x, int y) {
        if (y == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0; // Or throw an exception
        }
        return Math.divideExact(x, y);
    }
}

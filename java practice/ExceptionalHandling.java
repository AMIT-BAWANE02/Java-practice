public class ExceptionalHandling {
    public static void main(String[] args) {
        System.out.println("Exceptional Handling in Java");

        try {
            int data = 100 / 0; // This will cause ArithmeticException
            System.out.println("Data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
    
}

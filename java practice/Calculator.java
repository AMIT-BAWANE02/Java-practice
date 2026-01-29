
import java.util.Scanner;

public class Calculator {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("Sum: "+result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("subtraction: "+result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication: "+result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division: "+result);
                break;
            default:
                System.out.println("Invalid input" );
                break;
        }
        
    }
}

import java.util.Scanner; // 1. Import the Scanner class

public class Format {

    public static void main(String[] args) {
        
        // 2. Create a Scanner object to read input from the console
        try (Scanner scanner = new Scanner(System.in)) {
        
            System.out.println("--- Input ---");
            
            System.out.print("Please enter your name: ");
            String userName = scanner.nextLine(); 
            
            System.out.print("Please enter your age: ");
            
            int userAge = scanner.nextInt(); 
        
            System.out.printf("Hello, %s! You are %d years old.", userName, userAge);
            
            // Since printf doesn't add a newline, we add one here for cleanliness
            System.out.println(); 
        }
    }
}
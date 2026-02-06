import java.util.Scanner;     // Importing Scanner class to take user input

public class I_o {

    // ---- CLASS VARIABLES (FIELDS) ----
    int age;                   // To store student's age
    String name;               // To store student's name
    String line;               // To store a sentence or additional info
    double marks;              // To store student's marks

    Scanner sc = new Scanner(System.in);   // Scanner object for input (used inside constructor)

    // ---- CONSTRUCTOR ----
    I_o() {

        // Taking age input (integer)
        System.out.print("Enter age: ");
        age = sc.nextInt();    // Read integer and store in age variable

        // Taking name input (single word)
        System.out.print("Enter name: ");
        name = sc.next();      // Read single word and store in name

        sc.nextLine();         // Clear leftover newline (very important)

        // Taking sentence input (full line)
        System.out.print("Enter a sentence: ");
        line = sc.nextLine();  // Read entire line with spaces

        // Taking marks input (decimal)
        System.out.print("Enter marks: ");
        marks = sc.nextDouble();  // Read decimal number
    }
    public void Amit() {
        System.out.println("this is constructor");
    }
    // ---- MAIN METHOD ----
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {   // Separate scanner for main loop
            
            while (true) {              // Infinite loop (will break when user says 'no')

                I_o obj = new I_o();    // Create new object → constructor runs → input taken
                obj.Amit();
                // Display the collected data
                System.out.println("\n---- STUDENT DATA ----");
                System.out.println("Name: " + obj.name);   // Print name
                System.out.println("Age: " + obj.age);     // Print age
                System.out.println("Line: " + obj.line);   // Print sentence
                System.out.println("Marks: " + obj.marks); // Print marks

                // Ask whether user wants to add more students
                System.out.print("\nDo you want to enter more student data? (yes/no): ");
                String choice = sc.next().toLowerCase();   // Read choice, convert to lowercase

                // If user types anything other than "yes", stop the loop
                if (!choice.equals("yes")) {
                    System.out.println("\nProgram Ended.");
                    break;     // Exit loop
                }
            }
        }
    }
}



import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.println("5. Exit");
        System.out.println("Choose any one option from above(1-5) ");
        System.out.print("Enter the option : ");
        int choice=sc.nextInt();

        if(choice==1){
            System.out.print("Enter two numbers to add: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Sum: "+(a+b));
        }else if(choice==2){
            System.out.print("Enter two numbers to subtract: ");    
            int a=sc.nextInt();
            int b=sc.nextInt();    
            System.out.println("Difference: "+(a-b));
        }else if(choice==3){
            System.out.print("Enter two numbers to multiply: ");    
            int a=sc.nextInt();
            int b=sc.nextInt();    
            System.out.println("Product: "+(a*b));
        }else if(choice==4){
            System.out.print("Enter two number to Divide: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b != 0){
             System.out.println("Quotient: "+(a/b));
            }else{
    System.out.println("Cannot divide by zero");
}
            
        }else{
            System.out.print("Program is Exit ");
        }

    }
    
}

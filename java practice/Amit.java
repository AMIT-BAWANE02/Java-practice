
import java.util.*;


class Amit{
    public static void main(String[] args){
        System.out.println("hello i am Amit");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your age and name");
            int age = sc.nextInt();
        System.err.println("Enter your name");
        String name =sc.next();
        System.out.println("\nName = " + name + "\nAge = " + age);
    } finally {
        sc.close();
    }
    }
    Scanner sc = new Scanner(System.in);{
        System.out.println("Enter your age and name");
        int age = sc.nextInt();
        System.err.println("Enter your name");
        String name =sc.next();
        System.out.println("\nName = " + name + "\nAge = " + age);
    }

}
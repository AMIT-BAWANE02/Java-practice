package Oop.OopsMain;

import Oop.OopsMain.Cls.Cal;


public class Main {
    public static void main(String[] args) {
        System.out.println("This is main class inside OOP1.oopsMain package");
    


    //running Calculator class from OOP1.Classes package
    Cal calc = new Cal();




    // Using calculator methods
    int sum = calc.add(5, 3);
    int difference= calc.subtract(10,4);        
    int product= calc.multiply(6,7);
    double quotient= calc.divide(20,5);



    // Display results
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);    
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
    
    // Using AdvancedCal static class
    
    double powerResult = Cal.AdvancedCal.power(2, 3);
    System.out.println("2 raised to the power of 3 is: " + powerResult);
    }
    
}

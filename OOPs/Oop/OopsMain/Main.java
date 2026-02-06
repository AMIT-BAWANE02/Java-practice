package Oop.OopsMain;
// Importing necessary classes from the Cls package
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).

import Oop.OopsMain.Cls.Animal;
import Oop.OopsMain.Cls.Cal;
import Oop.OopsMain.Cls.Cats;
import Oop.OopsMain.Cls.Mouse;
import Oop.OopsMain.Cls.Cal.ExceHand;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is main class inside OOP1.oopsMain package");
    
    // Create object of Animal class and call method
    Animal animalObj = new Animal();
    animalObj.eat();

    // Create a Cats object and call its methods
    Cats c = new Cats();
    c.meow();
    c.eat();
    
    // Create a mouse object and call its methods
    Mouse m = new Mouse();
    m.squeak();
    m.eat();


    //running Calculator class from OOP1.Classes package
    Cal calc = new Cal();
    //calling the ExxeHand class 
    ExceHand.demonstrateExceptionHandling();


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

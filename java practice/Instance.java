// Simple demonstration of instanceof operator
class Animal {}

class Dog extends Animal {}

public class Instance {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Animal ad = new Dog();
        Animal da = new Dog();                         // declare and initialize

		System.out.println("a instanceof Animal: " + (a instanceof Animal)); // true
		System.out.println("d instanceof Animal: " + (d instanceof Animal)); // true
		System.out.println("d instanceof Dog: " + (d instanceof Dog));       // true
		System.out.println("a instanceof Dog: " + (a instanceof Dog));       // false
		System.out.println("ad instanceof Animal: " + (ad instanceof Animal)); // true
		System.out.println("ad instanceof Dog: " + (ad instanceof Dog));       // true
        System.out.println("da instanceof Dog: " + (da instanceof Dog));       // true
        
	}
}

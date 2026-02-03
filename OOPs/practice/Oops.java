public class Oops {
    public static void main(String[] args) {
        // this main class is to call classses and methods from oopsConcepts class

        //calling oopsConcepts class
        oopsConcepts obj = new oopsConcepts();
        int sum = oopsConcepts.addNumbers(obj.num1, obj.num2);
        System.out.println("The sum of num1 and num2 is: " + sum);

        //calling sum class
        Oops ObjSum = new Oops();
        int total = ObjSum.sum(2,4);
        System.out.println("THe sum of two number is : "+ total);

        //calling sum2 class which is static but called without creating object
        int total2 = Oops.sum2(2,5);
        System.out.println("the sum of two number using static method is : "+ total2);

        
    }



    // this class is created to demonstrate OOPs concepts 
    //name : oopsConcepts
    public static class  oopsConcepts {
        // variables(data)
        int num1 =10;
        int num2=20;
        

        //methods (fusnctions)
        public static int addNumbers(int a, int b) {
            return a + b ;
        }

        public static class  SubClass {
            // subclass to demonstrate inheritance
            public void displayMessage() {
                System.out.println("This is a message from the SubClass.");
            }
        }
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static int sum2(int a, int b) {
        return a + b;
    }

    
}

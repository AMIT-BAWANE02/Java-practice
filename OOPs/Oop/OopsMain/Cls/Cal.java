package Oop.OopsMain.Cls;



public class Cal {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public  double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
    
    //creating exceptional Handling class
    public static class ExceHand {
        public static void demonstrateExceptionHandling() {
            try{
                int a= 100/0;
                System.out.println("htis is excetional handling"+a);
            }catch(Exception e){
                System.out.println("this can not be possible");
                System.out.println(e.getMessage());
            }finally{
                System.out.println("this is final and this can run");
            }
        }
    }

    //creating static class
    public static class AdvancedCal {
        public static double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }
    }

}
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

    //creating static class
    public static class AdvancedCal {
        public static double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }
    }

    

}
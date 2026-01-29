public class Oddoreven {
    public static void main(String[] args) {
        System.out.println("Creating a function to check whether a number is odd or even");
        int number = 4;
        String result = oddEven(number);
        System.out.println("The number " + number + " is " + result);
    }

    public static String oddEven(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

    }

}

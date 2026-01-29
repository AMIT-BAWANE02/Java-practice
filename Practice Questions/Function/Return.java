public class Return {
    public static void main(String[] args) {
        System.out.println("This is a return statement example");
        int value = addNumbers(5, 10);
        int value2 = addNumbers(20, 30);

        System.out.println("The sum is: " + value);
        System.out.println("The sum is: " + value2);
    }

    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

}

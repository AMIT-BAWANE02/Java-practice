public class square {
    public static void main(String[] args) {
        System.out.println("Square Pattern");
        printSquare(5);
    }

    public static void printSquare(int num) {
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

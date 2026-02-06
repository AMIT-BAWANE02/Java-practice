public class star {
    public static void main(String[] args) {
        System.out.println("Star Pattern");
        starpattern(5);
    }

    public static void starpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

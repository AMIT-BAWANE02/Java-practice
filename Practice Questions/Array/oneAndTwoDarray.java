public class oneAndTwoDarray {
    public static void main(String[] args) {
        int[] oneD = { 1, 3, 5, 7, 9, 11 };
        int[][] twoD = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // print 1D array
        System.out.println("1D Array:");
        for (int i = 0; i < oneD.length; i++) { // < instead of <=
            System.out.print(oneD[i] + " ");

        }
    }
}
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
        System.out.println();
        System.out.println();
        

        //PRINT 2D ARRAY
        System.out.println("2D Array:");
        for (int i = 0; i < twoD.length; i++) { // < instead of <=
            for (int j = 0; j < twoD[i].length; j++) { // < instead of <=
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();

        }
    }
}
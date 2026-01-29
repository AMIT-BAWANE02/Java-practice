public class Array {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };
        System.out.print("Elements of the array:");
        System.out.println(fruits[0]);
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(" " + fruits[i] + " ");
        }
        System.out.println();
    }

}

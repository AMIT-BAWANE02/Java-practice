public class Acending {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        boolean ascending = true;  
        for(int i = 0; i <= arr.length - 2; i++){
                if(arr[i] > arr[i+1]){
                    ascending = false;
                    System.out.println("Array is not ascending");
                    break;
                }
        }
        if(ascending) {
                System.out.println("Array is ascending");
            }

        System.out.println(ascending);
    }
}
public class MaxArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,2,8,6};
        int result=0;
        for(int i=0; i<= arr.length-1; i++){ 
            int before= result;
            result=result+arr[i];
            
            System.out.println(before+ " + "+arr[i] + " = "+result);


        }
        System.out.println(result);

        // finding max array element
        int max=arr[0];
        for(int i=1; i<= arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
                System.out.println("new max found: "+ max);
            }
        }
        System.out.println("max element is: "+ max);
    }
    
}

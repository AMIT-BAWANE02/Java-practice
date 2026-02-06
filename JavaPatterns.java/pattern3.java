public class pattern3 {
    public static void main(String[] args) {
        int num=5;
        for(int i=0; i<=num; i++){
            if(i==0 || i==num){
                System.out.print("* ");
            }
            for(int j=0; j<=num;j++){
                if(j==num){
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
    
}

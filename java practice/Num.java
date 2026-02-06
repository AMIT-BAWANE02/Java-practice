class Num{
    public static void main(String[] args) {
        int a;
         for(a=1; a<=20;a++){
            if(a%3==0){
                System.out.println(a+ " number is divisible by 3 " );
            }else if(a%5==0){
                System.out.println(a+ " number is divisible by 5 " );
            }else if(a%3==0 && a%5==0){
                System.out.println(a+ " number is divisible by 3 and 5 " );
            }else{
                System.out.println(a);
            }
         }
    }
}
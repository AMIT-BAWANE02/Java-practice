class Even{
    public static void main(String[] args){
        int a = 4;
        isEven(a);
    }   
    static boolean  isEven(int n){
        if(n%2==0){
            System.out.println(n + " is even number");
            return true;
        }else{
            System.out.println(n + " is odd number");
            return false;
        }

    }
    
}
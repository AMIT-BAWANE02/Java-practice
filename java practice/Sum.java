class Sum {
    void display(){
        System.out.println("This is display method");
    }
    public static void main(String[] args){
        new Sum().display();
        System.out.println("hello world");
        int a= 10;
        int b= 20;
        int sum = a+ b;    
    //    in this program we are going to print sum value 30 times using for loop from 1 to 30
        for(int i = 1; i <= sum; i++) {
            System.out.println("Value is: " + sum);
        }
//       now we are going to print sum value in reverse order 30 to 1
        for (int i = sum; i >= 0; i--) {
            System.out.println("Value is: " + sum);
        }

    }
}           
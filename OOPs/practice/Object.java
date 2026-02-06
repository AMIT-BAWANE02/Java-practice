
public class Object {
    int num =5;
    public static void main(String[] args) {
        System.out.println("This is Object class");
        Object obj1 = new Object();
        System.out.println("Value of num: " + obj1.num);
        InnerClass innerObj= new Object().new InnerClass();
        innerObj.display();
    }

    public class InnerClass {
        public void display() {
            int b=10;   
            System.out.println("This is an inner class"+ b);
}
        
    }
}

public class NestedIf {
public static void main(String[] args) {
    int age = 20;
boolean hasID = true;

    if (age >= 18) {
        if (hasID) {
            System.out.println("Entry Allowed");
        } else {
            System.out.println("ID Required");
        }
    } else {
        System.out.println("Not allowed");
    }
 }  
}
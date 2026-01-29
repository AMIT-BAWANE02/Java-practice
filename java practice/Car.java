
class Car {
    static String brand = "Honda";
    int speed;

    // constructor
    Car(int speed) {
        this.speed = speed;
    }

    void show() {
        int year = 2024;
        System.out.println(brand + " " + speed + " " + year);
    }
    
    public static void main(String[] args) {
        Car c = new Car(120);
        c.show();
    }
}
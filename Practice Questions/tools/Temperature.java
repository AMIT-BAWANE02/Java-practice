import java.util.Scanner;

class Temperature {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the temperature in degree Celsius: ");
        double temp = sc.nextDouble();
        Temperature tempObj = new Temperature();
        String status = tempObj.tempStatus(temp);
        System.out.print("The Weather is: " + status);
        sc.close();
    }

    public String tempStatus(double temp) {
        if (temp > 50) {
            return "Extremely Hot Weather";
        } else if (temp > 30) {
            return "Hot Weather";
        } else if (temp > 20) {
            return "Normal Weather";
        } else if (temp > 10) {
            return "Cold Weather";
        } else {
            return "Very Cold Weather";
        }
    }
}

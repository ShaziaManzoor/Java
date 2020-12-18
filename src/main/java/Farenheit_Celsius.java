import java.util.Scanner;

public abstract class Farenheit_Celsius {
    public static void main(String args[]) {
        convert();
    }

    private static void convert() {
        double celsius, farenheit;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Temperature in farenheit ?");
        farenheit = in.nextDouble();
        celsius = (farenheit - 32)* (0.5556);
        System.out.print("The value in Celsius is  "+ celsius);
    }

}
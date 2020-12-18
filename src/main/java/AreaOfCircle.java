import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]){
        float pi = 3.14f;
        int radius;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of radius ? ");
        radius = in.nextInt();
        float area = pi * (radius * radius);
        System.out.println("Area of Circle = " + area);
    }
}

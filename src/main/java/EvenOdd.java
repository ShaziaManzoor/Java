import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number ? ");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.print("Even Number");
        }else{
            System.out.print("Odd Number");
        }
    }
}

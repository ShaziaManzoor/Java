import java.util.Scanner;

public class Divisible {
    public static void main(String args[]) {
        byTwoOrThree();
    }

    private static void byTwoOrThree() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number to know if its divisible by 2 or 3 or both ? ");
        int num = in.nextInt();
        if (num % 2 == 0 && num % 3 == 0)
            System.out.print("Divisible by two and three.");
        else if (num % 3 == 0)
            System.out.print("Divisible by 3 not 2.");
        else if (num % 2 == 0)
            System.out.print("Divisible by two not three.");
        else
            System.out.print("It's a prime.");

    }
}




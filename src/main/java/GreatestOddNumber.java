import java.util.Scanner;

public class GreatestOddNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers ? ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 > num2 && num1 > num3 && num1 % 2 != 0)
            System.out.print("num1 = " + num1 + " is the greatest odd number");
        else if(num2 > num3 && num2 % 2 != 0)
            System.out.print("num2 = " + num2 + " is the greatest odd number");
        else if(num3 > num2 && num3 % 2 != 0)
            System.out.print("num3 = " + num3 + " is the greatest odd number");
        else
            System.out.print("Theres no odd number you entered");

    }

}


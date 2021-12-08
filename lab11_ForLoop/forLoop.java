import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nQ/q: to quit");
        System.out.println("1: to calculate the square of a number");
        System.out.println("2: to calculate the square root of a number");
        String s = scan.next();// 2. INITIALIZATION OF THE CONDITION

        for (;(s.charAt(0) != 'Q' && s.charAt(0) != 'q');)// 1. THE CONDITION
        {
            if (s.charAt(0) == '1' || s.charAt(0) == '2') {

                System.out.println("enter the number:");
                double number = scan.nextDouble();
                System.out.println((s.charAt(0) == '1') ? "the square : " + (number * number)
                        : "the square root : " + Math.pow(number, 0.5));

            } else if (s.charAt(0) != 'Q' && s.charAt(0) != 'q') {
                System.out.println("invalid character");
            }

            System.out.println("\nQ/q: to quit");
            System.out.println("1: to calculate the square of a number");
            System.out.println("2: to calculate the square root of a number");

            s = scan.next();// 3.UPDATE OF THE CONDITION
        }
    }
}
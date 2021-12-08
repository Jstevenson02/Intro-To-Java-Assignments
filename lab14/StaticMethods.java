import java.util.Scanner;

import javax.print.attribute.standard.Sides;

import java.lang.Math;

public class StaticMethods {
    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static void printMyName(String msg) {
        System.out.print(msg);

    }

    public static int squareNumber(int number) {
        System.out.println(" INT was called");
        return number * number;
    }

    public static double squareNumber(double number) {
        System.out.println(" DOUBLE was called");
        return number * number;
    }

    public static double cubeNumber(double number) {
        return number * squareNumber(5);
    }

    public static double cubeNumber(int i) {
        return i;
    }

    public static String cubeNumber(String s) {
        return s;
    }

    public static char menu() {
        String s = "";

        do {
            System.out.println("type S\\c to square a number:");
            System.out.println("type C\\c to cube a number:");
            s = new Scanner(System.in).next();

            if ("c".compareToIgnoreCase(s) != 0 && "s".compareToIgnoreCase(s) != 0)
                System.out.println("\tplease enter a valid character");
        } while ("c".compareToIgnoreCase(s) != 0 && "s".compareToIgnoreCase(s) != 0);
        return s.charAt(0);
    }

    public static String menuInteger() {

        String input = "";

        do {

            System.out.println("type 1000, 2000 or 3000");
            input = new Scanner(System.in).next();

            if ("1000".compareToIgnoreCase(input) != 0 && "2000".compareToIgnoreCase(input) != 0
                    && "3000".compareToIgnoreCase(input) != 0)
                System.out.println("\tplease enter a valid character");
        } while ("1000".compareToIgnoreCase(input) != 0 && "2000".compareToIgnoreCase(input) != 0
                && "3000".compareToIgnoreCase(input) != 0);
        return input;
    }

    public static double area(int n, double side) {

        System.out.print("Enter a # of sides: ");
        n = new Scanner(System.in).nextInt();

        System.out.print("Enter the side: ");
        side = new Scanner(System.in).nextDouble();

        double a = 0.0;
        a = n * (Math.pow(side, 2)) / (4 * (Math.tan(Math.PI / n)));
        
        return a;
    }
}

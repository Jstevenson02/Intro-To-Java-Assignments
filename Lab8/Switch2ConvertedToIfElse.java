package lab8;

import java.util.Scanner;

public class Switch2ConvertedToIfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day of the week (1 - 7): ");
        int year = input.nextInt();

        if (year == 1) {
            System.out.println(year + " " + "Monday");
        } else if (year == 2) {
            System.out.println(year + " " + "Tuesday");
        } else if (year == 3) {
            System.out.println(year + " " + "Wednesday");
        } else if (year == 4) {
            System.out.println(year + " " + "Thursday");
        } else if (year == 5) {
            System.out.println(year + " " + "Friday");
        } else if (year == 6) {
            System.out.println(year + " " + "Saturday");
        } else if (year == 7) {
            System.out.println(year + " " + "Sunday");
        }

    }
}

package repo;

import java.util.Scanner;

public class CharacterClassStringClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringYes = "y";
        String stringNo = "n";

        System.out.println("Please enter y/n for yes/no: ");

        String val = input.next();

        if (val.toLowerCase() == stringYes) {
            System.out.println("you typed '" + val + "' thank you!");
        } else if (val.toLowerCase() == stringNo) {
            System.out.println("you typed '" + val + "' thank you!");
        } else if (val.length() > 1) {
            System.out.println("you typed more than 1 character '" + val + "' incorrect length!");
        } else if (isNumeric(val)) {
            System.out.println("you typed a numeric character '" + val + "' incorrect!");
        } else {
            System.out.println("you typed '" + val + "' incorect!");
        }

        input.close();
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?"); // match a number with optional '-' and decimal.
    }
}

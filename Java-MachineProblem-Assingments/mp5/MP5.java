import java.util.*;

/*
 * Locker Puzzle ASDV 1220 Introduction to Programming South Louisiana Community
 * College
 */

public class MP4 {

    static Scanner input = new Scanner(System.in);

    public static int tryParseInt(String value, int defaultVal) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }

    public static int menu() {
        // 0 Quit
        // 1 Number of Students

        System.out.println("\r\nLocker Puzzle:");
        System.out.println("=====================");
        System.out.println("0 to quit the program");
        System.out.println("1 to enter the number of students of the school");
        do {
            System.out.print("Choice: ");
            var choice = input.nextInt();

            if (choice == 0 || choice == 1) {
                return choice;
            }

            System.out.println("input is invalid.");
        } while (true);
    }

    public static void solveAndPrint(boolean[] lockers) {
        /*
         * Locker x is open Locker y is open
         */

        // Students
        for (int s = 0; s < lockers.length; s++) {
            // Lockers
            for (int l = s; l < lockers.length; l = l + s + 1) {
                // Change Locker
                lockers[l] = !lockers[l];
            }
        }

        // Output the Lockers
        for (int i = 0; i < lockers.length; i++) {
            // Lock Open?
            if (lockers[i]) {
                var lockerState = lockers[i] ? "Open" : "Closed";
                System.out.println("Locker " + (i + 1) + " is " + lockerState + ".");
            }
        }
    }

    public static void main(String[] args) {

        while (menu() != 0) {
            do {

                System.out.println("\r\nEnter the number of students of the school");
                System.out.print("# Students: ");
                var answer = input.next();

                var numberOfStudents = tryParseInt(answer, 0);
                if (numberOfStudents > 0) {
                    var lockerArray = new boolean[numberOfStudents];
                    solveAndPrint(lockerArray);
                    break;
                }

            } while (true);
        }

        input.close();
    }
}

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        int year = 0;
        int days = 0;
        String month = "";
        Boolean isLeapYear = false;

        Scanner input = new Scanner(System.in);

        // User inputs Year
        System.out.print("Enter a year: ");
        year = input.nextInt();

        // Check if year is leap, set days for Feb
        isLeapYear = year % 4 == 0;
        // User inputs Month
        System.out.println("Enter a month (first three letters): ");
        month = input.next();

        // Print M/Y/D After month is input
        switch (month) {
            case "Jan":
                days = 31;
                System.out.print(month + " " + year + " has " + days + " days.");
                break;

            case "Feb":
                if (isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            case "Mar":
                days = 31;
                break;

            case "Apr":
                days = 30;
                break;

            case "May":
                days = 31;
                break;

            case "Jun":
                days = 30;
                break;

            case "Jul":
                days = 31;
                break;

            case "Aug":
                days = 31;
                break;

            case "Oct":
                days = 31;
                break;

            case "Sep":
                days = 30;
                break;

            case "Nov":
                days = 30;
                break;

            case "Dec":
                days = 31;
                break;
        }
        System.out.print(month + " " + year + " has " + days + " days.");

        input.close();
    }
}

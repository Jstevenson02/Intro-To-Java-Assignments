package repo;
import java.util.Scanner;

public class PasswordMaker2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your fisrst name: ");
        String firstName = scan.next();
        System.out.print("Please enter your lastname: ");
        String lastName = scan.next();
        System.out.print("Please enter your four digit year of birth: ");
        String yob = scan.next();

        System.out.println("Your password = " + firstName.substring(firstName.length() - 2) + lastName.substring(lastName.length() - 2) + yob.substring(yob.length() - 2));

        scan.close();
    }
}

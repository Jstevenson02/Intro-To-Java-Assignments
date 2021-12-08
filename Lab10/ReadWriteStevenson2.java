package repo;

import java.util.Scanner;

public class ReadWriteName2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your fisrst name: ");
        String firstName = scan.next();
        System.out.print("Please enter your lastname: ");
        String lastName = scan.next();
        System.out.println("\nHello " + firstName + ", " + lastName + "!");
        scan.close();
    }
}
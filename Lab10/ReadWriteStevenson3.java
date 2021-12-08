package repo;

import java.util.Scanner;

public class ReadWriteName3
{
     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         System.out.print("Please enter your fisrst name followed by your last name \nbeing seperated" + " from each other by whitespace: ");

         String wholeLine = scan.nextLine();

         System.out.println("\nHello " + wholeLine + "!");

         scan.close();
     }
}
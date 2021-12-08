package repo;

import java.util.Scanner;

public class ReadWriteCapsOrSmallLetters
{
     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         System.out.print("Please enter five words seperated by whitespace only!");
         
         while (scan.hasNextLine()) {
            Scanner s2 = new Scanner(scan.nextLine());
         while (s2.hasNext()) {
            String s = s2.next();
            System.out.println(s.toUpperCase());
            System.out.println(s.toLowerCase());
            }
        }
         scan.close();
     }
}
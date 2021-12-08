package repo;

import java.util.Scanner;

public class IndependenceUSA
{
     public static void main(String[] args) {

        System.out.print("Please enter the date of Independence. The order is Month, Day, Year (no commas): ");
        int c = 1;
        Scanner scan = new Scanner(System.in);
        String stringNeeded = "july 4 1776";
        while (true) 
        {
            if (c >= 3) 
            {
                break;
            }
            else {

            int stringInput = stringNeeded.compareToIgnoreCase(scan.next());

            if (stringInput < 0){
                System.out.println("No, no no! Incorrect!");
            }
                else 
                System.out.println("Hurrah!");
                break;
        }   
    }
        scan.close();
    }
    }
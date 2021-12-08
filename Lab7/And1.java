/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_stevenson;
import java.util.Scanner;
/**
 *
 * @author ar114
 */
public class And1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 and 10: ");
        int number = new Scanner(System.in).nextInt();
        
        if (number >= 0 && number <= 10)
            System.out.println("\nthank you for entering a number " + number);
        else 
            System.out.println("\n" + number + " is not between 0 and 10! What's wrong with your man?");
    }
}

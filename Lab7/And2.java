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
public class And2 {
    public static void main(String[] args) {
        System.out.println("Please enter a number greater than 100 and divisible by 10: ");
        int number = new Scanner(System.in).nextInt();
        
        if (number >= 100 && number % 10 == 0)
            System.out.println("\nthank you for entering a number " + number);
        else 
            System.out.println("\n" + number + " is not greater than 100 and divisible by 10! What's wrong with your man?");
    }
}

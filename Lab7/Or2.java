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
public class Or2 {
    public static void main(String[] args) {
        System.out.println("Please enter a number less than 0 or divisible by 3: ");
        int number = new Scanner(System.in).nextInt();
        
        if (number <= 0 || number % 3 == 0)
            System.out.println("\nthank you for entering a number " + number);
        else 
            System.out.println("\n" + number + " is not greater than 100 and divisible by 10! What's wrong with your man?");
    }
}

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
public class Bonus {

    public static void main(String[] args) {
        // Collect number of units sold YoY
        double bonus = 0.0;
        
        System.out.println("Enter the lastname: ");
        String lastName = new Scanner(System.in).nextLine();
        System.out.println("Enter the firstname: ");
        String firstName = new Scanner(System.in).nextLine();
        System.out.println("Enter the number of units sold this year: ");
        double thisYearsUnits = new Scanner(System.in).nextDouble();
        System.out.println("Enter the number of units sold last year: ");
        double lastYearsUnits = new Scanner(System.in).nextDouble();
        
        if (thisYearsUnits <= 1000) {
            bonus = 25;
        } else if (thisYearsUnits >= 1001) {
            bonus = 50;
        } else if (thisYearsUnits >= 3001) {
            bonus = 100;
        } else if (thisYearsUnits >= 6001)
            bonus = 200;
                   
        System.out.println(firstName + "," + lastName);
        System.out.println("Bonus is " + "$" +bonus);
    }
    
}

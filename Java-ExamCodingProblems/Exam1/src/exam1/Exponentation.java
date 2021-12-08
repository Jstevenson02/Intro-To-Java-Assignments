/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;
import java.util.Scanner;
public class Exponentation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x > 0.0 || x > 0) {
            double z = Math.pow(x, y);
            System.out.println( x + " to the power of " +y +" is " +  z);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

public class RandomLowerCharacter {
    public static void main(String[] args) {
        if (1 > 0) {
             int randomNumber = (int)(Math.random() * 26);
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println((alphabet.charAt(randomNumber)));
        }
        else
        {
            System.out.println("How is one less than zero!! This is madness!");
        }
        if (1 > 0)
        {
            System.out.println("I'm sorry, if you want another  character you'll have to run my program again!");
        }
    }
}


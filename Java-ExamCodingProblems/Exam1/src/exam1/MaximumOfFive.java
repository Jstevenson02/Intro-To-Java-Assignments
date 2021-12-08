/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;
import java.util.Scanner;
import java.lang.Math;
public class MaximumOfFive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while(true) {
        System.out.println("Enter 5 numbers: ");
        int a = input.nextInt();
        int  b = input.nextInt ();
        int  c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
         int result;

    if ( a > b ) 
    {
        if ( a > c ) 
        {
            if ( a > d ) 
            {
                result = a;
            }
            else 
            {
                result = d;
            }
        }
        else if ( c > d ) 
        {
            result = c;
        }
        else 
        {
            result = d;
        }
    }
    else if ( b > c ) 
    {
        if ( b > d ) 
        {
            result = b;
        }
        else 
        {
            result = d;
        }
    }
     else if ( e > c ) 
    {
        if ( e > d ) 
        {
            result = e;
        }
        else 
        {
            result = e;
        }
    }
    else if ( c > d ) 
    {
        result = c;
    }
    else 
    {
        result = d;
    }
        System.out.println("Biggest number of the five is " + result);
    }
    }
    }
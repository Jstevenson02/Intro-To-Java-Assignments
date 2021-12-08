package javaapplication144;

import java.util.Scanner;
public class MinimumOf4WithANDs {

    public static void main(String[] args)
    {
      Scanner scan = new Scanner( System.in);

    
        System.out.println("Please neter 4 numbers to find the minimum of the 4:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int w = scan.nextInt();

        if ( x < y || y < z || z < w || x < w) 
        { 
            if ( x < y && x < z && x < w) 
            { 
                System.out.println("minimum= " + x);
            }
            else if (z < y && z < x && z < w)
            { 
                System.out.println("minimum= " + z);
            }
            else if (w < y && w < z && w < x)
            { 
                System.out.println("minimum= " + w);
            }
            else
            { 
                System.out.println("minimum= " + y);
            }
        }
    }
}

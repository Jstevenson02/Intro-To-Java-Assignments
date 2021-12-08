package javaapplication144;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class MinimumOf4NestedIfs
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner( System.in);

    
        System.out.println("Please neter 3 numbers to find the minimum of the 3:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int w = scan.nextInt();
        
        
        if ( x < y )
            if ( x < z )
                System.out.println("minimum= " + x);
            else
                System.out.println("minimum= " + z);
        else if ( y < z )
                    System.out.println("minimum= " + y);
            else
                System.out.println("minimum= " + z);
        if (y < w)
            if (y < z)
                System.out.println("minimum= "  + y);
            else 
                System.out.println("minimum= " + z);
         if (w < z)
                System.out.println("minimum= " + w);
            else 
                System.out.println("minimum= " + z);
}
}

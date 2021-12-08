package lab4;
import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        
        double x = 4.0;
        int i = 4;
        int j = 0;
        double y = 0;
        
        for (int cupcake = 0 ; cupcake < 10; cupcake++){
            ++j;
            ++y;
            /*
            int j = 1 + z;
            double y = 1.0 + z;
            */
            double a1 = x / y;
            int a2 = i / j;
            double a3 = i % j; 
            
            System.out.println("\n" + "x/y = " + a1);
            System.out.println("i/j = " + a2);
            System.out.println("i%j = " + a3);
            System.out.print("\n" + "i = " + i );
            System.out.print("\n" + "j = " + j );
            System.out.print("\n"+ "x = " + x );
            System.out.print("\n" + "y = " + y );
 
        }
        
       
        /*
        System.out.println("\n" + i + " + " + j + " = " + (i+j));
        System.out.println("\n" + x + " + " + y + " = " + (x+y));
        System.out.println("\n" + "i%j"  + " = " + z);
        */
    }
}
    

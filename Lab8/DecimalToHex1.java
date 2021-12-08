package lab8;
import java.util.Scanner;
public class DecimalToHex1 {
 
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer (0 - 15): ");
        int num = input.nextInt();
        
        switch (num) {
            case 0: System.out.println("The hex value is " + num); break;
            case 1: System.out.println("The hex value is " + num); break;
            case 2: System.out.println("The hex value is " + num); break;
            case 3: System.out.println("The hex value is " + num); break;
            case 4: System.out.println("The hex value is " + num); break;
            case 5: System.out.println("The hex value is " + num); break;
            case 6: System.out.println("The hex value is " + num); break;
            case 7: System.out.println("The hex value is " + num); break;
            case 8: System.out.println("The hex value is " + num); break;
            case 9: System.out.println("The hex value is " + num); break;
            case 10: System.out.println("The hex value is A"); break;
            case 11: System.out.println("The hex value is B"); break;
            case 12: System.out.println("The hex value is C"); break;
            case 13: System.out.println("The hex value is D"); break;
            case 14: System.out.println("The hex value is E"); break;
            case 15: System.out.println("The hex value is F"); break;
            

        }
    }
}
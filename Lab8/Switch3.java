package lab8;
import java.util.Scanner;
public class Switch3 {
 
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a day of the week (1 - 7): ");
        int year = input.nextInt();
        
        switch (year) {
            case 1: System.out.println(year + " " + "Monday"); break;
            case 2: System.out.println(year + " " + "Tuesday"); break;
            case 3: System.out.println(year + " " + "Wednesday"); break;
            case 4: System.out.println(year + " " + "Thursday"); break;
            case 5: System.out.println(year + " " + "Friday"); break;
            case 6: System.out.println(year + " " + "Saturday"); break;
            case 7: System.out.println(year + " " + "Sunday"); break;
        }
    }
}
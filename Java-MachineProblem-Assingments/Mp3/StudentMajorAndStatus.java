
import java.util.Scanner;
public class StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String M = "Mathematics";
        String C = "Computer Science";
        String I = "Information Technology";

        String F = "Freshman";
        String S = "Sophomore";
        String J = "Junior";
        String Se = "Senior";
        
        System.out.print("Enter a single character M/C/I: ");
        String char1 = input.next();
        System.out.print("Enter a single number for Freshman - Senior 1 - 4: ");
        int char2 = input.nextInt();

        switch (char1)
        {
            case "M":
            System.out.print(M);
            break;

            case "C":
            System.out.print(C);
            break;

            case "I":
            System.out.print(I);
            break;

        }
       
        switch (char2)
        {
            case 1: 
            System.out.print(" " + F);
            break;

            case 2:
            System.out.print(" " +S);
            break;

            case 3:
            System.out.print(" " + J);
            break;

            case 4:
            System.out.print(" " + Se);
            break;

            default:
            System.out.print("Invalid Input");


        }

        input.close();
    }
}

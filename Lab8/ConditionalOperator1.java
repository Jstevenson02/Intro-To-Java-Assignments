package lab8;
import java.util.Scanner;

public class ConditionalOperator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter an even number ");
        int number = scan.nextInt();
        if (number % 2 == 0)
            System.out.println("\n" + number + " fulfills the request!");
        else 
            System.out.println("\n" + number + " does not fulfill the request!");
        
        System.out.println(number % 2 == 0 ? " yes sir!" : " no sir!");
    }
}

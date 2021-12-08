package lab8;
import java.util.Scanner;

public class ConditioinalOperator4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter an even number ");
        int number = scan.nextInt();
        System.out.println((number % 2 == 0) ? "fullfills" : "doesn't fulfill");
        System.out.println((number % 2 == 0) ? " yes sir!" : " no sir!");
    }
}

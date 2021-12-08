import java.util.Scanner;
public class DoWhileEvent1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        System.out.println(" Please enter a positive number to add it to sum or -1 to quit.");

        while (num != -1)
        {
            sum += num;
            System.out.println(" Please enter a positive number to add it to sum or -1 to quit.");
            num = scan.nextInt();
        }
        
        scan.close();
        System.out.println( "Total: " + sum);
    }
}

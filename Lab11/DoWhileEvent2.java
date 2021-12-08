import java.util.Scanner;
public class DoWhileEvent2 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int sum = 0;
    do 
    {
        sum += num;
        System.out.println(" Please enter a positive number to add it to sum or -1 to quit.");
        num = scan.nextInt();
    }while (num != -1);

     System.out.println( "Total: " + sum);
     scan.close();
    }
}

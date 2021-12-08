import java.util.Scanner;

public class WhileEvent1 {
    public static void main(String[] args) {
        System.out.println("Please enter ap ositive number to addi t to sum or -1 to quit: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        while (num != -1)
        {
            System.out.println("Please enter a positive number to add it to sum or -1 to quit");
            num = scan.nextInt();
        }
        System.out.println("Total: " + sum);

        scan.close();
    }
}

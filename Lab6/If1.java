import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        System.out.println("Please type a positive number: ");

        if (new Scanner(System.in).nextInt() >= 0)
            System.out.println("You typed a positive number!");

    }
}
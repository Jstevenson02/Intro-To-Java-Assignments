import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        System.out.println("Please type a positive number: ");
        int number;
        if ((number = new Scanner(System.in).nextInt()) % 2 == 0)
            System.out.println("You typed an even number! " +"It was number " + number + "!" );
        else 
            System.out.println("Come on dude! " + number + " is an odd number!");

    }
}
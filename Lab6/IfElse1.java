import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        System.out.println("Please type a positive number: ");
        int number;
        if ((number = new Scanner(System.in).nextInt()) >= 0)
            System.out.println("You typed a positive number! " +"It was number " + number + "!" );
        else 
            System.out.println("Come on dude! " + number + " is not a positive number!");

    }
}
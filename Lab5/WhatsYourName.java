import java.util.Scanner;

public class WhatsYourName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Whats your first name?");
        String userInput = input.nextLine();
        System.out.println("Whats your last name?");
        String userInput2 = input.nextLine();
        System.out.print(userInput.toString()+ " " + userInput2.toString());
        input.close();
    }        
}

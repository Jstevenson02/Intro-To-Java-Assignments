import java.util.Scanner;

public class WhatsYourSSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Whats your first SSN?");
        String userInput = input.nextLine();
        System.out.print(userInput.toString());
        input.close();
    }        
}

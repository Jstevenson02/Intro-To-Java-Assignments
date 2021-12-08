import java.util.Scanner;

class Problem0 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        String userInput;

        System.out.println("Q\\q to exit or enter a string to translate:");
        userInput = scanIn.next().trim().toLowerCase();

        do {
            output.append(userInput);
            output.reverse();

            System.out.println(output);
            output.setLength(0);
            System.out.println("Q\\q to exit or enter a string to translate:");

            userInput = scanIn.next().trim().toLowerCase();

        } while (!userInput.equalsIgnoreCase("q"));
        System.out.println("Exiting...");
    }
    
}
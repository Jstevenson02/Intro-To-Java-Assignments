import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) { 

            System.out.println("Enter two doubles: ");
            double userInput1 = input.nextInt();
            System.out.println(userInput1);
            double userInput2 = input.nextInt();
            System.out.println(userInput2);
            double answer1 = Math.pow(userInput1, userInput2);
            double answer2 = Math.pow(userInput2, userInput1);
            System.out.println(answer1);
            System.out.println(answer2);
            input.close();
        }
    }   
}

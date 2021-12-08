
import java.util.Scanner;

public class DivisionQuiz {

    public static void main(String[] args) {
        // 1. Generate two random single-digit integers
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        int number3 = (int) (Math.random() * 100);
        int number4 = (int) (Math.random() * 100);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number4 < number3) {
            int temp2 = number3;
            number3 = number4;
            number4 = temp2;
        }
        

        // 3. Prompt the student to answer "what is number1 − number2?"
        System.out.print("What is " + number1 + " / " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        System.out.print("What is " + number3 + " % " + number4 + "? ");
        int answer2 = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 / number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " / " + number2
                    + " should be " + (number1 / number2));
        }
        if (number3 % number4 == answer2) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number3 + " % " + number4
                    + " should be " + (number3 % number4));
        }
    }
}

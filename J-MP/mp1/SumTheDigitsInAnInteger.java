import java.util.ArrayList;
import java.util.Scanner;

public class SumTheDigitsInAnInteger {
   private static int totalOutput;
    public static void main(String[] args) {

        ArrayList<Integer> userInputIntegers = new ArrayList<>();

        Scanner integer = new Scanner(System.in);

        int iterate = 0;

        while(iterate <= 9) {
            System.out.println("Enter an Integer between 0 and 1000.");
            int i = integer.nextInt();
            userInputIntegers.add(i);
            System.out.println("int added");
            System.out.println(i);
            totalOutput = i + totalOutput;
            iterate++;
        }
        System.out.println(userInputIntegers);
        System.out.println(totalOutput);
    
        integer.close();
    }
}

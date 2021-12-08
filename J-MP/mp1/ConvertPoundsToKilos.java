import java.util.Scanner;

public class ConvertPoundsToKilos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kilosOutput; 
        
        while(true) {
            System.out.println("Enter a weight in pounds.");
            double userInput = scan.nextDouble();
         
            kilosOutput = (userInput * 0.454);
            System.out.println("The weight in kilos is: " + kilosOutput + "kg");

            scan.close();
        }


    }
}
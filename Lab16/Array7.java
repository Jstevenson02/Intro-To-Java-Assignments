import java.util.*;
public class Array7 {
    
    public static void main(String[] args) {       
    
        var inputNumbers = new int[5];

        var prompt = new Scanner(System.in);
        
        System.out.println("Give me 5 whole numbers in the range of 10 to 20.");

        for(int i=0; i<5 ; i++){
            
            // Prompt for Input
            System.out.print("Number " + (i+1) + ": ");            
            var number = prompt.nextInt();
            
            // Continue Prompting if they enter a value out of range
            while(number < 10 || number > 20){

                // Prompt for Input Again
                System.out.println("Only 10 - 20 Allowed");
                System.out.print("Number " + (i+1) + ": ");            
                number = prompt.nextInt();
            }

            // Add Number to Array
            inputNumbers[i] = number;
        }

        prompt.close();

        // Find Max Value and Index
        int maxValue = 0;
        int maxIndex = 0;

        // Print Numbers
        System.out.print("Your Chosen Numbers Were : ");
        for (int i = 0; i < inputNumbers.length; i++) {
            var currentValue = inputNumbers[i];
            if(currentValue > maxValue){
                maxValue = currentValue;
                maxIndex = i;
            }
            System.out.print(inputNumbers[i] + " ");            
        }
        
        // Print Max Number and it's Index
        System.out.print("\r\nYour Max Value was : " + maxValue + " at Index: " + maxIndex);
    }
}

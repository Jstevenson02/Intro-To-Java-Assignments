import java.util.Random;

public class Array6 {
    public static void main(String[] args) {       
        
        Random r = new Random();        
        String[] smallLetters = new String[10];

        for (int i = 0; i < smallLetters.length; i++) {

            // Random Letter
            char letter = (char) (r.nextInt(26) + 'a');
            smallLetters[i] = Character.toString(letter);

            System.out.print(smallLetters[i] + " ");    
        }
        System.out.println();

        // Reverse Line
        for (int i = smallLetters.length - 1; i >= 0; i--) {
            System.out.print(smallLetters[i] + " ");    
        }
    }
}

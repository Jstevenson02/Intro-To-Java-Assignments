import java.util.Scanner;
import java.security.cert.PolicyNode;
import java.util.Random;

public class DiceGame {
    private static int lastPoint = 0;

    public static int getDice() {
        
        Random randomGenerator = new Random();
        int dice1 = randomGenerator.nextInt(6) + 1;
        int dice2 = randomGenerator.nextInt(6) + 1;
        int dice = dice1 + dice2;

        System.out.println("You rolled " + dice1 + " + " + dice2 + " point is " + dice);

        return dice;
    }

    public static String decide(int dice) {
        String result = "";

        if (dice == 7 || dice == 11) {
            System.out.println("You win.");
            result = "WIN";
        } else if (dice == 2 || dice == 3 || dice == 12) {
            System.out.println("You lose.");
            result = "LOSE";
        } else {
            result = "POINT";
        }
        return result;
    }

    public static char menu() {

        System.out.println("----Play-a-Game-of-Dice?----");
        System.out.print("Y/N: ");
        String answer = new Scanner(System.in).next();
        char a = answer.charAt(0);
        return a;
    }

    public static void main(String[] args) {
        int wins = 0;
        int losses = 0;
        
        while (menu() == 'y') {
            lastPoint = 0;

            int sum = getDice();
            String result = decide(sum);

            while (result.compareTo("POINT") == 0) 
            {
                sum = getDice();
                result = decide(sum);
            }

            // Keep Score
            switch(result.toLowerCase()){
                case "win":
                    wins++;
                    break;
                case "lose":
                    losses++;
                    break;
            }
            
            System.out.println("W/L: " + wins + " " + losses);
            System.out.println("___________________________");
        }
    }
}
import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        System.out.println("Please type a positive number: ");
        Scanner scan = new Scanner(System.in);
        double todaysTemp = scan.nextDouble();
        if (todaysTemp > 120)
            System.out.println("Come on dude be serious! " + todaysTemp + " degrees?!" );
        else if (todaysTemp > 100)
            System.out.println("Very, very hot today! " + todaysTemp + " degrees is hot as hell!");
        else if (todaysTemp > 85)
            System.out.println("Hot at " + todaysTemp + " degrees!");
        else if (todaysTemp > 70)
            System.out.println("Pleasant, at a nice " + todaysTemp + "degrees.");
        else if (todaysTemp > 40)
            System.out.println("A bit cold at " + todaysTemp + " degrees today");
        else
         System.out.println("Brrrrrr Ice Cold at " + todaysTemp + " degrees today!");
    }
}
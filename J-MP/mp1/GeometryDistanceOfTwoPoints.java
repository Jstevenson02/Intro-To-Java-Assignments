import java.util.Scanner;


public class GeometryDistanceOfTwoPoints {
    public static void main(String[] args) {
        
        // INPUT
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the x1: ");
        Double x1 = userInput.nextDouble();
        System.out.println("Enter the y1: ");
        Double y1 = userInput.nextDouble();
        System.out.println("Enter the x2: ");
        Double x2 = userInput.nextDouble();
        System.out.println("Enter the y2: ");
        Double y2 = userInput.nextDouble();

        // OUTPUT
        Double finalDistance = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        System.out.println("The distance between the two points is: " + Math.sqrt(finalDistance));

        userInput.close();
    }
}
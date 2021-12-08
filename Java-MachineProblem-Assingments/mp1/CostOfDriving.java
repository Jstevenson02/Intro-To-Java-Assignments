import java.util.Scanner;


public class CostOfDriving {
    public static void main(String[] args) {
        
        // INPUT
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the distance to drive: ");
        Double distanceDriven = userInput.nextDouble();
        System.out.println("Enter the fuel efficiency of the car (MPG): ");
        Double fuelEfficiency = userInput.nextDouble();
        System.out.println("Enter the price per gallon ($): ");
        Double pricePerGallon = userInput.nextDouble();
        // OUTPUT
        Double totalMiles = (distanceDriven / fuelEfficiency);
        Double costOfDriving = (totalMiles * pricePerGallon);


        System.out.println("The cost of driving is: " + costOfDriving);

        userInput.close();
    }

}
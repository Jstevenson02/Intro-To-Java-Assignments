import java.util.Scanner;

public class Lab3
{
    public static void main(String[] args)
    {
        // Ask for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height (feet) : ");
        double height;
        height = input.nextDouble();
        System.out.println("Enter the width (feet) : ");
        double width;
        width = input.nextDouble();

        // Calculate
        double area;
        area = height * width;
        final double GALLONS_PER_SQUARE_FEET = 150.0;
        double gallons;
        gallons = area/GALLONS_PER_SQUARE_FEET;

        // Print
        System.out.println("The amount of pain is " + gallons + " gallons.");
    }
}

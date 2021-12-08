import java.util.Scanner;

public class ArraysAndMethodsGames {
    
    public static double average(double[] array)
    {
        double total = 0;
        for (double d : array) {
            total += d;
        }       

        return total / array.length;
    }

    public static double[] readArray()
    {
        var doubleValues = new double[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Give me 10 double values:");

        int arrayIndex = 0;
        while(arrayIndex < doubleValues.length){            
            var dValue = input.nextDouble();
            doubleValues[arrayIndex] = dValue;
            arrayIndex++;
        }

        input.close();

        return doubleValues;
    }

    public static double min(double[] array)
    {
        double minValue = Double.MAX_VALUE;
        for (double d : array) {
            if(d<minValue)
            {
                minValue = d;
            }
        }
        return minValue;
    }

    public static void main(String[] args)
    {
        var array = readArray();
        var average = average(array);
        System.out.println("Average: " + average);

        var minArray = new double[] {7, 55, 33, 2, 345, 21, 23,8, 99, 1230};
        System.out.println("Min Value: " + min(minArray));
    }
}

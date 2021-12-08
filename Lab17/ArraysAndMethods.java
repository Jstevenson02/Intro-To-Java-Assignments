public class ArraysAndMethods {
    public static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] reverse(int[] list)
    {
        int[] result = new int[list.length];
        for(int i=0, j = result.length-1; i<list.length;i++, j--)
        {
            result[j] = list[i];
        }
        return result;
    }

    public static int linearSearch(int[] list, int key)
    {
        int indexFound = -1;
        for(int i=0; i<list.length; ++i)
        {
            if(list[i] == key)
            {
                indexFound = i;
            }
        }
        return indexFound;
    }

    public static void modifyTheArray(int[] array)
    {
        for (int i=0; i<array.length;)
        {
            array[i] = array[i++] + 10;
        }
    }

    public static void main(String[] args)
    {
        int[] ar = {1,2,3,4,5};
        printArray(ar);
        printArray(new int[]{3,1,2,6,4});

        int[] ar2 = reverse(ar);
        printArray(ar2);

        System.out.println(linearSearch(ar, 5) != -1 ?
            "found at index " + Integer.toString(linearSearch(ar, 5)) :
            "not found at index " + Integer.toString(linearSearch(ar, 5)) );

        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        java.util.Arrays.sort(numbers);

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        java.util.Arrays.sort(chars);

        for(double d: numbers)
            System.out.print(d + "  " );
        System.out.println();        

        for(char c: chars)
            System.out.print(c + "  " );        
        System.out.println();

        modifyTheArray(ar);
        printArray(ar);

        
     }
}

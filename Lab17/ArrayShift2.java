public class ArrayShift2 {
    public static void main (String[] args){
        int[] ar = {1,2,3,4,5};
        
        // Capture Last Element (instead of first)
        int temp = ar[ar.length-1];
        
        // Start at second to last, and loop until first position
        for (int i=ar.length-2; i >= 0; i--)
        {
            // Copy Left Element to the Right (instead of right to left)
            ar[i+1] = ar[i];
        }

        // Put Last Element in First Position (instead of last)
        ar[0] = temp;

        for(int value: ar)
            System.out.print(value + " ");
    }
}

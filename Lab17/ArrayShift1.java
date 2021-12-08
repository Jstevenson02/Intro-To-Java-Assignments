public class ArrayShift1{
    public static void main (String[] args){
        int[] ar = {1,2,3,4,5};
        int temp = ar[0];
        for (int i=1; i < ar.length; ++i)
        ar[i-1] = ar[i];

        ar[ar.length-1] = temp;

        for(int value: ar)
        System.out.print(value + " ");
    }
}
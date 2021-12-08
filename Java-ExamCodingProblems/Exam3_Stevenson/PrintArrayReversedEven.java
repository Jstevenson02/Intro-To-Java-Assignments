public class PrintArrayReversedEven {
    public static void printRE(int[] array) {
        for (int i = array.length-1; i >= 0; i--) {  
            if (array[i] % 2 == 0){
                System.out.print(array[i] + " ");  
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printRE(new int[] { 1, 2, 3 });
        printRE(new int[2]);
        printRE(new int[] { 2, 4, 7, 8 });
    }
}
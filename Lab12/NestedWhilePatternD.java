public class NestedWhilePatternD {
    public static void main(String args[]) {
       int row = 6;
        int i = row;
        while ( i >= 1) {
            int j = row;
            while ( j > i) {
                System.out.print(" ");
                j--;
            }
            int num = 1;
            int k = 1;
            System.out.print(" ");
            while ( k <= i) {
                System.out.print(num);
                k++;
                num++;
            }
            System.out.println(" ");
            i--;
        }
    }
}

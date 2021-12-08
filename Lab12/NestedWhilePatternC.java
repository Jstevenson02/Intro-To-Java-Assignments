public class NestedWhilePatternC {
    public static void main(String args[]) {
        int i = 0, j, row = 6;
        while (i < row) {
            j = 2 * (row - i);
            while (j >= 0) {
                System.out.print(" ");
                j--;
            }
            j = 0;
            int num = 1;
            while ( j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
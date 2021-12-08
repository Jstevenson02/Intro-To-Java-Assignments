//                                                    /       \
//_______________________________________________    (\-"```"-/)
//---This-code-was-compiled-by-jstevenson02-wri---   //^\   /^\\
//---tten-by-jstevenson--for-ASDV-1220-L01-2021---  ;/ ~_\ /_~ \;
//---if-you-have-any-questions-or-concerns-dire--- (,  \0/ \0/  ,)
//---ct-them-to-jacobstevenson2@my.solacc.edu-----  |   /   \   |
//________________________________________________  | (_\._./_) |
//                                                   \ \v-.-v/ /
//                                                    \ `===' /
//                                                     `-~~~-`
//                                                        \/
import java.util.Scanner;
class LargestBlock {

    private static final class Square {
        private final int x, y, size;

        public Square(int x, int y, int size) {
            super();
            this.x = x;
            this.y = y;
            this.size = size;
        }

        @Override
        public String toString() {
            return String.format("The maximum square submatrix is at (%d,%d) with size: %d", x, y, size);
        }
    }
    public static void main(String[] args) {

        int m, n, i, j;
        Scanner in = null;
        in = new Scanner(System.in);
        System.out.println("Enter the number " + "of rows of the matrix");
        m = in.nextInt();
        System.out.println("Enter the number " + "of columns of the matrix");
        n = in.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                matrix[i][j] = in.nextInt();

        System.out.println("Elements of the matrix are");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
        Square sq = sumOfAnySubMatrix(matrix);
        System.out.println("Largest square: " + sq);
    }

    private static Square sumOfAnySubMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        final int height = matrix.length;
        final int width = matrix[0].length;

        Square max = null;

        int[] previous = null;
        int[] current = matrix[0];

        for (int y = 1; y < height; y++) {
            previous = current;
            current = new int[width];
            for (int x = 0; x < width; x++) {
                if (matrix[y][x] == 1) {
                    int span = 1;
                    if (x > 0) {
                        span = 1 + Math.min(current[x - 1], Math.min(previous[x], previous[x - 1]));
                    }
                    if (max == null || span > max.size) {
                        max = new Square(x - span + 1, y - span + 1, span);
                    }
                    current[x] = span;
                }
            }
        }
        return max;
    }
}

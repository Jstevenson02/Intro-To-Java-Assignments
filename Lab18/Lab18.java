import java.util.Arrays;
import java.util.stream.Stream;

public class Lab18 {
    static void print(int[][] a1) {
        System.out.println();
        for (int i = 0; i < a1.length; ++i) {
            for (int j = 0; j < a1[i].length; ++j) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void print(String[][] a1) {
        System.out.println();
        for (int i = 0; i < a1.length; ++i) {
            for (int j = 0; j < a1[i].length; ++j) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void initializeArray(int[][] a1) {
        for (int i = 0; i < a1.length; ++i) {
            for (int j = 0; j < a1[i].length; ++j) {
                a1[i][j] = (int) (Math.random() * 11);
            }
        }
    }

    static int[][] dup(int[][] a1) {
        int[][] dupArray = new int[a1.length][a1[0].length];

        for (int i = 0; i < a1.length; ++i) {
            for (int j = 0; j < a1.length; ++j) {
                dupArray[i][j] = a1[i][j];
            }
        }
        return dupArray;
    }

    static void selectionSort(int[] ar1) {
        for (int i = 0; i < ar1.length - 1; ++i) {
            for (int j = i + 1; j < ar1.length; ++j) {
                if (ar1[i] > ar1[j]) {
                    int temp = ar1[i];
                    ar1[i] = ar1[j];
                    ar1[j] = temp;
                }
            }
        }
    }

    static void selectionSort(String[] ar2) {

        for (int i = 0; i < ar2.length - 1; ++i) {
            for (int j = i + 1; j < ar2.length; ++j) {
                if (ar2[i].compareToIgnoreCase(ar2[j]) > 0) {
                    String temp = ar2[i];
                    ar2[i] = ar2[j];
                    ar2[j] = temp;
                }
            }
        }
    }

    static void printColumnMajorOrder(String[][] a1) {
        int longestRowLength = a1[0].length;

        for (int i = 0; i < longestRowLength; i++) {
            for (int j = 0; j < a1.length; j++) {
                if (a1[i].length <= j)
                    continue;
                System.out.print(a1[i][j].toString() + " ");
            }
            System.out.println();
        }
    }

    static void printRow(int[] rowOf2D) {
        for (int i = 0; i < rowOf2D.length; ++i) {
            System.out.print(rowOf2D[i] + " ");
        }
        System.out.println();
    }

    static void print(int[][][] a1) {
        System.out.println();
        for (int i = 0; i < a1.length; ++i) {
            System.out.println("\nTable: " + (i + 1));
            for (int j = 0; j < a1[i].length; ++j) {
                for (int k = 0; k < a1[i][j].length; ++k) {
                    System.out.print(a1[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] a1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        print(a1);

        String[][] a2 = { { "john", "paul", "james" }, { "mary", "laura", "margaret" } };
        print(a2);

        int[][] a3 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        initializeArray(a3);
        print(a3);

        int[][] duplicateArray = dup(a1);
        print(duplicateArray);

        String[][] a4 = { { "ASDV", "MATH", "ENGL" }, { "BIOL", "CHEM" }, { "PHYS" } };
        print(a4);
        System.out.println();
        printColumnMajorOrder(a4);
        System.out.println();
        printRow(a1[1]);

        int[][][] a5 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { -1 } },
                { { 7, 8, 9 }, { 10, 11 }, { 12, 13, 14, 15 } } };
        print(a5);

        System.out.println();
        int[] ar6 = { 33, 12, 7, 1, 88 };
        selectionSort(ar6);
        System.out.println(Arrays.toString(ar6));

        System.out.println();
        String[] ar7 = { "john", "Mary", "Paul", "nick", "Peter", "anna" };
        selectionSort(ar7);
        System.out.println(Arrays.toString(ar7));
    }
}
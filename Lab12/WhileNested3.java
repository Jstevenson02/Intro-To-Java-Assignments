public class WhileNested3 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) 
        {
            System.out.print("(i,j) = ");
            int j = 0;
            while (j < 4) 
            {
                System.out.print("(" + i + "," + j + ")");
                ++j;
            } 
            System.out.println();
            ++i;
        }
    }
}

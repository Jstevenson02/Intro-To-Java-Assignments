public class ForNested1 {
    public static void main(String[] args) {
        for (int i=0; i<3; ++i)
        {
            System.out.print("(i,j) = ");
            for (int j=0; j<4; ++j)
            {
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }
    }
}
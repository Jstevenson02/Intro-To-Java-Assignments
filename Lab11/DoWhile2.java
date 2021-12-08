
public class DoWhile2 {
    public static void main(String[] args) {
        int num = 1;
        int i = 0;

        do {
            System.out.print(num + ",");
            ++i;
            ++num;
            if (i == 10) {
                System.out.println();
                i = 0;
            } else {
            }
        } while (num < 101);

    }
}

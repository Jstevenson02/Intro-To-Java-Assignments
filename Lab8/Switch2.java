package lab8;

public class Switch2 {

    public static void main(String[] args) {

        int x = 1;
        int a = 3;

        switch (a) {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                x += 5;
                System.out.println(x);
                break;
            case 2:
                x += 10;
                System.out.println(x);
                break;
            case 3:
                x += 16;
                System.out.println(x);
                break;
            case 4:
                x += 34;
                System.out.println(x);
                break;
        }
    }
}

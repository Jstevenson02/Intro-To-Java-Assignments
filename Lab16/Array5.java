public class Array5 {
    public static void main(String[] args) {
        String[] alphaBetics = new String[5];
        final int NAME_SIZE = 20;

        for (int i = 0; i < alphaBetics.length; i++) {
            System.out.println(alphaBetics[i]);
        }
        for (int i = 0; i < alphaBetics.length; i++) {
            alphaBetics[i] = "index " + Integer.toString(i) + " ";
        }

        for (int i = 0; i < alphaBetics.length; i++) {
            for (int j = 0; j < NAME_SIZE; j++) {
                alphaBetics[i] += (char) (65 + Math.random() * 26);
            }
        }
        for (int i = 0; i < alphaBetics.length; i++) {
            System.out.println(alphaBetics[i]);
        }
    }
}

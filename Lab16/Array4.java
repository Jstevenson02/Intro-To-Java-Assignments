public class Array4 {
    public static void main(String[] args) {

        int[] nums = new int[33];

        for (int i = 0; i < nums.length; i++) {
            double ranNum = Math.random() * 100;
            nums[i] = (int) ranNum;
        }
        for (int i = 0; i < nums.length; i++) {

            if (i % 4 == 0) {
                System.out.println();
            } else
                System.out.print(nums[i] + " ");
        }
    }
}
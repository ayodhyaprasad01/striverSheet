import java.util.Arrays;

public class MaximalSAfterAplyKOp {
    public long maxKelements(int[] nums, int k) {

        Arrays.sort(nums);

        long sc = 0;

        while (k > 0) {

            int lar = nums[nums.length - 1];
            sc += lar;
            nums[nums.length - 1] = (int) Math.ceil(lar / 3.0);
            Arrays.sort(nums);
            k--;

        }

        return sc;

    }

    public static void main(String[] args) {

        MaximalSAfterAplyKOp solution = new MaximalSAfterAplyKOp();
        int l = 3;
        int[] arr = { 1, 10, 3, 3, 3 };
        System.out.println(solution.maxKelements(arr, l));

    }
}

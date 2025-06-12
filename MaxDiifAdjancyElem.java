public class MaxDiifAdjancyElem {
    public int maxAdjacentDistance(int[] nums) {
        // int max=Integer.MIN_VALUE;
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, Math.abs(nums[i] - nums[i + 1]));
        }
        if (max < Math.abs(nums[nums.length - 1] - nums[0])) {
            max = Math.abs(nums[nums.length - 1] - nums[0]);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxDiifAdjancyElem solution = new MaxDiifAdjancyElem();
        int[] nums = { 1, 3, 6, 10, 15 };
        System.out.println(solution.maxAdjacentDistance(nums)); // Output: 5
    }
}

public class TargetSum {

    public int findTargetSumWays(int[] nums, int target) {

        return calculate(nums, 0, 0, target);
    }

    public int calculate(int[] nums, int index, int sum, int target) {

        if (index == nums.length) {
            if (sum == target)
                return 1;
            return 0;
        }

        int ways = calculate(nums, index + 1, sum + nums[index], target) + calculate(nums, index +
                1, sum - nums[index], target);
        return ways;
    }

    public static void main(String[] args) {
        TargetSum targetSum = new TargetSum();
        int[] nums = { 1, 1, 1, 1, 1 };
        int target = 3;
        System.out.println(targetSum.findTargetSumWays(nums, target));

    }

}

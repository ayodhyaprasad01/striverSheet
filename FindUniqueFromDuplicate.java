public class FindUniqueFromDuplicate {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }
        if (xor == 0) {
            return 0;
        }
        return xor;
    }

    public static void main(String[] args) {
        FindUniqueFromDuplicate finder = new FindUniqueFromDuplicate();
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(finder.singleNumber(nums)); // Example usage
    }
}

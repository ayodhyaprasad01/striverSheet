import java.util.Arrays;

public class BS {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums); // Sort the array
        int n = nums.length;
        int count = 0;

        for (int c = n - 1; c >= 2; c--) {
            int a = 0; // Start pointer for the smallest side
            int b = c - 1; // Pointer for the middle side

            while (a < b) {
                // Check if a + b > c
                if (nums[a] + nums[b] > nums[c]) {
                    count += (b - a); // All pairs between a and b are valid
                    b--; // Move the middle pointer left
                } else {
                    a++; // Move the smallest pointer right
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        BS bs = new BS();
        int[] nums = { 2, 2, 3, 4 };
        System.out.println(bs.triangleNumber(nums));

    }
}
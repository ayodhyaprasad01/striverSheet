public class BinarySearchWithUniqueElement {
    public int findUniqueElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure mid is even
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the pair is valid
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // Move to the right side
            } else {
                right = mid; // Move to the left side
            }
        }

        return nums[left]; // The unique element
    }

    public static void main(String[] args) {
        BinarySearchWithUniqueElement solution = new BinarySearchWithUniqueElement();
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
        int uniqueElement = solution.findUniqueElement(nums);
        System.out.println("The unique element is: " + uniqueElement);
    }
}

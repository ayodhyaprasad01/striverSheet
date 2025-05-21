public class MedianOfSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0, right = m;
        while (left <= right) {
            int part1 = (left + right) / 2;
            int part2 = (m + n + 1) / 2 - part1;

            int maxLeft1 = (part1 == 0) ? Integer.MIN_VALUE : nums1[part1 - 1];
            int minRight1 = (part1 == m) ? Integer.MAX_VALUE : nums1[part1];

            int maxLeft2 = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2 - 1];
            int minRight2 = (part2 == n) ? Integer.MAX_VALUE : nums2[part2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                }
                return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
            } else if (maxLeft1 > minRight2) {
                right = part1 - 1;
            } else {
                left = part1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted :");
    }

    public static void main(String arg[]) {
        MedianOfSortedArrays obj = new MedianOfSortedArrays();
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));

    }
}

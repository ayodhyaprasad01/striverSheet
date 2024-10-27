public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }

        }

        while (i < m) {
            result[k++] = nums1[i++];
        }

        while (j < n) {
            result[k++] = nums2[j++];
        }

        if (n == 0) {
            return nums1;
        } else if (m == 0) {
            return nums2;
        }

        return result;
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = { 1, 2, 3, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int[] result = mergeSortedArray.merge(nums1, 3, nums2, 3);
        for (int i : result) {
            System.out.println(i);
        }

    }
}

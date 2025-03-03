public class StringAppend {

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        for (int[] arr : nums1) {
            System.out.println(arr[0]);
        }
        return nums2;

    }

    public static void main(String[] args) {
        StringAppend sa = new StringAppend();
        int[][] nums1 = { { 144, 2, 44 }, { 45, 5, 6 } };
        int[][] nums2 = { { 8, 9, 10 }, { 11, 12, 13 } };
        sa.mergeArrays(nums1, nums2);

    }

}

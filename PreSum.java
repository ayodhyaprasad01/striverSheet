public class PreSum {
    private int[] prefixSum;

    // Build prefix sum array from input array
    public void buildPrefixSum(int[] arr) {
        int n = arr.length;
        prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
    }

    // Get sum of range from index l to r (inclusive)
    public int getRangeSum(int l, int r) {
        if (l == 0) {
            return prefixSum[r];
        }
        return prefixSum[r] - prefixSum[l - 1];
    }

    public static void main(String[] args) {
        PreSum ps = new PreSum();
        int[] arr = { 1, 2, 3, 4, 5 };

        // Build prefix sum array
        ps.buildPrefixSum(arr);

        // Print original array
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Print prefix sum array
        System.out.println("\n\nPrefix Sum Array:");
        for (int num : ps.prefixSum) {
            System.out.print(num + " ");
        }

        // Demo range sum queries
        System.out.println("\n\nRange Sum Queries:");
        System.out.println("Sum[0-2]: " + ps.getRangeSum(0, 2));
        System.out.println("Sum[1-3]: " + ps.getRangeSum(1, 3));
        System.out.println("Sum[2-4]: " + ps.getRangeSum(2, 4));
    }
}
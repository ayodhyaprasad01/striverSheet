public class PrefixSum {

    static int[] prefixSum(int[] arr) {

        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {

        int arr[] = prefixSum(new int[] { 1, 2, 3, 4, 5, 6 });

        for (int i : arr) {
            System.out.println(i);
        }
    }
}

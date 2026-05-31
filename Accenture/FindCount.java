public class FindCount {
    int findCount(int arr[], int length, int num, int diff) {
        int count = 0;
        for (int i : arr) {
            if (Math.abs(i - num) <= diff) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FindCount fc = new FindCount();
        int[] arr = { 12, 3, 14, 56, 77, 13 };
        int length = arr.length;
        int num = 13;
        int diff = 2;
        System.out.println(fc.findCount(arr, length, num, diff));
    }
}

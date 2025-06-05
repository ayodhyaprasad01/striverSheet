public class SumTwoNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 6;

        // Find two numbers that sum to the target
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Numbers found: " + arr[i] + " and " + arr[j]);
                    return;
                }
            }
        }
        System.out.println("No two numbers found that sum to " + target);
    }

}

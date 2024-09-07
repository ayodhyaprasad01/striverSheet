public class Array {

    public int[] twoOddNum(int Arr[], int N) {
        // Step 1: XOR all elements in the array
        int xor = 0;
        for (int i = 0; i < N; i++) {
            xor ^= Arr[i];
        }

        // Step 2: Find the rightmost set bit in xor
        int setBit = xor & ~(xor - 1);

        // Step 3: Divide elements into two groups and XOR
        int x = 0, y = 0;
        for (int i = 0; i < N; i++) {
            
            if ((Arr[i] & setBit) != 0) {
                x ^= Arr[i];
            } else {
                y ^= Arr[i];
            }
        }

        // Step 4: Return the two numbers in decreasing order
        if (x > y) {
            return new int[] { x, y };
        } else {
            return new int[] { y, x };
        }
    }

    public static void main(String[] args) {
        Array sol = new Array();
        int[] result1 = sol.twoOddNum(new int[] { 4, 2, 4, 5, 2, 3, 3, 1 }, 8);
        System.out.println(result1[0] + " " + result1[1]); // Output: 5 1

        int[] result2 = sol.twoOddNum(new int[] { 1, 7, 5, 7, 5, 4, 7, 4 }, 8);
        System.out.println(result2[0] + " " + result2[1]); // Output: 7 1
    }
}

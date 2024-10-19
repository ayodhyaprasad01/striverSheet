public class SwapTwoIntger {

    public static int maximumSwap(int num) {
        // Convert the number into a char array of digits
        char[] digits = Integer.toString(num).toCharArray();

        // Array to store the index of the last occurrence of each digit (0-9)
        int[] last = new int[10];

        // Fill the last array with the last occurrence of each digit
        for (int i = 0; i < digits.length; i++) {
            last[digits[i] - '0'] = i;
        }

        // Traverse the digits, and for each digit, check if there is a larger digit
        // later
        for (int i = 0; i < digits.length; i++) {
            // Check for a larger digit to swap from 9 down to the current digit
            for (int d = 9; d > digits[i] - '0'; d--) {
                // If a larger digit exists later, swap
                if (last[d] > i) {
                    // Swap digits[i] with digits[last[d]]
                    char temp = digits[i];
                    digits[i] = digits[last[d]];
                    digits[last[d]] = temp;

                    // Return the new integer after the swap
                    return Integer.parseInt(new String(digits));
                }
            }
        }

        // If no swap was made, return the original number
        return num;
    }

    public static void main(String[] args) {
        // Test examples
        System.out.println(maximumSwap(2736)); // Output: 7236
        System.out.println(maximumSwap(9973)); // Output: 9973
    }
}

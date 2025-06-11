import java.util.Arrays;

public class MaxDiffBetOddAndEvenCharII {
    public int maxDifference(String s, int k) {
        int n = s.length();
        int result = Integer.MIN_VALUE;

        for (char ca = '0'; ca <= '4'; ca++) {
            for (char cb = '0'; cb <= '4'; cb++) {
                if (ca == cb)
                    continue;

                int[] minDiffByState = new int[4];
                Arrays.fill(minDiffByState, Integer.MAX_VALUE);

                int prefixCountA = 0, prefixCountB = 0;
                int startCountA = 0, startCountB = 0;
                int start = -1;

                for (int end = 0; end < n; end++) {
                    char ch = s.charAt(end);
                    if (ch == ca)
                        prefixCountA++;
                    if (ch == cb)
                        prefixCountB++;

                    while (end - start >= k && prefixCountB - startCountB >= 2) {
                        int state = parityState(startCountA, startCountB);
                        int diff = startCountA - startCountB;
                        if (diff < minDiffByState[state]) {
                            minDiffByState[state] = diff;
                        }
                        start++;
                        char ch2 = s.charAt(start);
                        if (ch2 == ca)
                            startCountA++;
                        if (ch2 == cb)
                            startCountB++;
                    }

                    int endState = parityState(prefixCountA, prefixCountB);
                    int requiredState = endState ^ 0b10;
                    int bestPrev = minDiffByState[requiredState];
                    if (bestPrev != Integer.MAX_VALUE) {
                        int currDiff = (prefixCountA - prefixCountB) - bestPrev;
                        if (currDiff > result) {
                            result = currDiff;
                        }
                    }
                }
            }
        }
        return result;
    }

    int parityState(int countA, int countB) {
        return ((countA & 1) << 1) | (countB & 1);
    }

    public static void main(String[] args) {
        MaxDiffBetOddAndEvenCharII solution = new MaxDiffBetOddAndEvenCharII();
        System.out.println(solution.maxDifference("1234123412341234", 4)); // Example output
        System.out.println(solution.maxDifference("0000111122223333", 4)); // Example output
        System.out.println(solution.maxDifference("1234567890", 3)); // Example output
        System.out.println(solution.maxDifference("1111222233334444", 2)); // Example output
        System.out.println(solution.maxDifference("0000", 1)); // Example output
    }
}

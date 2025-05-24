class Gain {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long baseSum = 0;
        long sumPos = 0;
        int countPos = 0;
        long minPosGain = Long.MAX_VALUE;
        long maxNonPosGain = Long.MIN_VALUE;

        // Compute base sum and gains
        for (int x : nums) {
            baseSum += x;
            long g = (x ^ k) - x;
            if (g > 0) {
                sumPos += g;
                countPos++;
                minPosGain = Math.min(minPosGain, g);
            } else {
                maxNonPosGain = Math.max(maxNonPosGain, g);
            }
        }

        // Determine best extra gain under the parity constraint
        long bestGain;
        if (countPos % 2 == 0) {
            // Even count of positive flips → we can take them all
            bestGain = sumPos;
        } else {
            // Odd count → drop one small positive or add one non-positive
            long dropOne = (countPos > 0 ? sumPos - minPosGain : 0);
            long addNonPos = (maxNonPosGain != Long.MIN_VALUE ? sumPos + maxNonPosGain : Long.MIN_VALUE);
            // If there was no non-positive at all, addNonPos remains very negative
            bestGain = Math.max(dropOne, addNonPos);
        }

        return baseSum + bestGain;
    }

    public static void main(String[] args) {
        Gain gain = new Gain();
        int[] nums = { 1, 2, 3 };
        int k = 4;
        int[][] edges = { { 0, 1 }, { 1, 2 } };
        System.out.println(gain.maximumValueSum(nums, k, edges)); // Example usage
    }
}

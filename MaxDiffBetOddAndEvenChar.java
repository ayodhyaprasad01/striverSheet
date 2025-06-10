import java.util.HashMap;
import java.util.Map;

class MaxDiffBetOddAndEvenChar {

    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        Integer maxOdd = null;
        Integer minEven = null;

        for (int value : map.values()) {
            if (value % 2 == 1) {
                if (maxOdd == null || value > maxOdd) {
                    maxOdd = value;
                }
            } else {
                if (minEven == null || value < minEven) {
                    minEven = value;
                }
            }
        }

        if (maxOdd == null || minEven == null) {
            // If either no odd or no even frequencies exist
            return 0;
        }

        return maxOdd - minEven;
    }

    public static void main(String[] args) {
        MaxDiffBetOddAndEvenChar solution = new MaxDiffBetOddAndEvenChar();
        System.out.println(solution.maxDifference("aabbccddeeffgghh")); // Output: 0
        System.out.println(solution.maxDifference("abcde")); // Output: 1
        System.out.println(solution.maxDifference("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz")); // Output: 0
        System.out.println(solution.maxDifference("aaaaabbbbcc")); // Output depends on odd and even frequencies
        System.out.println(solution.maxDifference("a")); // Output: 0 (no even count)
    }
}

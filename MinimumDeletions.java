import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumDeletions {
    public int minimumDeletions(String word, int k) {

        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        List<Integer> frequencies = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) {
                frequencies.add(f);
            }
        }

        Collections.sort(frequencies);

        int minDeletions = Integer.MAX_VALUE;

        for (int baseFreq : frequencies) {
            int deletions = 0;

            for (int f : frequencies) {
                if (f < baseFreq) {
                    deletions += f;
                } else if (f > baseFreq + k) {
                    deletions += (f - baseFreq - k);
                }
            }

            minDeletions = Math.min(minDeletions, deletions);
        }

        return minDeletions;
    }

    public static void main(String[] args) {
        MinimumDeletions md = new MinimumDeletions();
        String word = "aaabbbcc";
        int k = 1;
        System.out.println("Minimum deletions: " + md.minimumDeletions(word, k)); // Example usage
    }
}

public class StringPaterrenMatching {

    void computeLPSArray(String pattern, int M, int[] lps) {
        int len = 0; // length of the previous longest prefix suffix
        lps[0] = 0; // LPS[0] is always 0
        int i = 1;

        // Loop to fill lps[] for i = 1 to M-1
        while (i < M) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else { // Mismatch
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    void KMPSearch(String pattern, String text) {
        int M = pattern.length();
        int N = text.length();

        // Create LPS array for the pattern
        int[] lps = new int[M];
        computeLPSArray(pattern, M, lps);

        int i = 0; // Index for text[]
        int j = 0; // Index for pattern[]

        while (i < N) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == M) {
                // Found a match, pattern occurs at index i - j
                System.out.println("Found pattern at index " + (i - j));
                j = lps[j - 1]; // Move to the next potential match
            } else if (i < N && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1]; // Use the LPS array to avoid redundant checks
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        StringPaterrenMatching kmp = new StringPaterrenMatching();
        kmp.KMPSearch("abcabcd", "abc");
    }
    // public static void main(String[] args) {
    // String str = "abcabcabc";
    // String pattern = "abcabc";
    // int n = str.length();
    // int m = pattern.length();

    // for (int i = 0; i < n - m; i++) {
    // int j2;
    // for (j2 = 0; j2 < m; j2++) {
    // if (str.charAt(i + j2) != pattern.charAt(j2)) {
    // break;

    // }

    // }

    // if (j2 == m) {
    // System.out.println("Pattern found at index " + i);

    // }
    // }

    // }
}

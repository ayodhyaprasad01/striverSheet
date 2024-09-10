public class StringPaterrenMatching {
    public static void main(String[] args) {
        String str = "abcabcabc";
        String pattern = "abcabc";
        int n = str.length();
        int m = pattern.length();

        for (int i = 0; i < n - m; i++) {
            int j2;
            for (j2 = 0; j2 < m; j2++) {
                if (str.charAt(i + j2) != pattern.charAt(j2)) {
                    break;

                }

            }

            if (j2 == m) {
                System.out.println("Pattern found at index " + i);

            }
        }

    }
}

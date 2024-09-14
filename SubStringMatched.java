public class SubStringMatched {

    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (needle.isEmpty() || needle.equals(haystack)) {
            return 0;
        }

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {

            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SubStringMatched s = new SubStringMatched();
        System.out.println(s.strStr("sadbutsad", "sad")); // Output: 0
        System.out.println(s.strStr("leetcode", "leeto")); // Output: -1
        System.out.println(s.strStr("", "")); // Output: 0 (empty haystack and needle)
        System.out.println(s.strStr("a", "")); // Output: 0 (empty needle)
        System.out.println(s.strStr("a", "a")); // Output: 0 (haystack and needle are equal)
        System.out.println(s.strStr("abc", "d")); // Output: -1 (needle not in haystack)
        System.out.println(s.strStr("bca", "a")); // Output: 2 (needle found at index 2)
        System.out.println(s.strStr("bcaaa", "aaaa")); // Output: 2 (needle found at index 2)
    }

}

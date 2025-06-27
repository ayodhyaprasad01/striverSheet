import java.util.ArrayList;

public class LLongestSubsequenceRepeatedK {
    String res = "";

    public String longestSubsequenceRepeatedK(String s, int k) {
        int[] f = new int[26];
        for (char ch : s.toCharArray()) {
            f[ch - 'a']++;
        }

        ArrayList<Character> chs = new ArrayList<>();
        for (int i = 25; i >= 0; i--) {
            if (f[i] >= k) {
                chs.add((char) ('a' + i));
            }
        }

        dfs(chs, s, "", k);
        return res;
    }

    void dfs(ArrayList<Character> chs, String s, String curr, int k) {
        if (!curr.isEmpty() && !check(s, curr, k))
            return;

        if (curr.length() > res.length() || (curr.length() == res.length() && curr.compareTo(res) > 0)) {
            res = curr;
        }

        for (int i = 0; i < chs.size(); i++) {
            dfs(chs, s, curr + chs.get(i), k);
        }
    }

    boolean check(String s, String sub, int k) {
        int cnt = 0, j = 0;
        for (char ch : s.toCharArray()) {
            if (ch == sub.charAt(j)) {
                j++;
                if (j == sub.length()) {
                    cnt++;
                    j = 0;
                    if (cnt == k)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LLongestSubsequenceRepeatedK solution = new LLongestSubsequenceRepeatedK();
        String s = "banana";
        int k = 2;
        System.out
                .println("Longest subsequence repeated " + k + " times: " + solution.longestSubsequenceRepeatedK(s, k));
    }
}

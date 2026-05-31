public class EditDistace {

    // int minEdis(String str1, String str2) {
    // return minDisHellper(str1, str2, 0, 0);
    // }

    // int minDisHellper(String str1, String str2, int i, int j) {
    // if (i == str1.length()) {
    // return str2.length() - j;
    // }
    // if (j == str2.length()) {
    // return str1.length() - i;
    // }
    // if (str1.charAt(i) == str2.charAt(j)) {
    // return minDisHellper(str1, str2, i + 1, j + 1);
    // }
    // int insert = 1 + minDisHellper(str1, str2, i, j + 1);
    // int delete = 1 + minDisHellper(str1, str2, i + 1, j);
    // int replace = 1 + minDisHellper(str1, str2, i + 1, j + 1);
    // return Math.min(insert, Math.min(delete, replace));
    // }

    // int[][] mem;

    // int minEdis(String str1, String str2) {
    // int n = str1.length();
    // int m = str2.length();
    // mem = new int[n + 1][m + 1];
    // for (int i = 0; i <= n; i++) {
    // for (int j = 0; j <= m; j++) {
    // mem[i][j] = -1;
    // }
    // }
    // return minDisHellper(str1, str2, 0, 0);
    // }

    // int minDisHellper(String str1, String str2, int i, int j) {
    // if (i == str1.length()) {
    // return str2.length() - j;
    // }
    // if (j == str2.length()) {
    // return str1.length() - i;
    // }
    // if (mem[i][j] != -1)
    // return mem[i][j];
    // if (str1.charAt(i) == str2.charAt(j)) {
    // return minDisHellper(str1, str2, i + 1, j + 1);
    // }
    // int res = 0;
    // int insert = 1 + minDisHellper(str1, str2, i, j + 1);
    // int delete = 1 + minDisHellper(str1, str2, i + 1, j);
    // int replace = 1 + minDisHellper(str1, str2, i + 1, j + 1);
    // res = Math.min(insert, Math.min(delete, replace));
    // return mem[i][j] = res;
    // }

    public static int bottomUp(String a, String b) {
        // a = a.toLowerCase();
        // b = b.toLowerCase();
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];

        // base cases
        for (int i = 0; i <= m; i++)
            dp[i][0] = i;
        for (int j = 0; j <= n; j++)
            dp[0][j] = j;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int insert = 1 + dp[i][j - 1];
                    int delete = 1 + dp[i - 1][j];
                    int replace = 1 + dp[i - 1][j - 1];
                    dp[i][j] = Math.min(insert, Math.min(delete, replace));
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String str1 = "Aa";
        String str2 = "aA";
        System.out.println(EditDistace.bottomUp(str1, str2));
    }
}

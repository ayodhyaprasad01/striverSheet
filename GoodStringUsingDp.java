public class GoodStringUsingDp {

    public int countGoodStrings(int low, int high, int zero, int one) {

        int dp[] = new int[high + 1];
        dp[0] = 1;

        for (int i = 0; i < high; i++) {

            if (i >= zero)
                dp[i] += dp[i - zero];
            if (i >= one)
                dp[i] += dp[i - one];
        }

        int asn = 0;
        for (int i = low; i <= high; i++) {
            asn += dp[i];
        }

        return asn;

    }

    public static void main(String[] args) {
        GoodStringUsingDp g = new GoodStringUsingDp();
        System.out.println(g.countGoodStrings(3, 4, 1, 2));

    }
}
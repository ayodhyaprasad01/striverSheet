import java.util.ArrayList;
import java.util.List;

class Solution11 {

    private static final int MOD = 1000000007;

    public int countWinningSequences(String s) {
        int n = s.length();
        int[][][] dp = new int[n + 1][4][2 * n + 1];

        dp[0][3][n] = 1; // Initial state

        for (int i = 0; i < n; i++) {
            char aliceMv = s.charAt(i);

            for (int preBobM = 0; preBobM < 4; preBobM++) {
                for (int diff = -n; diff <= n; diff++) {
                    if (dp[i][preBobM][diff + n] == 0)
                        continue;

                    List<Integer> validMoves = getVM(aliceMv);

                    for (int bobMove : validMoves) {
                        if (bobMove != preBobM) {
                            int newDiff = diff + getScoreDiff(bobMove, aliceMv);
                            if (newDiff >= -n && newDiff <= n) {
                                dp[i + 1][bobMove][newDiff
                                        + n] = (dp[i + 1][bobMove][newDiff + n] + dp[i][preBobM][diff + n]) % MOD;

                                // Debugging Output
                                System.out.println("dp[" + (i + 1) + "][" + bobMove + "][" + (newDiff + n) + "] = "
                                        + dp[i + 1][bobMove][newDiff + n]);
                            }
                        }
                    }
                }
            }
        }

        int result = 0;
        for (int j = 0; j < 3; j++) {
            for (int diff = 1; diff <= n; diff++) {
                result = (result + dp[n][j][diff + n]) % MOD;
            }
        }

        return result;
    }

    private List<Integer> getVM(char aliceM) {
        List<Integer> moves = new ArrayList<>();

        if (aliceM == 'F') {
            moves.add(1);
        } else if (aliceM == 'W') {
            moves.add(2);
        } else if (aliceM == 'E') {
            moves.add(0);
        }
        return moves;
    }

    private int getScoreDiff(int bobMove, char aliceMove) {
        if ((bobMove == 1 && aliceMove == 'F') ||
                (bobMove == 2 && aliceMove == 'W') ||
                (bobMove == 0 && aliceMove == 'E')) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        System.out.println(solution.countWinningSequences("FFF"));

    }
}

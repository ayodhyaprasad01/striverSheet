public class DpToFindOnesSquresIn2DArr {

    public static int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int coloumns = matrix[0].length;
        int[][] dp = new int[rows][coloumns];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {

                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                    }
                    count += dp[i][j];
                }

            }

        }

        return count;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1 },
                { 1, 1, 0 },
                { 1, 1, 0 }
        };
        System.out.println(DpToFindOnesSquresIn2DArr.countSquares(matrix));
    }
}

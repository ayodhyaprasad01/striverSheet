public class GridGame {
    public long gridGame(int[][] grid) {

        int flag = 0;
        long sum = 0;
        long[] prefixT = new long[grid[0].length];
        long[] prefixB = new long[grid[0].length];

        prefixT[0] = grid[0][0];
        prefixB[0] = grid[1][0];

        for (int i = 1; i < grid[0].length; i++) {

            prefixT[i] = prefixT[i - 1] + grid[0][i];
            prefixB[i] = prefixB[i - 1] + grid[1][i];
        }

        long minSecRP = Long.MAX_VALUE;

        for (int i = 0; i < grid[0].length; i++) {

            long topR = prefixT[grid[0].length - 1] - prefixT[i];
            long bottomC = (i == 0) ? 0 : prefixB[i - 1];
            minSecRP = Math.min(minSecRP, Math.max(topR, bottomC));
        }

        sum = minSecRP;
        return sum;
    }

    public static void main(String[] args) {
        GridGame g = new GridGame();
        int[][] grid = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 }
        };
        System.out.println(g.gridGame(grid));

    }
}

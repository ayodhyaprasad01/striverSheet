import java.util.PriorityQueue;

public class TrappingRainWater {
    public static int trapRainWater(int[][] heightMap) {

        int m = heightMap.length;
        int n = heightMap[0].length;

        if (m < 3 || n < 3) {
            return 0;
        }

        boolean[][] visited = new boolean[m][n];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2] - b[2]);

        for (int i = 0; i < m; i++) {

            minHeap.offer(new int[] { i, 0, heightMap[i][0] });
            minHeap.offer(new int[] { i, n - 1, heightMap[i][n - 1] });
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }

        for (int j = 1; j < n - 1; j++) {

            minHeap.offer(new int[] { 0, j, heightMap[0][j] });
            minHeap.offer(new int[] { m - 1, j, heightMap[m - 1][j] });
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }

        int trapW = 0;
        int maxH = 0;
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        while (!minHeap.isEmpty()) {

            int[] cell = minHeap.poll();
            int x = cell[0];
            int y = cell[1];
            int height = cell[2];

            maxH = Math.max(maxH, height);

            for (int[] dir1 : dir) {

                int nx = x + dir1[0];
                int ny = y + dir1[1];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    trapW += Math.max(0, maxH - heightMap[nx][ny]);
                    minHeap.offer(new int[] { nx, ny, Math.max(maxH, heightMap[nx][ny]) });
                }
            }
        }
        return trapW;
    }

    public static void main(String[] args) {
        int[][] heightMap = {
                { 1, 4, 8, 3 },
                { 5, 7, 2, 6 },
                { 9, 1, 2, 7 }
        };

        System.out.println(trapRainWater(heightMap));

    }

}

import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLaders {
    public int snakesAndLadders(int[][] board) {

        int n = board.length;
        int[] cells = new int[n * n + 1];
        int idx = 1;
        boolean leftToRight = true;

        for (int r = n - 1; r >= 0; r--) {
            if (leftToRight) {
                for (int c = 0; c < n; c++) {
                    cells[idx++] = board[r][c];
                }
            } else {
                for (int c = n - 1; c >= 0; c--) {
                    cells[idx++] = board[r][c];
                }
            }
            leftToRight = !leftToRight;
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n * n + 1];
        queue.offer(1);
        visited[1] = true;
        int moves = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            while (size-- > 0) {
                int curr = queue.poll();
                if (curr == n * n) {
                    return moves;

                }

                for (int i = 1; i <= 6 && curr + i <= n * n; i++) {
                    int next = curr + i;
                    if (cells[next] != -1) {
                        next = cells[next];
                    }
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
            moves++;
        }

        return -1;
    }
    public static void main(String[] args) {
        SnakesAndLaders sal = new SnakesAndLaders();
        int[][] board = {
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 35, -1, 13, -1, 15},
            {-1, 34, 33, 32, 31, 30},
            {-1, 29, 28, 27, 26, 25},
            {-1, 24, 23, 22, 21, 20}
        };
        System.out.println(sal.snakesAndLadders(board)); // Output: Minimum moves to reach the end
    }
}

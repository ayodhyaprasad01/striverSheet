import java.util.*;

class Solution {

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();

        int[] dir = { -1, 0, 1, 0, -1 };

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] { 0, 0, health });
        visited[0][0] = true;

        while (!queue.isEmpty()) {

            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int currH = cur[2];

            if (x == m - 1 && y == n - 1 && currH > 0) {
                return true;
            }

            for (int i = 0; i < 4; i++) {

                int nx = x + dir[i];
                int ny = y + dir[i + 1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny]) {
                    if ((currH - grid.get(nx).get(ny) > 0)) {
                        queue.add(new int[] { nx, ny, currH - grid.get(nx).get(ny) });
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0));
        System.out.println(solution.findSafeWalk(grid, 2));

    }
}
public class CourseShedule {
    public int findMaxFish(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int maxFish = 0;
    
            // Function to perform DFS
            // int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            
            // DFS function to collect fish from connected cells
    int dfs(int[][] grid, int r, int c) {
                if (r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == 0) {
                    return 0;
                }
                int fish = grid[r][c];
                grid[r][c] = 0; // Mark cell as visited
                for (int[] dir : directions) {
                    fish += dfs(grid, r + dir[0], c + dir[1]);
                    fish += dfs(grid, r + dir[0], c + dir[1]);
                }
                return fish;
            }

    // Iterate through all cells in the grid
    for(

    int r = 0;r<m;r++)
    {
        for (int c = 0; c < n; c++) {
            if (grid[r][c] > 0) { // Start DFS if it's a water cell
                maxFish = Math.max(maxFish, dfs(grid, r, c));
            }
        }
    }return maxFish;
}
}

public static void main(String []as){
    CourseShedule courseShedule = new CourseShedule();
    int[][] grid = {
        {1, 0, 0, 0},
        {0, 0, 2, 0},
        {2, 0, 0, 2},
        {0, 0, 2, 0},

}
}

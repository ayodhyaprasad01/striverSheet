import java.util.*;

class ColourCoding {
        public static int[] queryResults(int limit, int[][] queries) {
                int n = queries.length;
                int[] result = new int[n];

                HashMap<Integer, Integer> ballColor = new HashMap<>(); // Stores color of each ball
                HashMap<Integer, Integer> colorCount = new HashMap<>(); // Stores frequency of each color
                Set<Integer> distinctColors = new HashSet<>(); // Stores distinct colors

                for (int i = 0; i < n; i++) {
                        int ball = queries[i][0];
                        int color = queries[i][1];

                        // If ball already has a color, update color frequency
                        if (ballColor.containsKey(ball)) {
                                int oldColor = ballColor.get(ball);
                                colorCount.put(oldColor, colorCount.get(oldColor) - 1);

                                // Remove from distinctColors if the old color is no longer used
                                if (colorCount.get(oldColor) == 0) {
                                        distinctColors.remove(oldColor);
                                }
                        }

                        // Assign new color to the ball
                        ballColor.put(ball, color);

                        // Update color frequency and distinct color count
                        colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
                        distinctColors.add(color);

                        // Store current distinct color count
                        result[i] = distinctColors.size();
                }

                return result;
        }

        public static void main(String[] args) {
                ColourCoding solution = new ColourCoding();
                int limit = 2;
                int[][] queries = { { 1, 1 }, { 2, 2 }, { 3,
                                1 }
                };
                // ... rest of the code ...
                int[] arr = queryResults(limit, queries);

                for (int i : arr) {
                        System.out.print(i);
                }

        }
}

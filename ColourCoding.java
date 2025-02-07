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
                1 }, { 3, 2 }, { 2, 1 },
                { 1,
                        2 },
                { 4, 1 }, { 4, 2 }, { 4,
                        3 },
                { 2, 2 }, { 2, 3 }, { 3,
                        3 },
                { 3, 1 }, { 1, 3 }, { 1,
                        1 },
                { 1, 2 }, { 4, 1 }, { 4,
                        2 },
                { 4, 3 }, { 4, 4 }, { 4,
                        5 },
                { 4, 6 }, { 4, 7 }, { 4,
                        8 },
                { 4, 9 }, { 4, 10 }, { 4,
                        11 },
                { 4, 12 }, { 4, 13 }, { 4,
                        14 },
                { 4, 15 }, { 4, 16 }, { 4,
                        17 },
                { 4, 18 }, { 4, 19 }, { 4,
                        20 },
                { 4, 21 }, { 4, 22 }, { 4,
                        23 },
                { 4, 24 }, { 4, 25 }, { 4,
                        26 },
                { 4, 27 }, { 4, 28 }, { 4,
                        29 },
                { 4, 30 }, { 4, 31 }, { 4,
                        32 },
                { 4, 33 }, { 4, 34 }, { 4,
                        35 },
                { 4, 36 }, { 4, 37 }, { 4, 38 }
        };
        // ... rest of the code ...
        int[] arr = queryResults(limit, queries);

        for (int i : arr) {
            System.out.print(i);
        }

    }
}

public class StartsAndBars {
    public long distributeCandies(int n, int limit) {
        long count = 0;
        int maxi = Math.min(n, limit);

        for (int i = 0; i <= maxi; i++) {
            int minj = Math.max(0, n - i - limit);
            int maxj = Math.min(limit, n - i);
            if (minj <= maxj) {
                count += (long) (maxj - minj + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StartsAndBars sb = new StartsAndBars();
        int n = 5; // Total candies
        int limit = 3; // Maximum candies per child
        long result = sb.distributeCandies(n, limit);
        System.out.println("Total ways to distribute candies: " + result);
    }
}

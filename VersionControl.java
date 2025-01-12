public class VersionControl {
    public static void main(String[] args) {
        int n = 5; // Total versions
        int bad = 4; // First bad version

        Solution solution = new Solution(bad);
        System.out.println("First Bad Version: " + solution.firstBadVersion(n)); // Output: 4
    }
}
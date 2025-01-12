// Mock VersionControl class to simulate isBadVersion API
public class BinaryStringBeautiyf {
    // Example of how you can define the bad version (mock)
    private int badVersion;

    // Constructor to set the bad version
    public BinaryStringBeautiyf(int badVersion) {
        this.badVersion = badVersion;
    }

    // API to check if a version is bad
    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

// Solution class to find the first bad version
class Solution extends BinaryStringBeautiyf {
    // Constructor to initialize the bad version in VersionControl
    public Solution(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        int start = 1; // Start from version 1
        int end = n; // End at version n
        int firstBad = -1; // To store the first bad version

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                firstBad = mid; // Update first bad version
                end = mid - 1; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }
        return firstBad; // Return the first bad version
    }
}

// Example usage
class Main {
    public static void main(String[] args) {
        int n = 5; // Total versions
        int bad = 4; // First bad version

        Solution solution = new Solution(bad);
        System.out.println("First Bad Version: " + solution.firstBadVersion(n)); // Output: 4
    }
}

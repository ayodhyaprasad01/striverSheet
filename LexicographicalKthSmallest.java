import java.util.Arrays;

class LexicographicalKthSmallest {

    public String kthSmallest(int n, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(i);
        }
        return findKthSmallest(result.toString(), k);
    }

    private String findKthSmallest(String s, int k) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars, 0, k);
    }

    public static void main(String[] args) {
        LexicographicalKthSmallest solution = new LexicographicalKthSmallest();
        System.out.println(solution.kthSmallest(5, 3)); // Output: "123"
    }
}
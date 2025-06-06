import java.util.ArrayDeque;
import java.util.Deque;

public class LexicographicalSmallest {
    public String robotWithString(String s) {
        int n = s.length();
        char[] minSuffix = new char[n];
        minSuffix[n - 1] = s.charAt(n - 1);

        // Precompute minSuffix[i] = min character from s[i..n-1]
        for (int i = n - 2; i >= 0; i--) {
            minSuffix[i] = (char) Math.min(s.charAt(i), minSuffix[i + 1]);
        }

        StringBuilder result = new StringBuilder();
        Deque<Character> t = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            t.push(c);

            // While top of t <= next smallest character in s
            while (!t.isEmpty() && (i == n - 1 || t.peek() <= minSuffix[i + 1])) {
                result.append(t.pop());
            }
        }

        // Append remaining in t
        while (!t.isEmpty()) {
            result.append(t.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LexicographicalSmallest solution = new LexicographicalSmallest();
        String input = "cba";
        String result = solution.robotWithString(input);
        System.out.println("Lexicographically smallest string: " + result);
    }
}

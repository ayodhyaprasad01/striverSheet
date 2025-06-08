import java.util.ArrayList;
import java.util.List;

class Aajj {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>(n);
        int curr = 1;

        for (int i = 0; i < n; i++) {
            result.add(curr);
            if (curr * 10 <= n) {
                curr *= 10;
            } else if (curr % 10 != 9 && curr + 1 <= n) {
                curr++;
            } else {
                while ((curr / 10) % 10 == 9 || curr + 1 > n) {
                    curr /= 10;
                }
                curr++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Aajj solution = new Aajj();
        int n = 13; // Example input
        List<Integer> result = solution.lexicalOrder(n);
        System.out.println("Lexical order from 1 to " + n + ": " + result);
    }
}

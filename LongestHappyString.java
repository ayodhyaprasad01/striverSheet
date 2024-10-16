import java.util.PriorityQueue;

public class LongestHappyString {

    public String longestDiverseString(int a, int b, int c) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.count - p1.count);

        if (a > 0) {
            pq.offer(new Pair('a', a));
        }
        if (b > 0) {
            pq.offer(new Pair('b', b));
        }
        if (c > 0) {
            pq.offer(new Pair('c', c));
        }

        StringBuilder result = new StringBuilder();
        Pair prev = null;

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            if (result.length() >= 2 && result.charAt(result.length() - 1) == current.letter
                    && result.charAt(result.length() - 2) == current.letter) {
                if (pq.isEmpty()) {
                    break;
                }

                Pair next = pq.poll();
                result.append(next.letter);
                next.count--;

                if (next.count > 0) {
                    pq.offer(next);
                }

                pq.offer(current);
            } else {
                result.append(current.letter);
                current.count--;

                if (current.count > 0) {
                    pq.offer(current);
                }
            }
        }

        return result.toString();
    }

    static class Pair {
        char letter;
        int count;

        Pair(char letter, int count) {
            this.letter = letter;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        LongestHappyString lhs = new LongestHappyString();
        System.out.println(lhs.longestDiverseString(1, 1, 7));
    }
}

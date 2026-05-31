import java.util.*;

public class Solution {

    public static long totalTriplets(int n, int[] capacity, long desiredCapacity) {
        long[] cap = new long[n];

        for (int i = 0; i < n; ++i) {
            cap[i] = capacity[i];
        }

        long cp1 = 0;
        long cp2 = 0;
        long orl = 0;

        Map<Long, Integer> flen = new HashMap<>();
        Map<Long, Integer> fre = new HashMap<>();

        for (int k = 2; k < n; k++) {
            fre.put(cap[k], fre.getOrDefault(cap[k], 0) + 1);
        }

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            long p = cap[i] * cap[j];

            if (p == 0) {
                if (desiredCapacity == 0) {
                    cp1 += (n - 1 - j);
                }
            } else if (desiredCapacity % p == 0) {
                long t = desiredCapacity / p;
                if (fre.containsKey(t)) {
                    cp1 += fre.get(t);
                }
            }

            if (j + 1 < n) {
                fre.put(cap[j + 1], fre.get(cap[j + 1]) - 1);
                if (fre.get(cap[j + 1]) == 0) {
                    fre.remove(cap[j + 1]);
                }
            }
        }

        for (int j = 1; j < n - 1; j++) {
            flen.put(cap[j - 1], flen.getOrDefault(cap[j - 1], 0) + 1);
            int k = j + 1;
            long p = cap[j] * cap[k];

            if (p == 0) {
                if (desiredCapacity == 0) {
                    cp2 += j;
                }
            } else if (desiredCapacity % p == 0) {
                long t = desiredCapacity / p;
                if (flen.containsKey(t)) {
                    cp2 += flen.get(t);
                }
            }
        }

        for (int i = 0; i < n - 2; i++) {
            long p = cap[i] * cap[i + 1];
            if (p == 0) {
                if (desiredCapacity == 0)
                    orl++;
            } else if (desiredCapacity % p == 0) {
                if (cap[i + 2] == desiredCapacity / p) {
                    orl++;
                }
            }
        }

        return cp1 + cp2 - orl;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] capacity = new int[n];
        for (int i = 0; i < n; i++) {
            capacity[i] = sc.nextInt();
        }

        long desiredCapacity = sc.nextLong();

        long result = totalTriplets(n, capacity, desiredCapacity);
        System.out.println(result);

        sc.close();
    }
}

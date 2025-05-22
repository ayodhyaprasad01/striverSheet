import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solutionn {
    public int maxRemoval(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;

        Query[] qs = new Query[q];
        for (int i = 0; i < q; i++) {
            qs[i] = new Query(queries[i][0], queries[i][1]);
        }
        Arrays.sort(qs, Comparator.comparingInt(a -> a.l));

        Fenwick bit = new Fenwick(n);

        PriorityQueue<Query> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.r, a.r));

        int idx = 0;
        int selected = 0;

        for (int i = 0; i < n; i++) {
            while (idx < q && qs[idx].l <= i) {
                pq.offer(qs[idx]);
                idx++;
            }

            int need = nums[i];
            while (bit.pointQuery(i) < need) {
                if (pq.isEmpty()) {
                    return -1;
                }
                Query use = pq.poll();
                bit.rangeAdd(use.l, use.r, 1);
                selected++;
            }
        }

        return q - selected;
    }

    static class Query {
        int l, r;

        Query(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    static class Fenwick {
        int n;
        int[] bit;

        Fenwick(int n) {
            this.n = n;
            this.bit = new int[n + 2];
        }

        private void update(int i, int v) {
            i++;
            while (i <= n + 1) {
                bit[i] += v;
                i += i & -i;
            }
        }

        void rangeAdd(int l, int r, int v) {
            update(l, v);
            update(r + 1, -v);
        }

        private int query(int i) {
            int s = 0;
            i++; // 1-based
            while (i > 0) {
                s += bit[i];
                i -= i & -i;
            }
            return s;
        }

        int pointQuery(int i) {
            return query(i);
        }
    }

    public static void main(String[] args) {
        Solutionn solution = new Solutionn();
        int[] nums = { 1, 2, 3, 4, 5 };
        int[][] queries = { { 0, 2 }, { 1, 3 }, { 2, 4 } };
        int result = solution.maxRemoval(nums, queries);
        System.out.println(result); // Output: 2
    }
}

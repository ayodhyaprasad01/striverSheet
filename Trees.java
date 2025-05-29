import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

class Trees {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;

        List<Integer>[] t1 = buildGraph(n, edges1);
        List<Integer>[] t2 = buildGraph(m, edges2);

        int[] color1 = new int[n];
        int[] count1 = new int[2];
        dfsColor(0, -1, 0, t1, color1, count1);

        int[] color2 = new int[m];
        int[] count2 = new int[2];
        dfsColor(0, -1, 0, t2, color2, count2);

        int best2 = Math.max(count2[1], count2[0]);

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = count1[color1[i]] + best2;
        }

        return answer;
    }

    void dfsColor(int u, int parent, int c,
            List<Integer>[] graph,
            int[] color, int[] count) {
        color[u] = c;
        count[c]++;
        for (int v : graph[u]) {
            if (v == parent)
                continue;
            dfsColor(v, u, c ^ 1, graph, color, count);
        }
    }

    @SuppressWarnings("unchecked")
    List<Integer>[] buildGraph(int size, int[][] edges) {
        @SuppressWarnings("unchecked")
        List<Integer>[] g = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            g[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        return g;
    }

    public static void main(String[] args) {
        Trees trees = new Trees();
        int[][] edges1 = { { 0, 1 }, { 0, 2 }, { 1, 3 } };
        int[][] edges2 = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 4 } };
        int[] result = trees.maxTargetNodes(edges1, edges2);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    @Override
    public String toString() {
        return "Trees{}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

}

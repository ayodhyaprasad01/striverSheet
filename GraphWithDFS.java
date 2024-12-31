import java.util.ArrayList;
import java.util.List;

public class GraphWithDFS {

    static void dfsH(List<List<Integer>> adj, int s, boolean[] visited) {

        visited[s] = true;
        System.out.print(s + " ");

        for (int i : adj.get(s)) {
            if (!visited[i])
                dfsH(adj, i, visited);
        }
    }

    static void dfs(List<List<Integer>> adj, int s) {
        boolean[] visited = new boolean[adj.size()];
        dfsH(adj, s, visited);

    }

    static void addEdge(List<List<Integer>> adj,
            int s, int t) {
        adj.get(s).add(t);
        adj.get(t).add(s);
    }

    public static void main(String[] args) {

        int V = 5;

        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);

        // int[][] edges = {
        // { 1, 2 }, { 1, 0 }, { 2, 0 }, { 2, 3 }, { 2, 4 }
        // };

        // for (int[] e : edges) {
        // addEdge(adj, e[0], e[1]);
        // }

        int source = 1;
        System.out.println("DFS from source: " + source);
        dfs(adj, source);
    }
}
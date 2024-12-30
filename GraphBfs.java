import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBfs {

    public static void bfsDisconnected(List<List<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()]; // Not visited

        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                bfs(adj, i, visited);
            }
        }
    }

    static void bfs(List<List<Integer>> graph, int v, boolean visited[]) {

        Queue<Integer> queue = new LinkedList<>();
        // boolean[] visited = new boolean[graph.size()];

        visited[v] = true;
        queue.add(v);

        while (!queue.isEmpty()) {

            int cur = queue.poll();
            System.out.print(cur + " ");

            for (int i : graph.get(cur)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }

        }

    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {

        List<List<Integer>> adj = new LinkedList<>();
        int V = 6;

        for (int i = 0; i < V; i++) {
            adj.add(new LinkedList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);

        // Perform BFS traversal for the entire graph
        bfsDisconnected(adj);

    }
}

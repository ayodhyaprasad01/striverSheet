import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class GraphWithDfsAndBfs {

    static void bfs(List<List<Integer>> adj, int s) {

        Queue<Integer> q = new LinkedList<>();
        int n = adj.size();
        boolean[] visited = new boolean[n];

        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            int cur = q.poll();
            // int cur = q.peek();
            System.out.print(cur + " ");

            for (int x : adj.get(cur)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
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
        int noVertices = 5;

        for (int i = 0; i < noVertices; i++) {
            adj.add(new LinkedList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);
        System.out.println("BFS starting from 0:");

        bfs(adj, 0);
    }

}

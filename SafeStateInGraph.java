import java.util.*;

class SafeStateInGraph {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        // Reverse graph and outdegree array
        List<List<Integer>> revGraph = new ArrayList<>();
        int[] outDegree = new int[n];

        // Initialize reverse graph and calculate outdegrees
        for (int i = 0; i < n; i++) {
            revGraph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int neighbor : graph[i]) {
                revGraph.get(neighbor).add(i); // Reverse the edge
            }
            outDegree[i] = graph[i].length; // Outdegree of the current node
        }

        // Queue for processing nodes with outdegree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (outDegree[i] == 0) {
                queue.offer(i); // Terminal nodes
            }
        }

        // List to store safe nodes
        List<Integer> safeNodes = new ArrayList<>();

        // Process nodes in reverse topological order
        while (!queue.isEmpty()) {
            int node = queue.poll();
            safeNodes.add(node);
            for (int neighbor : revGraph.get(node)) {
                outDegree[neighbor]--;
                if (outDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // Sort the safe nodes before returning
        Collections.sort(safeNodes);
        return safeNodes;
    }

    public static void main(String[] args) {
        SafeStateInGraph solution = new SafeStateInGraph();
        int[][] graph = { { 1, 2, 3 }, { 3, 4 },
                { 2, 4 }, { 1, 3, 4 }, { 2,
                        3 } };
        List<Integer> safeNodes = solution.eventualSafeNodes(graph);
        System.out.println("Safe nodes: " + safeNodes);
    }
}

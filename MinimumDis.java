import java.util.Arrays;
class MinimumDis {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;

        int[] dist1 = getDistances(edges, node1);
        int[] dist2 = getDistances(edges, node2);

        int minDist = Integer.MAX_VALUE;
        int res = -1;

        for (int i = 0; i < n; i++) {

            if (dist1[i] != -1 && dist2[i] != -1) {
                int maxDist = Math.max(dist1[i], dist2[i]);
                if (maxDist < minDist) {
                    minDist = maxDist;
                    res = i;
                }
            }
        }

        return res;
    }

    int[] getDistances(int[] edges, int start) {

        int n = edges.length;
        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        int steps = 0;
        while (start != -1 && dist[start] == -1) {
            dist[start] = steps++;
            start = edges[start];
        }

        return dist;
    }
    public static void main(String[] args) {
        MinimumDis md = new MinimumDis();
        int[] edges = { 2, 2, 3, -1, 4, 0 };
        int node1 = 0;
        int node2 = 1;
        System.out.println(md.closestMeetingNode(edges, node1, node2)); // Output: 2
    }
}

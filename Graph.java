import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = 5;
        int edges = 7;

        int graph[][] = new int[v][edges];

        for (int i = 0; i < edges; i++) {

            int u, v1;
            u = sc.nextInt();
            v1 = sc.nextInt();

            graph[v1][u] = 1;
            graph[u][v1] = 1;

        }
    }
}

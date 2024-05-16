import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Q10 {
    static class Graph {
        int V;
        ArrayList<ArrayList<Integer>> adjList;

        Graph(int vertices) {
            V = vertices;
            adjList = new ArrayList<>(V);

            for (int i = 0; i < V; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v) {
            adjList.get(u).add(v);
        }

        void BFS(int startVertex) {
            boolean[] visited = new boolean[V];
            Queue<Integer> queue = new ArrayDeque<>();

            visited[startVertex] = true;
            queue.offer(startVertex);

            while (!queue.isEmpty()) {
                int currentVertex = queue.poll();
                System.out.print(currentVertex + " ");

                for (int adjacentVertex : adjList.get(currentVertex)) {
                    if (!visited[adjacentVertex]) {
                        visited[adjacentVertex] = true;
                        queue.offer(adjacentVertex);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("BFS traversal starting from vertex 0:");
        graph.BFS(0);
    }
}

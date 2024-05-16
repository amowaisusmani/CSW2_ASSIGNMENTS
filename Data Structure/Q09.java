import java.util.LinkedList;
import java.util.Scanner;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjacencyList[i] = new LinkedList<>();
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void printGraph() {
        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < vertices; ++i) {
            System.out.print(i + " -> ");
            for (Integer vertex : adjacencyList[i]) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public void DFS(int vertex) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(vertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (Integer adjacentVertex : adjacencyList[vertex]) {
            if (!visited[adjacentVertex])
                DFSUtil(adjacentVertex, visited);
        }
    }
}

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter edges (source destination):");
        for (int i = 0; i < edges; ++i) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        graph.printGraph();

        System.out.println("\nDepth First Traversal:");
        graph.DFS(0); // Starting traversal from vertex 0

        scanner.close();
    }
}

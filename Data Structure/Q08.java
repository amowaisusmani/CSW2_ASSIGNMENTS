import java.util.ArrayList;

class Graph {
    private int V;
    private boolean[][] adjMatrix;
    private ArrayList<ArrayList<Integer>> adjList;

    public Graph(int V) {
        this.V = V;
        adjMatrix = new boolean[V][V];
        adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = true;
        adjMatrix[v][u] = true;
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void displayAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    public void displayAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

public class Q08 {
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        Graph graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.displayAdjacencyMatrix();
        graph.displayAdjacencyList();
    }
}

package BellmanFord;
 public class BellmanFord {

    private int vertices;
    private int edgesCount;
    private Edge[] edges;

    public BellmanFord(int vertices, int edgesCount) {
        this.vertices = vertices;
        this.edgesCount = edgesCount;
        edges = new Edge[edgesCount];
    }

    public void addEdge(int index, int source, int destination, int weight) {
        edges[index] = new Edge(source, destination, weight);
    }

    public void runAlgorithm(int source) {
        int[] distances = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            distances[i] = Integer.MAX_VALUE;
        }
        distances[source] = 0;

        
        for (int i = 1; i < vertices; i++) {
            for (int j = 0; j < edgesCount; j++) {
                Edge edge = edges[j];
                if (distances[edge.source] != Integer.MAX_VALUE &&
                    distances[edge.source] + edge.weight < distances[edge.destination]) {
                    distances[edge.destination] = distances[edge.source] + edge.weight;
                }
            }
        }

       
        for (int j = 0; j < edgesCount; j++) {
            Edge edge = edges[j];
            if (distances[edge.source] != Integer.MAX_VALUE &&
                distances[edge.source] + edge.weight < distances[edge.destination]) {
                System.out.println("Graph contains negative weight cycle!");
                return;
            }
        }

       
        printDistances(distances, source);
    }

    private void printDistances(int[] distances, int source) {
        System.out.println("Vertex distances from source " + source + ":");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Vertex " + i + " -> " + distances[i]);
        }
    }
 }
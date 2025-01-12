package BellmanFord;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of vertices: ");
	        int vertices = scanner.nextInt();

	        System.out.print("Enter the number of edges: ");
	        int edgesCount = scanner.nextInt();

	        BellmanFord graph = new BellmanFord(vertices, edgesCount);

	        System.out.println("Enter edges in the format: source destination weight");
	        for (int i = 0; i < edgesCount; i++) {
	            int source = scanner.nextInt();
	            int destination = scanner.nextInt();
	            int weight = scanner.nextInt();
	            graph.addEdge(i, source, destination, weight);
	        }

	        System.out.print("Enter the source vertex: ");
	        int source = scanner.nextInt();

	        graph.runAlgorithm(source);

	        scanner.close();

	}
}



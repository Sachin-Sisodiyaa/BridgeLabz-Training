package com.day_10.classwork;

public class GraphAdjMatrix {
	private int[][] matrix;
	private int numVertices;
	
	public GraphAdjMatrix(int numVertices) {
		this.numVertices = numVertices;
		matrix = new int[numVertices][numVertices];
	}
	
	public void addEdge(int v1, int v2) {
		matrix[v1][v2] = 1;
		matrix[v2][v1] = 1;
	}
	
	public boolean isConnected(int v1, int v2) {
		return matrix[v1][v2] == 1;
	}
	
	public void printMatrix() {
		for(int[] row: matrix) {
			for(int val: row) {
				System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		GraphAdjMatrix g = new GraphAdjMatrix(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.printMatrix();
		
	}
}

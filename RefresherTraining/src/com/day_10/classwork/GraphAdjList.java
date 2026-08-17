package com.day_10.classwork;
import java.util.ArrayList;

public class GraphAdjList {

    private ArrayList<ArrayList<Integer>> adjacencyList;
    private int numVertices;

    public GraphAdjList(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int v1, int v2) {
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
    }

    public boolean isConnected(int v1, int v2) {
        return adjacencyList.get(v1).contains(v2);
    }

    public void printList() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");

            for (int vertex : adjacencyList.get(i)) {
                System.out.print(vertex + " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {

        GraphAdjList g = new GraphAdjList(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.printList();
    }
}
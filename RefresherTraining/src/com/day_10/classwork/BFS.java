package com.day_10.classwork;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    int numVertices;
    ArrayList<ArrayList<Integer>> adjacencyList;

    public BFS(int numVertices) {
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

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {

            int currentVertex = queue.poll();

            System.out.print(currentVertex + " ");

            for (int neighbor : adjacencyList.get(currentVertex)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        BFS graph = new BFS(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("BFS Traversal:");

        graph.bfs(0);
    }
}
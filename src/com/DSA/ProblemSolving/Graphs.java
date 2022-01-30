package com.DSA.ProblemSolving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graphs {

	int vertices;
	ArrayList<Integer> arrVertices[];

	public Graphs(int vertices) {
		this.vertices = vertices;
		arrVertices = new ArrayList[vertices];

		for (int i = 0; i < vertices; i++) {
			arrVertices[i] = new ArrayList<Integer>();
		}
	}

	public void addEdge(int u, int v) {
		arrVertices[u].add(v);
		arrVertices[v].add(u);

	}

//Breadth First Search traversal of graph ,Best for  Shortest path
	public void BFS(int s, int parent[], boolean visited[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int current;
		queue.add(s);
		visited[s] = true;
		while (!queue.isEmpty()) {
			current = queue.remove();
			for (int next : arrVertices[current]) {
				if (!visited[next]) {
					visited[next] = true;
					queue.add(next);
					parent[next] = current;
					System.out.println("(" + current + ")-----------(" + next + ")");

				}

			}

		}

	}

	// Depth First Search best suitable for Cyclic detection
	public void DFS(int s, int parent[], boolean visited[]) {
		visited[s] = true;
		for (int next : arrVertices[s]) {
			if (!visited[next]) {
				visited[next] = true;
				parent[next] = s;
				System.out.println("(" + s + ")---------(" + next + ")");
				DFS(next, parent, visited);

			}
		}

	}

}
package com.DSA.ProblemSolving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	ArrayList<ArrayList<Integer>> verticies;

	public Graph(int size) {
		verticies = new ArrayList<ArrayList<Integer>>(size);
		for (int i = 0; i < size; i++)
			verticies.add(new ArrayList<Integer>());

	}

	public void addEdge(int u, int v) {
		verticies.get(u).add(v);
		verticies.get(v).add(u);
	}

	public void addEdgeDirected(int source, int destination) {
		verticies.get(source).add(destination);

	}

	public void printGraph() {
		for (ArrayList<Integer> verex : verticies) {
			for (Integer val : verex)
				System.out.println(val);
		}
	}

	public void depthFirstSearch(int source, boolean[] visited, int main, boolean directed) {

		visited[source] = true;
		if (source != main)
			if (directed)
				System.out.println(main + "----------->" + source);
			else
				System.out.println(main + "<----------->" + source);

		for (int adjascent : verticies.get(source))
			if (visited[adjascent] == false)
				depthFirstSearch(adjascent, visited, source, directed);

	}

	public void breadthFirstsearch(int source, boolean[] visited, boolean directed) {
		visited[source] = true;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(source);
		while (!queue.isEmpty()) {
			int s = queue.poll();
			// System.out.println(s);
			for (int adjascent : verticies.get(s)) {
				if (visited[adjascent] == false) {
					visited[adjascent] = true;
					if (directed)
						System.out.println(s + "<------>" + adjascent);
					else
						System.out.println(s + "------>" + adjascent);
					queue.add(adjascent);
				}
			}

		}

	}

	public int[] shortestPathUndir(int s, boolean[] visited, int size) {
		int[] dist = new int[size];
		visited[s] = true;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(s);
		dist[s] = 0;
		while (!queue.isEmpty()) {
			int parent = queue.poll();
			for (Integer adj : verticies.get(parent)) {
				if (visited[adj] != true) {
					dist[adj] = dist[parent] + 1;
					visited[adj] = true;
					queue.add(adj);
				}
			}

		}

		return dist;

	}

	public boolean detectCycleUndirected(boolean[] visited, int source, int parent) {
		visited[source] = true;
		for (int adj : verticies.get(source)) {
			if (visited[adj] == false) {
				if (detectCycleUndirected(visited, adj, source) == true)
					return true;
			} else if (adj != parent)
				return true;

		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		Graph undirected = new Graph(5);
		undirected.addEdge(0, 1);
		undirected.addEdge(0, 3);
		// undirected.addEdge(0, 4);
		undirected.addEdge(1, 2);
		undirected.addEdge(3, 4);

		Graph directed = new Graph(5);
		directed.addEdge(0, 1);
		directed.addEdge(0, 3);
		directed.addEdge(1, 2);
		directed.addEdge(3, 4);
		boolean[] visited = new boolean[size];

		directed.depthFirstSearch(0, visited, 0, true);
		boolean vistedComplex[] = new boolean[size];
		// System.out.println(" ");
		// undirected.breadthFirstsearch(0, visited);
		// undirected.printGraph();
		/*
		 * int[] res = undirected.shortestPathUndir(0, visited, size); for (int dist :
		 * res) System.out.println(dist);
		 */
		// System.out.println(undirected.detectCycleUndirected(visited, 0, -1));
	}

}

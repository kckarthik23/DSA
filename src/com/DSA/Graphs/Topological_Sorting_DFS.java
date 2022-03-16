package com.DSA.Graphs;

import java.util.Stack;

public class Topological_Sorting_DFS {

    public void DFS(boolean visited[], int s, Graph directed, Stack<Integer> ts) {
        visited[s] = true;
        for (int adj : directed.verticies.get(s))
            if (!visited[adj])
                DFS(visited, adj, directed, ts);

        ts.push(s);

    }

    public void topologicalSortDFS(Graph directed, int V) {
        Stack<Integer> ts = new Stack<>();
        boolean visited[] = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!visited[v])
                DFS(visited, v, directed, ts);
        }

        while (!ts.isEmpty())
            System.out.println(ts.pop());
    }

}

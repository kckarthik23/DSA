package com.DSA.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Kahn_s_topological_Sorting {

    public void topoSorting(Graph directed, int V) {
        int inDegree[] = new int[V];
        Queue<Integer> vQueue = new LinkedList<>();
        for (int v = 0; v < V; v++)
            for (int x : directed.verticies.get(v))
                inDegree[x]++;

        for (int v = 0; v < inDegree.length; v++) {
            if (inDegree[v] == 0)
                vQueue.add(v);
        }
        while (!vQueue.isEmpty()) {
            int node = vQueue.poll();
            System.out.print(node + " ");
            for (int x : directed.verticies.get(node)) {
                inDegree[x]--;
                if (inDegree[x] == 0)
                    vQueue.add(x);
            }
        }

    }

}

package com.DSA.Graphs;

import java.util.Arrays;

public class PrimsSpanningTree {

    // divide and conquer masterpiece
    public static int minSpanningTree(int graph[][]) {
        int v = graph.length;
        boolean[] mtset = new boolean[v];
        int res = 0;
        int keys[] = new int[v];
        Arrays.fill(keys, Integer.MAX_VALUE);
        keys[0] = 0;
        for (int c = 0; c < v; c++) {
            int u = -1;
            for (int i = 0; i < v; i++)
                if (!mtset[i] && (u == -1 || keys[i] < keys[u]))
                    u = i;

            mtset[u] = true;
            res += keys[u];

            for (int j = 0; j < v; j++)
                if (!mtset[j] && graph[u][j] != 0)
                    keys[j] = Math.min(graph[u][j], keys[j]);

        }
        return res;
    }

    public static void main(String[] args) {
        int graph[][] = {
                { 0, 10, 5, 0 }, { 10, 0, 4, 5 }, { 5, 4, 0, 2 }, { 0, 5, 2, 0 }
        };
        System.out.println(minSpanningTree(graph));
    }

}

package com.DSA.Graphs;

import java.util.Arrays;

public class Dijkshtra_s_SP {
    boolean spSet[];
    int length;
    int dist[];
    int source;

    Dijkshtra_s_SP(int length, int source) {
        this.length = length;
        this.spSet = new boolean[length];
        this.dist = new int[length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        this.source = source;
        this.dist[source] = 0;
    }

    public int minEdge(int dist[]) {
        int min = Integer.MAX_VALUE;

        int minIndex = -1;
        for (int i = 0; i < length; i++)
            if (!spSet[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }

        return minIndex;
    }

    public void dijKshtraAlgo(int dist[], int graph[][]) {
        for (int c = 0; c < length - 1; c++) {
            int minInd = minEdge(dist);
            spSet[minInd] = true;

            for (int j = 0; j < length; j++) {
                if (!spSet[j] && graph[minInd][j] != 0)
                    dist[j] = Math.min(dist[j], dist[minInd] + graph[minInd][j]);
            }
        }
        print(dist);
    }

    public void print(int dist[]) {
        for (int i : dist) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };

        Dijkshtra_s_SP dsp = new Dijkshtra_s_SP(5, 1);
        dsp.dijKshtraAlgo(dsp.dist, graph);
    }
}

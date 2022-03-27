package com.LeetCode;

import java.util.Arrays;

class TwoCity {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]));
        for (int i[] : costs)
            for (int val : i)
                System.out.print(val + " ");
        // Counters for people to both the cities
        int a = 0;
        int b = 0;
        // Total costs
        int totalCost = 0;
        // Loop until we send all candidates to their respective cities
        int index = 0;
        while (index < costs.length) {
            if ((costs[index][0] <= costs[index][1] && a < costs.length / 2) || b == costs.length / 2) {
                totalCost += costs[index++][0];
                a++;
            } else {
                totalCost += costs[index++][1];
                b++;
            }
        }
        return totalCost;
    }
}

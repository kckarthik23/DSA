package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class KWeakestRowsMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> sol = new HashMap<>();
        for (int i = 0; i < mat.length; i++)

        {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    count++;
            }
            sol.put(i, count);
        }

        return sol.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(so -> so.getKey())
                .mapToInt(Integer::intValue).limit(k).toArray();

        // .collect(Collectors.toList());
        // li.toArray(new Integer[0]);

    }
}

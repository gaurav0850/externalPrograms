package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindMissingandRepeatedValues {

    @Test
    public void test() {
        int[][] grid = {{1,3},{2,2}};
        int[] expected = {2,4};

        assertArrayEquals(expected, findMissingAndRepeatedValues(grid));

        int[][] grid1 = {{9,1,7},{8,9,2},{3,4,6}};
        int[] expected1 = {9,5};

        assertArrayEquals(expected1, findMissingAndRepeatedValues(grid1));

    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int[] map = new int[n*n+1];
        int[] res = new int[2];

        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                int temp=grid[i][j];
                map[temp]++;
            }
        }

        for (int i = 1; i <= n*n; i++) {
            int value = map[i];
            if(value==0) res[1]=i;
            if(value==2) res[0]=i;
        }

        return res;

//        int n = grid.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        int[] res = new int[2];
//
//        for (int[] ints : grid) {
//            for (int j = 0; j < n; j++) {
//                map.put(ints[j], map.getOrDefault(ints[j], 0) + 1);
//            }
//        }
//
//        for (int i = 1; i <= n*n; i++) {
//            Integer value = map.getOrDefault(i, 0);
//            if(value ==0) res[1]=i;
//            if(value==2) res[0]=i;
//        }
//
//        return res;
    }
}

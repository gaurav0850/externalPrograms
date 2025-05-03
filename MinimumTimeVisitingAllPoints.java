package org.example.leetcode;

public class MinimumTimeVisitingAllPoints {
    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int z = Math.max(Math.abs(points[i + 1][0] - points[i][0]),
                             Math.abs(points[i + 1][1] - points[i][1]));
            res += z;
        }

        return res;
    }
}

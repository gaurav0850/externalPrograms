package org.example.leetcode;

import java.util.Arrays;

public class SortedSquares {

    public static void main(String[] args) {

        int[] input = new int[]{-7,-3,2,3,11};
        int[] output = sortedSquares(input);
        System.out.println(Arrays.toString(output));
    }

    public static int[] sortedSquares(int[] nums) {
        int length = nums.length;

        int l = 0;
        int r = length - 1;

        int[] res = new int[length];
        int resultIndex = length - 1;

        while (l <= r) {
            int lS = nums[l] * nums[l];
            int rS = nums[r] * nums[r];

            if (lS > rS) {
                res[resultIndex] = lS;
                l++;
            } else {
                res[resultIndex] = rS;
                r--;
            }
            resultIndex--;
        }
        return res;
    }
}

package org.example.leetcode;

public class MaximumAverageSubArray1 {
    public static void main(String[] args) {
        int[] input = new int[]{9, 7, 3, 5, 6, 2, 0, 8, 1, 9};
        int k = 6;
        System.out.println(findMaxAverage(input, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        // 1 12 -5 -6 50 3    ----   4
        // 1 12 -5 -6.    .5
        // 12 -5 -6 50.
        // -5 -6 50 3

        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int maxSum = currentSum;
        if (k == n)
            return maxSum * 1.0 / k;

        int l = 1;
        int r = l + k - 1;
        while (r < n) {
            currentSum = currentSum - nums[l - 1] + nums[r];
            maxSum = Math.max(maxSum, currentSum);
            r++;
            l++;
        }
        return maxSum * 1.0 / k;
    }
}

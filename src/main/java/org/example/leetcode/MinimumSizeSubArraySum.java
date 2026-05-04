package org.example.leetcode;


/**
 * Leetcode 209
 * Sliding window
 */
public class MinimumSizeSubArraySum {

    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, input));

    }

    public static int minSubArrayLen(int target, int[] nums) {

        int l = 0;
        int min = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int r = 0; r < nums.length; r++) {
            currentSum += nums[r];
            // slide window from left while sum meets target
            while (target <= currentSum) {
                // assign to minimum
                min = Math.min(min, r - l + 1);
                // remove left element
                currentSum -= nums[l];
                l++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;

    }


}

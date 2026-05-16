package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarray53 {

    @Test
    public void testExample1() {
        // Input: nums = [5,4,-1,7,8]
        // Output: 23
        int[] nums = {5, 4, -1, 7, 8};
        int result = maxSubArray(nums);
        assertEquals(23, result);
    }

    @Test
    public void testExample2() {
        // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        // Output: 6
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        assertEquals(6, result);
    }

    @Test
    public void testExample3() {
        // Input: nums = [1]
        // Output: 1
        int[] nums = {1};
        int result = maxSubArray(nums);
        assertEquals(1, result);
    }

    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int max = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            max = Math.max(max, currentSum);
        }
        return max;
    }
}

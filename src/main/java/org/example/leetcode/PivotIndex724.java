package org.example.leetcode;

import java.util.Arrays;

public class PivotIndex724 {

    public static void main(String[] args) {
        int[] input = {1, 7, 3, 6, 5, 6};  // expected = 3
        System.out.println(pivotIndex(input));
    }

    public static int pivotIndex(int[] nums) {

        int n = nums.length;

        if (n == 1) return 1;

        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);

        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < n; i++) {
            rightSum = rightSum-nums[i];
            if(leftSum == rightSum) return i;
            leftSum=leftSum+nums[i];
        }

        return -1;
    }
}

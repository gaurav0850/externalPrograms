package org.example.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] input = new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5};
        int target = -2;
        System.out.println(threeSumClosest(input, target));
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            int l = i + 1;
            int r = length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(target - sum) < Math.abs(target - res)) {
                    res = sum;
                }
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}

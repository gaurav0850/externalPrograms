package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class LongestHarmoniousSubsequence {

    public static void main(String[] args) {
        int[] input = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(findLHS(input));
    }

    public static int findLHS(int[] nums) {

//      *********Best solution ********
//        HashMap<Integer, Integer> count = new HashMap<>();
//
//        for (int x : nums)
//            count.put(x, count.getOrDefault(x, 0) + 1);
//
//        int best = 0;
//        for (int x : count.keySet())
//            if (count.containsKey(x + 1))
//                best = Math.max(best, count.get(x) + count.get(x + 1));
//
//        return best;


        // 1 3 2 2 5 2 3 7
        // 1 2 2 2 3 3 5 7

        Arrays.sort(nums);
        int n = nums.length;
        if (n < 1)
            return 0;

        int longest = 0;

        for (int l = 0; l < n - 1; l++) {
            if (l != 0 && nums[l] == nums[l - 1]) {
                continue;
            }

            int r = l + 1;

            // check if diff == 1
            while (r < n && (nums[r] - nums[l] <= 1)) {
                r++;
            }
            if (nums[r - 1] - nums[l] == 1) {
                longest = Math.max(longest, r - l);
            }

            if (longest > (n - l)) {
                // no more possible longest substring
                return longest;
            }
        }

        return longest;
    }
}

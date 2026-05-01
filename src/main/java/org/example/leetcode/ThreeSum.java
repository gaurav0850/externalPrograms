package org.example.leetcode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] input = new int[]{-2,0,1,1,2};
        System.out.println(threeSum(input));

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        int length = nums.length;
        Set<List<Integer>> res = new HashSet<>();

        System.out.println("Before sort: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After sort: " + Arrays.toString(nums));

        for (int i = 0; i < length - 2; i++) {
            if(i>1 && nums[i] == nums[i-1]) {
                continue;
            }
            int start = i + 1;
            int end = length - 1;
            int target = nums[i]*-1;

            while(start < end) {
                int sum = nums[start] + nums[end];
                if(sum == target) {
                    ArrayList<Integer> res1 = new ArrayList<>(Arrays.asList(nums[i], nums[start],nums[end]));
                    res.add(res1);
                    start++;
                    continue;
                }
                if(sum<target) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return res.stream().toList();
    }
}

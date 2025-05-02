package org.example.leetcode;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1},11)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        int[] res=new int[2];

        for(int i=0;i<nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                res[0]=map.get(target-nums[i]);
                res[1]=i;
            }
            else map.put(nums[i], i);
        }
        return res;
    }
}

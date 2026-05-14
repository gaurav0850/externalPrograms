package org.example.leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumber136 {

    @Test
    public void testExample1() {
        // Input: nums = [2,2,1]
        // Output: 1
        int[] nums = {2, 2, 1};
        int result = singleNumber(nums);
        assertEquals(1, result);
    }

    @Test
    public void testExample2() {
        // Input: nums = [4,1,2,1,2]
        // Output: 4
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber(nums);
        assertEquals(4, result);
    }

    @Test
    public void testExample3() {
        // Input: nums = [1]
        // Output: 1
        int[] nums = {1};
        int result = singleNumber(nums);
        assertEquals(1, result);
    }

    public int singleNumber(int[] nums) {
        // Solution 1: using hashmap
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i: nums) {
//            map.put(i, map.getOrDefault(i, 0)+1);
//        }
//        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
//            if(map.get(e.getKey())==1) {
//                return e.getKey();
//            }
//        }
//        return 0;

        // Solution 2: Using sum and set
//        int sum = 0;
//        int expectedSum = 0;
//
//        Set<Integer> set = new HashSet<>();
//
//        for(int i=0; i<nums.length; i++) {
//            sum+=nums[i];
//            if(set.add(nums[i])) {
//                expectedSum+=2*nums[i];
//            }
//        }
//        return expectedSum-sum;


        // Solution 3: using xor
        // a^a = 0
        // a^0 = a

        int res=nums[0];
        for (int i = 1; i < nums.length; i++) {
            res^=nums[i];
        }
        return res;
    }
}

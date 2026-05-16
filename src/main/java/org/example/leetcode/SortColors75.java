package org.example.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColors75 {

    @Test
    public void testExample1() {
        // Input: nums = [2,0,2,1,1,0]
        // Output: [0,0,1,1,2,2]
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        int[] expected = {0, 0, 1, 1, 2, 2};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testExample2() {
        // Input: nums = [2,0,1]
        // Output: [0,1,2]
        int[] nums = {2, 0, 1};
        sortColors(nums);
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, nums);
    }

    public void sortColors(int[] nums) {
//        Map<Integer, Integer> frequency = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
//        }
//        int index = 0;
//        for(int i=0; i<=2; i++) {
//            for (int j = 0; j < frequency.getOrDefault(i, 0); j++) {
//                nums[index++]=i;
//            }
//        }

        int[] frequency = new int[3];

        for (int num : nums) {
            frequency[num] = frequency[num]+1;
        }

        int index = 0;
        for(int i=0; i<=2; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                nums[index++]=i;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}

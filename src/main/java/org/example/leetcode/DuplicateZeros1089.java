package org.example.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros1089 {
    public static void main(String[] args) {
        int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
        // expected: 1,0,0,2,3,0,0,4
        duplicateZeros(input);
        System.out.println(Arrays.toString(input));

    }

    public static void duplicateZeros(int[] nums) {

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
            if (nums[i] == 0) {
                q.add(0);
            }
            nums[i]=q.poll();
        }
    }
}

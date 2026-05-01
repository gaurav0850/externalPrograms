package org.example.leetcode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] input = new int[]{0, 1, 0, 3, 12};
        moveZeroes(input);
        System.out.println(Arrays.toString(input));
    }

    private static void moveZeroes(int[] nums) {
        int length = nums.length;
        // only 1 element
        if (length < 2) return;

        int pointer1 = 0;
        int pointer2 = 1;

        while (pointer2 < length) {

            if (nums[pointer1] != 0) {
                pointer1++;
                pointer2++;
            } else if (nums[pointer2] == 0) {
                pointer2++;
            } else {
                int temp = nums[pointer2];
                nums[pointer2] = nums[pointer1];
                nums[pointer1] = temp;
            }
        }
    }
}

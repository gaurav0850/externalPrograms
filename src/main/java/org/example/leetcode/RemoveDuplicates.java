package org.example.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3};
        int i = removeDuplicates(input);
        System.out.println(Arrays.toString(input));
        System.out.println(i);
    }


    public static int removeDuplicates(int[] nums) {

        int pointer1 = 0;
        int pointer2 = 1;
        int length = nums.length;
        int unique = 1;

        while (pointer2 < length) {
            if (nums[pointer1] != nums[pointer2]) {
                if(pointer2-pointer1>1) nums[pointer1 + 1] = nums[pointer2];
                pointer2++;
                pointer1++;
                unique++;
            }
            else pointer2++;
        }
        return pointer1+1;

    }
}

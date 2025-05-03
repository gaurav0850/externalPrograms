package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;


// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
public class NumberSmaller {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] temp = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            temp[i] = nums[i];
//        }
        int[] temp=nums.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < temp.length; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], i);
            }
        }

        int[] res = new int[nums.length];
        int j = 0;
        for (int i : nums) {
            res[j] = map.get(i);
            j++;
        }

        return res;
    }
}

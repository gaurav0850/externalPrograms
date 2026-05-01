package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumMedium {

    public static void main(String[] args) {
        List<int[]> inputs = new ArrayList<>();
        inputs.add(new int[]{2,3,5,6,13,51});
        List<Integer> targets = new ArrayList<>();
        targets.add(9);


        for (int i = 0; i < inputs.size(); i++) {
            int[] res = twoSum(inputs.get(i), targets.get(i));
            System.out.println(Arrays.toString(res));
        }


    }

    public static int[] twoSum(int[] numbers, int target) {

        int length = numbers.length;

        if(length<3) return new int[]{1,2};

        int start = 0, end = length-1;

        while(start < end) {
            int sum = numbers[start] + numbers[end];
            if(sum == target) {
                return new int[]{start+1, end+1};
            }
            if(sum<target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }


}

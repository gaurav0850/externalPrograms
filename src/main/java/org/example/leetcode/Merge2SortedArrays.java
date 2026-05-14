package org.example.leetcode;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Merge2SortedArrays {

    @Test
    public void testMerge() {
        // Test case 1: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 → [1,2,2,3,5,6]
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeSecondEmpty() {
        // Test case 2: nums1 = [1], m = 1, nums2 = [], n = 0 → [1]
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        merge(nums1, m, nums2, n);
        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeFirstEmpty() {
        // Test case 3: nums1 = [0], m = 0, nums2 = [1], n = 1 → [1]
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;

        for (int i = (m + n - 1); i >= 0; i--) {

            if (index1 < 0) {
                nums1[i] = nums2[index2];
                index2--;
                continue;
            }

            if (index2 < 0) {
                nums1[i] = nums1[index1];
                index1--;
                continue;
            }

            if (nums1[index1] > nums2[index2]) {
                nums1[i] = nums1[index1];
                index1--;
            } else {
                nums1[i] = nums2[index2];
                index2--;
            }
        }
    }
}

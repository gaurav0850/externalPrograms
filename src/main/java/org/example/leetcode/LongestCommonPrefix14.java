package org.example.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefix14 {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        // Sort so first and last strings are most different
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    @Test
    public void testExample1() {
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix(strs), "Should return 'fl' as common prefix");
    }

    @Test
    public void testExample2() {
        String[] strs = {"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix(strs), "Should return empty string when no common prefix");
    }
}

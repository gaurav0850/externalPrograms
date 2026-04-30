package org.example.leetcode;

import java.util.Arrays;

public class ValidAnagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("liten", "silent"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            frequency[sChar - 'a']++;
            char tChar = t.charAt(i);
            frequency[tChar - 'a']--;
        }

        return Arrays.equals(frequency, new int[26]);
    }
}

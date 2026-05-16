package org.example.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPallindrome125 {

    @Test
    public void testExample1() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(isPalindrome(s), "Should return true for valid palindrome");
    }

    @Test
    public void testExample2() {
        String s = "race a car";
        assertFalse(isPalindrome(s), "Should return false for invalid palindrome");
    }

    @Test
    public void testExample3() {
        String s = " ";
        assertTrue(isPalindrome(s), "Should return true for empty string after removing non-alphanumeric characters");
    }

    @Test
    public void testExample4() {
        String s = "0P";
        assertFalse(isPalindrome(s), "Should return true for empty string after removing non-alphanumeric characters");
    }

    public boolean isPalindrome(String s) {

        char[] array = s.toCharArray();

        int n = array.length;

        if (n <= 1) {
            return true;
        }

        int l = 0;
        int r = n - 1;


        while (l <= r) {
            // if left invalid character, then increment l keeping r same
            char chleft = array[l];
            if (!isValid(chleft)) {
                l++;
                continue;
            }

            // if right invalid character, then decrement r keeping l same
            char chright = array[r];
            if (!isValid(chright)) {
                r--;
                continue;
            }

            if (Character.toLowerCase(chright) != Character.toLowerCase(chleft)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    private boolean isValid(char ch) {
        return Character.isLetterOrDigit(ch);
    }

}

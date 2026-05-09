package org.example.leetcode;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ZigZagConversion {

    @Test
    public void test() {
        Assertions.assertEquals("PAHNAPLSIIGYIR", convert("PAYPALISHIRING", 3));
        Assertions.assertEquals("PINALSIGYAHRPI", convert("PAYPALISHIRING", 4));
        Assertions.assertEquals("A", convert("A", 4));
        Assertions.assertEquals("AB", convert("AB", 1));
    }

    public String convert(String s, int numRows) {

        int n = s.length();

        if (n < 2 || numRows == 1) return s;

        // create a StringBuilder for storing each row
        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int index = 0;

        char[] charArray = s.toCharArray();

        while(index<n) {
            // go down
            for(int i=0; i<numRows && index<n; i++) {
                sb[i].append(charArray[index++]);
            }
            // go diagonal top (excluding first row)
            for(int i=numRows-2; i>0 && index<n; i--) {
                sb[i].append(charArray[index++]);
            }
        }

        StringBuilder res = sb[0];

        for (int i = 1; i < numRows; i++) {
            res.append(sb[i]);
        }

        return res.toString();
    }
}

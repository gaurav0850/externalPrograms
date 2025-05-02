package org.example.leetcode;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        ExcelSheetColumnNumber obj = new ExcelSheetColumnNumber();
        System.out.println(obj.titleToNumber("AB"));
    }
    public int titleToNumber(String columnTitle) {


        int res=0;
        int length = columnTitle.length();


        for(int i=length-1, power=0; i>=0; i--, power++) {
            res+=(Math.pow(26, power) * ((int)columnTitle.charAt(i) -64));
            System.out.println(res);
        }

        return res;
    }
}

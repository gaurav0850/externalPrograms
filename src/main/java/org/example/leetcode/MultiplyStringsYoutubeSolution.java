package org.example.leetcode;

public class MultiplyStringsYoutubeSolution {
    public static void main(String[] args) {


        System.out.println(multiply("123", "456"));
    }

    public static String multiply(String num1, String num2) {

        int m = num1.length(), n = num2.length();

        if (m == 0 || n == 0 || num1.equals("0") || num2.equals("0"))
            return "0";

        if (num1.equals("1"))
            return num2;

        if (num2.equals("1"))
            return num1;

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                //adding previous values in result
                product += result[i + j + 1];

                //adding in result array
                result[i + j + 1] = product % 10;
                result[i + j] += product / 10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int r: result) {
            if(sb.length()==0 && r==0) {
                continue;
            }
            sb.append(r);
        }

        return sb.toString();
    }
}

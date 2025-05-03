package org.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiplyStrings {
    public static void main(String[] args) {


        System.out.println(multiply("123","456"));
    }
    public static String multiply(String num1, String num2) {
//        int n1= Integer.parseInt(num1);
//        int n2= Integer.parseInt(num2);
//
//        return String.valueOf(n1*n2);

//        BigInteger n1=new BigInteger(num1);
//        BigInteger n2=new BigInteger(num2);
//        BigInteger multiply = n1.multiply(n2);
//        return multiply.toString();

        int m = num1.length(), n = num2.length();

        if (m == 0 || n == 0 || num1.equals("0") || num2.equals("0"))
            return "0";

        if (num1.equals("1"))
            return num2;

        if (num2.equals("1"))
            return num1;



        List<Integer> res2=new ArrayList<>(Collections.nCopies(m+n,0));


        System.out.println(res2);
        for(int i=n-1; i>=0; i--) {
            for(int j=m-1; j>=0; j--) {
                int individual = (num2.charAt(i)-'0') * (num1.charAt(j)-'0');
                int product = res2.get(i + j + 1) + individual;
                System.out.println("individual "+individual);
                System.out.println("index "+(i+j+1));

                res2.set((i+j+1), product%10);
                res2.set((i+j), res2.get(i+j)+product/10);

                System.out.println("res2 "+res2);

            }
        }
        System.out.println(res2);

        StringBuilder result= new StringBuilder();

//        for(int i=res2.size()-1; i>0; i--) {
//            if(res2.get(i)>9) {
//                int total = res2.get(i);
//                //remainder
//                res2.set(i, total%10);
//                res2.set(i-1, res2.get(i-1)+total/10);
//
//            }
//        }
        System.out.println(res2);

        res2.forEach(result::append);



//        for(int i=0; i<res2.size(); i++){
//                result.append(res2.get(i));
//        }
        if(result.substring(0,1).equals("0")) {
            return result.substring(1);
        }
        System.out.println(result);


        return result.toString();
    }
}

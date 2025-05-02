package org.example;

import java.util.Arrays;
import java.util.List;

public class RepeatedStrings {
    public static void main(String[] args) {
        long n = 534802106762L;
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        if (!s.contains("a")) {
            System.out.println("0");
        }

        if (s.equals("a"))
            System.out.println(n);

        String initial = s;
        long initialLength = s.length();

        String[] charArray = initial.split("");
        System.out.println(Arrays.toString(charArray));
        List<String> list = Arrays.asList(charArray);
//        long countOfAIn1 = list.stream().
//                filter(x -> x.equals("a")).
//                count();
        long res = (n/s.length()) * initial.chars().filter(t -> t == 'a').count();


         res += s.substring(0, (int) (n % initialLength)).
                chars().
                filter(x -> x == 'a').
                count();

        System.out.println("Total count"+res);



    }
}

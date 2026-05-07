package org.example.tcscareers;


import java.util.LinkedHashMap;
import java.util.Map;

public class SortNumbers {
    public static void main(String[] args) {
        String input = "5338252838";
        System.out.println(sort(input));

    }

    public static String sort(String str) {

        char[] array = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : array) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        for (char ch : map.keySet()) {
            sb.repeat(String.valueOf(ch), map.get(ch));
        }

        return sb.toString();

    }
}

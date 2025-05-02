package org.example;

import java.util.Map;
import java.util.stream.Collectors;

public class StringCharacterFrequency {
    public static void main(String[] args) {
        String str="abaaaccee";
        Map<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        character -> character,
                        Collectors.counting()
                ));

        System.out.println(collect);
    }
}

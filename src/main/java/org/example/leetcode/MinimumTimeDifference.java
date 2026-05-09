package org.example.leetcode;

import javax.swing.*;
import java.util.*;

public class MinimumTimeDifference {

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("23:59");
        input.add("00:00");
//        input.add("12:23");
//        input.add("12:12");
//        input.add("00:13");
//        List<String> input = List.of("23:59","00:00", "00:00");
        System.out.println(findMinDifference(input));
    }

    private static int convertToMinutes(String s) {
        return s.equals("00:00")? 1440 : Integer.parseInt(s.substring(0,2))*60+Integer.parseInt(s.substring(3,5));
    }

    public static int findMinDifference(List<String> timePoints) {

        Set<Integer> set = new TreeSet<>();
        for (String timePoint : timePoints) {
            if (!set.add(convertToMinutes(timePoint))) {
                // duplicate string or time , return 0
                return 0;
            }
        }

        List<Integer> minutes = new ArrayList<>(set);
        System.out.println(set);
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < minutes.size(); i++) {
            min = Math.min(min, minutes.get(i)-minutes.get(i-1));
            if(min==0) return 0;
        }
        // edge case, first and last difference
        min = Math.min(min, 1440 + minutes.getFirst() - minutes.getLast());
        return min;






//        ArrayList<Integer> minutes = (ArrayList<Integer>) timePoints
//                .stream()
//                .map(s -> s.equals("00:00")? 1440 : Integer.parseInt(s.substring(0,2))*60+Integer.parseInt(s.substring(3,5)))
//                .collect(Collectors.toList());
//
//
//        Collections.sort(minutes);
//
//        System.out.println(minutes);
//
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 1; i < minutes.size(); i++) {
//            min = Math.min(min, minutes.get(i)-minutes.get(i-1));
//            if(min==0) return 0;
//        }
//        // edge case, first and last difference
//        min = Math.min(min, 1440 + minutes.get(0) - minutes.get(minutes.size() - 1));
//        return min;
    }
}

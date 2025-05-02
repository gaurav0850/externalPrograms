package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(3);
        arr.add(9);
        arr.add(-5);
        arr.add(-3);
        arr.add(0);
        arr.add(6);
        arr.add(3);
        plusMinus(arr);
    }

    private static void plusMinus(List<Integer> arr) {
        Collections.sort(arr);



        int indexedOfZero = indexOfZero(arr);
    }

    public static int indexOfZero(List<Integer> arr) {
        int size = arr.size();
        int mid=size/2;
        int start = 0;
        int last = mid;



        return 0;
    }
}

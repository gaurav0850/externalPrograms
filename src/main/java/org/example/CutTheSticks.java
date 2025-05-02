package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {
    public static void main(String[] args) {

//        List<Integer> arr= List.of(8, 8, 14, 10, 3, 5, 14, 12);
        List<Integer> arr= List.of(1);


        if(arr.size()==1) {
            System.out.println(List.of(1));
        }
//        List<Integer> arr= List.of(1);
        List<Integer> res= new ArrayList();



        while(arr.size()>1) {
            //find minimum
            int min = Collections.min(arr);
            //change to x-min and remove 0
//            arr = arr.stream().map(x-> (x-min)).filter(x-> x!=0).collect(Collectors.toList());
            arr.removeIf(n->n==min);//same as above
            //add size to res
            res.add(arr.size());
        }
        System.out.println(res);

    }
}

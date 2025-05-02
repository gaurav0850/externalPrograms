package org.example;

import java.util.Date;

public class LibraryFine {
    public static void main(String[] args) {
        String in1 = "9 6 2015";
        String in2 = "6 6 2015";

        int d1 = Integer.parseInt(in1.split(" ")[0]);

        int m1 = Integer.parseInt(in1.split(" ")[1]);

        int y1 = Integer.parseInt(in1.split(" ")[2]);

        int d2 = Integer.parseInt(in2.split(" ")[0]);

        int m2 = Integer.parseInt(in2.split(" ")[1]);

        int y2 = Integer.parseInt(in2.split(" ")[2]);


        int result = calculateFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
    }

    private static int calculateFine(int d1, int m1, int y1, int d2, int m2, int y2) {
//        int yearDifference = y2 - y1;
//        int monthDiff=m2-m1;
//        int daysDiff=d2-d1;
//
//        if (yearDifference > 0) {
//            return 10000;
//        }

        Date date = new Date();


        return 0;
    }
}

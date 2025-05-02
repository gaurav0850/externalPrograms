package org.example;

public class SherlockAndSquares {
    public static void main(String[] args) {

        //https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true
        String input = "11 734";

        String[] firstMultipleInput = input.replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(firstMultipleInput[0]);
        int b = Integer.parseInt(firstMultipleInput[1]);
        int result = SherlockAndSquares.squares(a, b);
        System.out.println(result);
    }

    private static int squares(int a, int b) {
//        double low =(Math.sqrt((double) a));
//        double high =(Math.sqrt((double) b));
//        System.out.println(low);
//        System.out.println(high);

        int low = (int) Math.ceil(Math.sqrt(a));
        int high = (int) Math.floor(Math.sqrt(b));
        return high-low+1;
    }
}

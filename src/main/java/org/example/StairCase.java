package org.example;

public class StairCase {
    public static void main(String[] args) {
        int n = 6;
        printStairCase(n);
        String str="abc";
        System.out.println(str.repeat(3));
    }

    private static void printStairCase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                } else
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}

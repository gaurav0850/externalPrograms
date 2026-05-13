package org.example.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

// Given a positive integer n, generate an n x n matrix
// filled with elements from 1 to n2 in spiral order.
public class SpiralMatrixTwo59 {

    private void printArray(int[][] nums) {
        for (int[] a: nums) {
            for(int n: a) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }

    @Test
    public void test() {
//        int[][] expected = {{1,2,3},{8,9,4},{7,6,5}};
//        int[][] actual = generateMatrix(3);
//        printArray(actual);
//        Assertions.assertTrue(Arrays.deepEquals(expected, actual));
//
//        int[][] expected1 = {{1}};
//        int[][] actual1 = generateMatrix(1);
//        printArray(actual1);
//        Assertions.assertTrue(Arrays.deepEquals(expected1, actual1));
//
        int[][] expected2 = {{1,2},{4,3}};
        int[][] actual2 = generateMatrix(2);
        printArray(actual2);
        Assertions.assertTrue(Arrays.deepEquals(expected2, actual2));
//        printArray(generateMatrix(5));
    }

    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];

        int currentRow = 0;
        int currentCol = 0;
        int leftCol = 0 , rightCol = n-1;
        int topRow = 0, bottomRow = n-1;

        int i = 1;
        while(i<=(n*n)) {
            // move right
            while(currentCol<=rightCol && i<=(n*n)) {
                res[currentRow][currentCol++]=i++;
            }
            topRow++; // current top row is filled, do not go back to it.

            currentCol--; // compensate last increment of above while loop
            currentRow++;

            // move down
            while(currentRow<=bottomRow && i<=(n*n)) {
                res[currentRow++][currentCol]=i++;
            }
            rightCol--;// right column is filled

            currentRow--;// compensate last increment of above while loop
            currentCol--;

            // move left
            while(currentCol>=leftCol && i<=(n*n)) {
                res[currentRow][currentCol--]=i++;
            }
            bottomRow--;

            currentCol++;
            currentRow--;

            // move top
            while(currentRow>=topRow && i<=(n*n)) {
                res[currentRow--][currentCol]=i++;
            }
            leftCol++;

            currentRow++;
            currentCol++;

        }
        return res;
    }
}

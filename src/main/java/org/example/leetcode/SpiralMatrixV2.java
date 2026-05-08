package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixV2 {
    public static void main(String[] args) {
//        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] input=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] input=new int[][] {{1,2},{3,4}};
//    int[][] input=new int[][] {{5,7}};
//        int[][] input = new int[][]{{5}, {7}, {9}};
        System.out.println(spiralOrder(input));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        int row = matrix.length;  // rows
        int col = matrix[0].length; // columns

        List<Integer> res = new ArrayList<>();

        int leftCol = 0;
        int rightCol = col - 1;
        int topRow = 0;
        int bottomRow = row - 1;

        int x = 0;
        int y = 0;


        while(true){
            // move right
            System.out.println("right");
            while (y <= rightCol) {
                res.add(matrix[x][y]);
                System.out.println(res);
                y++;
            }
            // skip first row now
            topRow++;

            if(leftCol>rightCol || topRow>bottomRow) break;

            // move bottom
            x++;
            y--; // this y-- is to cancel last iteration of previous loop
            System.out.println("down");
            while (x <= bottomRow) {
                res.add(matrix[x][y]);
                System.out.println(res);
                x++;
            }
            // skip last column
            rightCol--;

            if(leftCol>rightCol || topRow>bottomRow) break;

            // move left
            y--;
            x--;
            System.out.println("left");
            while (y >= leftCol ) {
                res.add(matrix[x][y]);
                System.out.println(res);
                y--;
            }

            // skip last row
            bottomRow--;

            if(leftCol>rightCol || topRow>bottomRow) break;

            // move up
            x--;
            y++;
            System.out.println("top");
            while (x >= topRow) {
                res.add(matrix[x][y]);
                System.out.println(res);
                x--;
            }
            // skip left column
            leftCol++;
            x++;
            y++;

            System.out.println("topRow " + topRow+" Bottomrow" + bottomRow+" leftCol" + leftCol+" rightCol" + rightCol);
            System.out.println("x: "+x + " y: "+y);
            if(leftCol>rightCol || topRow>bottomRow) break;

        }




        return res;

    }
}
package org.example.leetcode;

import java.util.Arrays;

public class TraverseDiagonal498 {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(findDiagonalOrder(input)));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] res = new int[row * col];
        int index = 0; // index of above res array

        // if (row == 1 || col == 1) {
        //     for (int i = 0; i < row; i++) {
        //         for (int j=0; j<col; j++) {
        //             res[index++] = mat[i][j];
        //         }
        //     }
        //     return res;
        // }

        int y = 0, x = 0; // y = rows, x = col
        //    x1 x2
        // y1
        // y2


        while (index < res.length) {
            res[index++] = mat[y][x];
            int sum = y + x;
            boolean isEven = sum % 2 == 0;

            // for even, diagonal bottom to top
            if (isEven) {
                // if even, check if there is space to go top right
                if (x < col - 1 && y > 0) {
                    // if there is top right space, then
                    x++; // increase column
                    y--; // decrease row
                }
                // if there is no space to go top right, then check if
                // can go right
                else if (x < col - 1) {
                    x++;
                }
                // go down as there is no other option
                else {
                    y++;
                }
            }
            // for odd, diagonal from top to bottom
            else {
                // check if we can move left bottom
                if (x > 0 && y < row - 1) {
                    y++;
                    x--;
                }
                // check if we can go bottom
                else if (y < row - 1) {
                    y++;
                }
                // need to go right, as there is no other option
                else {
                    x++;
                }
            }
        }
        return res;
    }
}
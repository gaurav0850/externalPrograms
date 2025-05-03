package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
//        int[][] input=new int[][] {{1,2,3},{4,5,6},{7,8,9}, {11,66,44}};
//        int[][] input=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        int[][] input=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//    int[][] input=new int[][] {{5,7}};
    int[][] input=new int[][] {{5},{7},{9}};
        System.out.println(spiralOrder(input));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        extracted(matrix, res);


        return res;
    }

    private static void extracted(int[][] matrix,   List<Integer> res) {
        int i=0;
        int j=0;
        int m= matrix.length;
        int n= matrix[0].length;
        while(j < n) {
            res.add(matrix[i][j]);
            j++;
        }
        i++;
        j--;
        if(m==1) {
            return;
        }
        while(i < m) {
            res.add(matrix[i][j]);
            i++;
        }
        i--;
        j--;

        if(n==1) return;
        while(j>=0) {
            res.add(matrix[i][j]);
            j--;
        }
        j++;
        i--;
        while(i >0) {
            res.add(matrix[i][j]);
            i--;
        }

        //create a new matrix excluding upper values
        if(m-2>0 && n-2>0) {
            int[][] newMatrix =new int[m-2][n-2];
            int p=0;
            for(int x=1; x<(m-1); x++) {
                int q=0;
                for(int y=1; y<(n-1); y++) {
                    newMatrix[p][q]=matrix[x][y];
                    System.out.println(newMatrix[p][q]);
                    q++;
                }
                p++;
            }
            extracted(newMatrix, res);
        }
    }
}

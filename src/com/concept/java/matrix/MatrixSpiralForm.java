package com.concept.java.matrix;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 1:25 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* Print a given matrix in spiral form
  Given a 2D array, print it in spiral form. See the following examples.
* Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


Input:
        1   2   3   4  5   6
        7   8   9  10  11  12
        13  14  15 16  17  18
Output:
1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
*
*
*
* */
public class MatrixSpiralForm extends Base {

    public void spiralPrint(int input[][]) {
        int i, k = 0, l = 0, m = input.length - 1, n = input.length - 1;
        while (k < m && l < n) {
            for (i = l; i <= n; i++) {
                System.out.print(input[k][i] + "\t");
            }
            k++;
            for (i = k; i <= m; i++) {
                System.out.print(input[i][n] + "\t");
            }
            n--;
            for (i = n; i >= l; i--) {
                System.out.print(input[m][i] + "\t");
            }
            m--;
            for (i = m; i >= k; i--) {
                System.out.print(input[i][l] + "\t");
            }
            l++;
        }
    }

    public static void main(String args[]) {
        int input[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        MatrixSpiralForm matrixSpiralForm = new MatrixSpiralForm();
        System.out.println("Input:- ");
        matrixSpiralForm.printArray(input);
        System.out.println("Output:- ");
        matrixSpiralForm.spiralPrint(input);
    }

}

package com.concept.java.matrix;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 6/3/17
 * Time: 3:07 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* Find all possible path from top left to bottom right of a matrix mxn
*
* Find Best path from a matrix with minimum cost and every block cost is provided.
*
* */

public class BestPathCalculation extends Base {

    private int possiblePaths[][];
    private int pathNumber = 0;


    /*
    * Time complexity to find all possible path is O(mxn).
    *
    *  Where mxn is the dimension os the matrix.
    * */
    private void findPath(int matrix[][], int i, int j, int row, int col, int path[], int pathIndex) {

        /*
        * Reached to the bottom of the matrix and we are left with only the option to move right
        * */
        if (i == row - 1) {
            System.arraycopy(matrix[i], j, path, pathIndex, col - j);
            /*for(int k=j; k < col; k++){
                path[pathIndex+k-j] = matrix[i][k];
            }*/
            System.arraycopy(path, 0, this.possiblePaths[this.pathNumber], 0, pathIndex + col - j);
            this.pathNumber++;
            return;
        }

        /*
        * Reached to the right corner of the matrix  and we are left with only the option to move down.
        * */
        if (j == col - 1) {
            for (int k = i; k < row; k++) {
                path[pathIndex + k - i] = matrix[k][j];
            }
            System.arraycopy(path, 0, this.possiblePaths[this.pathNumber], 0, pathIndex + row - i);
            this.pathNumber++;
            return;
        }
        path[pathIndex] = matrix[i][j];
        findPath(matrix, i + 1, j, row, col, path, pathIndex + 1);
        findPath(matrix, i, j + 1, row, col, path, pathIndex + 1);
    }

    public void findPath(int matrix[][], int row, int col) {
        int path[] = new int[row + col - 1];
        this.possiblePaths = new int[row * col][row + col - 1];
        findPath(matrix, 0, 0, row, col, path, 0);
    }

    /*
    * Time complexity to find best path is O(mxn + px(m+n-1))
    * Where mxn is matrix dimension and p is the total possible path
    * */
    public int[] bestPath(int matrix[][], int row, int col) {
        findPath(matrix, row, col);
        int bestPathIndex = 0;
        int bestPathCOst = 0;
        for (int i = 0; i < this.pathNumber; i++) {
            int cost = 0;
            for (int j = 0; j < this.possiblePaths[0].length; j++) {
                cost = cost + this.possiblePaths[i][j];
                System.out.print(this.possiblePaths[i][j] + "\t");
            }
            System.out.print("\tPath cost:- " + cost);
            System.out.println();
            if (i == 0) {
                bestPathCOst = cost;
            } else if (cost < bestPathCOst) {
                bestPathIndex = i;
                bestPathCOst = cost;
            }
        }
        return this.possiblePaths[bestPathIndex];
    }

    public static void main(String args[]) {
        int matrix[][] = {{5, 20, 11}, {3, 40, 23}, {30, 5, 9}};
        BestPathCalculation bestPathCalculation = new BestPathCalculation();
        int bestPath[] = bestPathCalculation.bestPath(matrix, 3, 3);
        System.out.println("Best Path");
        bestPathCalculation.printArray(bestPath);
    }


}

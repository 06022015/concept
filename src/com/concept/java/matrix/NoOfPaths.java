package com.concept.java.matrix;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/6/17
 * Time: 8:10 AM
 * To change this template use File | Settings | File Templates.
 */

/*
* Dynamic Programming — Count all paths from top left to bottom right of a mXn matrix
*
* http://algorithms.tutorialhorizon.com/dynamic-programming-count-all-paths-from-top-left-to-bottom-right-of-a-mxn-matrix/
*
*
*  Dynamic Programming — Count all paths in 2D Matrix with Obstructions in it
*
*  http://algorithms.tutorialhorizon.com/dynamic-programming-count-all-paths-in-2d-matrix-with-obstructions-in-it/
*
* */
public class NoOfPaths extends Base {
    
    public int count(int matrix[][], int row, int col){
        if(row==matrix.length-1 || col==matrix.length-1)
            return 1;
        return count(matrix, row+1, col)+count(matrix,row,col+1);
    }
    
    public int countDP(int matrix[][]){
        int result[][] = new int[matrix.length][matrix.length];
        result[0][0] = 1;
        for(int i=0;i<result.length;i++){
            result[0][i] = 1;
        }
        for(int j=0;j<result.length;j++){
            result[j][0] = 1;
        }

        for(int i=1;i<result.length;i++){
            for(int j=1;j<result.length;j++){
                result[i][j] = result[i-1][j] + result[i][j-1];
            }
        }
        printArray(result);
        return result[result.length-1][result.length-1];
    }
    
    public int countDPWithObstruction(int matrix[][]){
        int result[][] = new int[matrix.length][matrix.length];
        result[0][0] = 1;
        for (int i = 0; i < result.length; i++) {
            if (matrix[0][i] != -1)
                result[0][i] = 1;
            else
                result[0][i] = 1;
        }
        for (int j = 0; j < result.length; j++) {
            if (matrix[j][0] != -1)
                result[j][0] = 1;
            else
                result[j][0] = 1;
        }
        for(int i=1;i<result.length;i++){
            for(int j=1;j<result.length;j++){
                if(matrix[i][j]!=-1){
                    result[i][j]=0;
                    if(result[i-1][j]>0){
                        result[i][j] = result[i][j]+result[i-1][j];
                    }
                    if(result[i][j-1]>0){
                        result[i][j] = result[i][j]+result[i][j-1];
                    }
                }
            }
        }
        printArray(result);
        return result[matrix.length-1][matrix.length-1];
    }
    
    public static void main(String args[]){
        //int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        NoOfPaths noOfPaths = new NoOfPaths();
        System.out.println("Recursive result:- "+noOfPaths.count(matrix,0,0));
        System.out.println("DP result:- "+noOfPaths.countDP(matrix));

        System.out.println("Path with obstruction");
        int arrA [][] = {{1,1,1},{1,-1,1},{1,-1,1}};
        System.out.println("Path with obstruction DP result:- "+noOfPaths.countDPWithObstruction(arrA));
    }
}

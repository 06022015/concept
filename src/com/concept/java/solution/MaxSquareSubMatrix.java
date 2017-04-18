package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/17/17
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxSquareSubMatrix extends Base{

    public int maxSubMatrix(int matrix[][]){
        int maxSize = 0;
        int temp[][] = new int[matrix.length][matrix.length];
        for(int col=0;col< matrix.length;col++){
            temp[0][col] = matrix[0][col];
        }

        for(int row=0;row< matrix.length;row++){
            temp[row][0] = matrix[row][0];
        }

        for(int i=1;i< matrix.length;i++){
            for(int j=1;j< matrix.length;j++){
                if(matrix[i][j]==1){
                    temp[i][j] = Math.min(temp[i-1][j-1], Math.min(temp[i][j-1], temp[i-1][j]))+1;
                    maxSize = Math.max(maxSize, temp[i][j]);
                }else{
                    temp[i][j] = 0;
                }
            }
        }
        printArray(temp);
        return maxSize;
    }
    
    public static void main(String args[]){
        MaxSquareSubMatrix maxSquareSubMatrix = new MaxSquareSubMatrix();
        int matrix[][] = {{0,1,0,1,0,1},{1,0,1,0,1,0},{0,1,1,1,1,0},{0,0,1,1,1,0},{1,1,1,1,1,1}};
        maxSquareSubMatrix.printArray(matrix);
        System.out.println("\n\n\n");
        System.out.println("Max Size is " + maxSquareSubMatrix.maxSubMatrix(matrix));
    }
}

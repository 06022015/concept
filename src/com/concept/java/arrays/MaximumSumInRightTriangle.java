package com.concept.java.arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/12/17
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaximumSumInRightTriangle {
    
    public static int maxSumInPath(int input[][], int n){
        int maxSum = 0;
       for(int i=1;i< n;i++){
            for(int j=0;j< i;j++){
                if(j==0)
                    input[i][j] = input[i][j]+input[i-1][j];
                else
                    input[i][j] = Math.max(input[i][j]+input[i-1][j], input[i][j]+input[i-1][j-1]);
                if(input[i][j]> maxSum)
                    maxSum = input[i][j];
            }           
       }
        return maxSum;
    }
    
    public static void main(String args[]){
        int input[][] = {{1},{1,2},{4,1,2},{2,3,1,1}};
        System.out.println(maxSumInPath(input, 4));
    }
}

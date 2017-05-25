package com.concept.java.dp;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/25/17
 * Time: 10:00 AM
 * To change this template use File | Settings | File Templates.
 */
/*
* Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).
*    Link:- http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
*
* */
public class KnapsackProblem {

    public int knapsack(int wt[], int val[], int weight){
        int temp[][] = new int[val.length+1][weight+1];
        for(int i=0;i<= val.length; i++){
            for(int j=0;j<= weight; j++){
                if(i==0 || j==0){
                    temp[i][j] = 0;
                }else if(wt[i-1]<=j){
                    temp[i][j] = Math.max(val[i-1]+temp[i-1][j-wt[i-1]], temp[i-1][j]);
                }else{
                    temp[i][j] = temp[i-1][j];
                }
            }
        }
        return temp[val.length][weight];
    }

    
    public static void main(String args[]){
        int wt[] = {10,20,30};
        int val[] = {60,100,120};
        KnapsackProblem knapsackProblem =  new KnapsackProblem();
        System.out.println(knapsackProblem.knapsack(wt, val, 50));
    }
    
    
}

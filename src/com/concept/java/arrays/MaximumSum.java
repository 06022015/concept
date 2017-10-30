package com.concept.java.arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/10/17
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaximumSum {
    
    public static int findMaxSum(int input[]){
        int dp[] = new int[input.length];
        dp[0] = input[0];
        dp[1]= Math.max(input[0], input[1]);
        for(int i=2;i< input.length;i++){
                dp[i] = Math.max(dp[i-2]+input[i], dp[i-1]);
        }
        //return Math.max(dp[input.length-2],dp[input.length-1]);
        return dp[input.length-1];
    }
    
    public static int findMaxSum2(int input[]){
        int inc = input[1];
        int exc = input[0];
        for(int i=2;i< input.length;i++){
            int temp = Math.max(inc, exc);
            inc = Math.max(exc+input[i], input[i]);
            exc = temp;
        }
        return Math.max(inc, exc);
    }
    
    public static void main(String args[]){
        /*int input1[] = {5,5,10,100,10,5};
        System.out.println(findMaxSum(input1));
        int input2[] = {1,2,3};
        System.out.println(findMaxSum(input2));
        int input3[] = {1,20,3};
        System.out.println(findMaxSum(input3));
        int input4[] = {3, 2, -1, 2, 10, 10};
        System.out.println(findMaxSum(input4));*/
        int input5[] = {-3,-6,-1,-10};
        System.out.println(findMaxSum2(input5));

    }
}

package com.concept.java.dp;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/10/17
 * Time: 7:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxGameWinner {
    
    public static int findMaxGameWinner(int players){
        if(0 == players || players == 1)
            return 0;
        int dp[] = new  int[players];
        dp[0] = 1;
        dp[1] = 2;
        int i =1;
        while(dp[i] < players){
            dp[i+1] = dp[i] + dp[i-1];
            i++;
        }
        return i-1;
    }
    
    public static void main(String args[]){
        System.out.println(findMaxGameWinner(2));
    }
}

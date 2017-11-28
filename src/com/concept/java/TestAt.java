package com.concept.java;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 11/17/17
 * Time: 5:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestAt {

    public static void main1(String[] args) {
        int n = 8;
        int[] a = {2,4,6};
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=2;i<=n;++i){
            for(int j=0;j<3;++j){
                if(i>=a[j]){
                    dp[i] += dp[i-a[j]];
                }
            }
        }
        System.out.println(dp[n]);
    }


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int noT = s.nextInt();
        for(int i=0;i< noT;i++){
            s.nextLine();
            int n = s.nextInt();
            s.nextLine();
            Stack<Integer> st = new Stack();
            for(int j=0;j< n;j++){
                int num = s.nextInt();
                if(!st.isEmpty()){
                    while(!st.isEmpty() && st.peek() < num){
                         System.out.print(num);
                        st.pop();
                    }
                }
                st.push(num);
            }
            while(!st.isEmpty()){
                st.pop();
                System.out.print(-1);
            }
            System.out.println();
        }
    }

}

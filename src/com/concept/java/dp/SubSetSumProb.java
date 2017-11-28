package com.concept.java.dp;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/31/17
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubSetSumProb {
    
    public static boolean isSubSetSum(int input[], int sum){
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        for(int i=0;i< input.length;i++){
            if(input[i]==sum)
                return true;
            if(input[i] <sum){
                s2.push(input[i]);
                while (!s1.isEmpty()){
                    int top = s1.pop();
                    if(top+input[i] ==sum)
                        return true;
                    if(top+input[i]<sum){
                        s2.push(top+input[i]);
                        s2.push(top);
                    }
                }
                while(!s2.isEmpty())
                    s1.push(s2.pop());
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        int input[] = {4,1,10,12,5,2};
        System.out.println(isSubSetSum(input, 9));
        int input1[] = {1,8,2,5};
        System.out.println(isSubSetSum(input1, 4));
        int input2[] = {1,2,5};
        System.out.println(isSubSetSum(input2, 7));
        int input3[] = {1,2,5};
        System.out.println(isSubSetSum(input3, 8));
    }
    
}

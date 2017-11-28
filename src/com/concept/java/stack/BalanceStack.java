package com.concept.java.stack;


import java.util.Scanner;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/18/17
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class BalanceStack {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        }
        int sum[] = new int[3];
        Stack<Integer> s[] = new Stack[3];
        for(int i=0;i< 3;i++){
            s[i] = new Stack<Integer>();
        }
        for(int i=h1.length-1; i>=0;i--){
            s[0].push(h1[i]);
            sum[0] = sum[0]+h1[i];
        }
        for(int i=h2.length-1; i>=0;i--){
            s[1].push(h2[i]);
            sum[1] = sum[1]+h2[i];
        }
        for(int i=h3.length-1; i>=0;i--){
            s[2].push(h3[i]);
            sum[2] = sum[2]+h3[i];
        }
        while(!isBalance(sum)){
            int maxSumIndex = getMaxIndex(sum);
            int top = s[maxSumIndex].pop();
            sum[maxSumIndex] = sum[maxSumIndex]-top;
        }
        System.out.println(sum[0]);
    }

    public static boolean isBalance(int data[]){
        for(int i=1; i< data.length;i++){
            if(data[i-1] != data[i])
                return false;
        }
        return true;
    }

    public static int getMaxIndex(int data[]){
        int maxSumIndex = 0;
        for(int i=0;i< data.length;i++){
            if( data[i] > data[maxSumIndex]){
                maxSumIndex = i;
            }
        }
        return maxSumIndex;
    }

}

package com.concept.java.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/18/17
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameOfTwoStack {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            Stack<Integer> s1 = new Stack<Integer>();
            Stack<Integer> s2 = new Stack<Integer>();
            for(int i= a.length-1;i>=0;i--)
                s1.push(a[i]);
            for(int i= b.length-1;i>=0;i--)
                s2.push(b[i]);
            int count = 0;
            int sum= 0;
            while(sum < x && (!s1.isEmpty() || !s2.isEmpty())){
                boolean isAdded = false;
                int top1 = -1;
                if(!s1.isEmpty())
                    top1 = s1.peek();
                int top2 = -1;
                if(!s2.isEmpty())
                    top2 = s2.peek();
                if(top1 != -1 && top1 <= top2){
                    if((sum+top1) < x){
                        s1.pop();
                        count = count+1;
                        sum = sum + top1;
                        isAdded = true;
                    }
                }
                if(top2 != -1 && top2 < top1){
                    if((sum+top2) < x){
                        s2.pop();
                        count = count+1;
                        sum = sum + top2;
                        isAdded = true;
                    }
                }
                if(!isAdded)
                    break;
            }
            System.out.println(count);
        }
    }

}

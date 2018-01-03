package com.oracle;

import java.util.Stack;

public class Queue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public Queue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public int pop()throws Exception{
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res =-1;
        if(!s2.isEmpty()){
             res=s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }else{
            throw new Exception("");
        }
        return res;
    }

    public void push(int val){

        s1.push(val);
    }
}

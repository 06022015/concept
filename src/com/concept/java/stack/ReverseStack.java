package com.concept.java.stack;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/29/17
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Reverse a stack using recursion
* */
public class ReverseStack {

     public static void reverse(Stack<Integer>  stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            reverse(stack);
            pushToBottom(stack, temp);
        }
     }

    public static void pushToBottom(Stack<Integer> stack, int value){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            pushToBottom(stack, value);
            stack.push(temp);
        }else{
            stack.push(value);
        }
    }
    
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        reverse(stack);
        while(!stack.isEmpty())
            System.out.println(stack.pop());
    }

}

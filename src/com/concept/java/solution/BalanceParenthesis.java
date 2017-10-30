package com.concept.java.solution;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/11/17
 * Time: 11:54 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
* For example, the program should print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”
* */
public class BalanceParenthesis {
    
    public static boolean isBalanceParenthesis(String text){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i< text.length();i++){
            if(text.charAt(i) == '(' || text.charAt(i)=='{' || text.charAt(i)=='[')
                stack.push(text.charAt(i));
            if(text.charAt(i) == ')' || text.charAt(i)=='}' || text.charAt(i)==']'){
                if(stack.pop() != text.charAt(i))
                    return false;
            }
        }
        return stack.isEmpty();
    } 
    
    public static void main(String args[]){
        String text = "Ashif([Qureshi)]";
        System.out.println(isBalanceParenthesis(text));
    }
    
}

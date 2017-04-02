package com.concept.java.stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {


    public static void main(String args[]) {
        Stack<Integer> stack = new StackCustom<Integer>();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Size:- "+ stack.size());
        System.out.println("Stack Pop:- "+ stack.pop());
        System.out.println("Size:- "+ stack.size());
        stack.push(70);
        System.out.println("Size:- "+ stack.size());
        System.out.println("Stack Pop:- "+ stack.pop());
        System.out.println("Size:- "+ stack.size());
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);
        stack.push(120);
        stack.push(130);
        stack.push(140);
        stack.push(150);
        System.out.println("Size:- "+ stack.size());
        stack.display();

    }
}

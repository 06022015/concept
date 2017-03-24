package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/24/17
 * Time: 11:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Base {


    public void printArray(int input[]) {
        for (int anInput : input)
            System.out.print(anInput + "  ");
        System.out.println();
    }


    static class Node{
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }
}

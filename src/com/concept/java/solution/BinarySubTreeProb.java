package com.concept.java.solution;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/13/17
 * Time: 6:01 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* binary tree is sub tree of another binary tree
*
*
* */
public class BinarySubTreeProb extends Base {
    
    
    private boolean isIdentical(Node main, Node sub){
        if(null == main && null == sub)
            return true;
        if(null == main || null == sub)
            return false;
        return (main.value == sub.value) && (isIdentical(main.left, sub.left) || isIdentical(main.right, sub.right));
    }

    /*
    * Time complexity O(mn)
    * M is length of Main tree and N is length of sub tree
    * */
    public boolean isSubTree(Node main, Node sub){
        if(null == sub)
            return true;
        if(null == main)
            return false;
        return isIdentical(main, sub) || isSubTree(main.left, sub) || isIdentical(main.right, sub);
    }
    
    public static void main(String args[]){
        BinarySubTreeProb binarySubTreeProb = new BinarySubTreeProb();
        Node main = new Node(1);
        main.left = new Node(2);
        main.right = new Node(3);
        main.left.left = new Node(4);
        main.left.right = new Node(5);
        main.right.left = new Node(6);
        main.right.right = new Node(7);
        main.left.left.left = new Node(8);
        main.left.left.right = new Node(9);
        main.left.left.left.left = new Node(10);
        main.left.left.left.right = new Node(11);
        
        Node sub = new Node(8);
        sub.left = new Node(10);
        sub.right = new Node(11);
        //sub.left.left = new Node(10);
        //sub.left.right = new Node(11);
        System.out.print("Is Sub Tree:-" + binarySubTreeProb.isSubTree(main, sub));
    }
}

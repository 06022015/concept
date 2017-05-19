package com.concept.java.solution;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/4/17
 * Time: 11:06 PM
 * To change this template use File | Settings | File Templates.
 */
 /*
 * Invert Binary Tree
 *
 * http://www.programcreek.com/2014/06/leetcode-invert-binary-tree-java/
 * */

public class InvertBinaryTree extends Base {
    
    
    //Recursive
    public void invert(Node root) {
        if(null==root)
            return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }

    public static void main(String args[]){
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        invertBinaryTree.invert(root);
    }
    
}

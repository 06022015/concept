package com.concept.java.tree;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/20/17
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* A program to check if a binary tree is BST or not
*
* http://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
*
* Time Complexity O(n)
* 
* */
public class IsBST extends Base {
    
    private Node prev = null;
    
    public boolean isBST(Node root){
        if(null == root)
            return true;
        if(!isBST(root.left))
            return false;
        if(null != prev && root.value <= this.prev.value)
            return false;
        this.prev = root;
        return isBST(root.right);
    }
    
    public static void main(String args[]){
        IsBST isBST = new IsBST();
        Node root = isBST.getBinaryTree();
        Node binaryTree = new Node(4);
        binaryTree.left = new Node(2);
        binaryTree.right = new Node(5);
        binaryTree.left.left = new Node(1);
        binaryTree.left.right = new Node(3);
        System.out.println(isBST.isBST(binaryTree));

        Node binaryTree1 = new Node(3);
        binaryTree1.left = new Node(2);
        binaryTree1.right = new Node(5);
        binaryTree1.left.left = new Node(1);
        binaryTree1.left.right = new Node(4);
        System.out.println(isBST.isBST(binaryTree1));
    }
    
}

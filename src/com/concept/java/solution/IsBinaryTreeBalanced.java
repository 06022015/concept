package com.concept.java.solution;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/20/17
 * Time: 8:24 AM
 * To change this template use File | Settings | File Templates.
 */
/*
* How to determine if a binary tree is height-balanced?
* */
public class IsBinaryTreeBalanced extends Base {


    /*
   * Time Complexity O(n)
   * Space Complexity O(n)
   * */
    private int checkBalanced(Node root){
        if(null == root)
            return 0;
        int leftSubTree = checkBalanced(root.left);
        if(leftSubTree == -1)
            return -1;
        int rightSubTree = checkBalanced(root.right);
        if(rightSubTree == -1)
            return -1;
        if(Math.abs(leftSubTree - rightSubTree)>1)
            return -1;
        return Math.max(leftSubTree,rightSubTree)+1;
    }

    /*
    * Time Complexity O(n)
    * Space Complexity O(n)
    * */
    public boolean isBalanced(Node root){
         if(null == root)
             return true;
        return !(checkBalanced(root)==-1);
    }
    
    public static void main(String args[]){
        IsBinaryTreeBalanced isBalanced = new IsBinaryTreeBalanced();
        Node root = isBalanced.getBinaryTree();
        System.out.println("Balanced:- "+ isBalanced.isBalanced(root));
    }
}

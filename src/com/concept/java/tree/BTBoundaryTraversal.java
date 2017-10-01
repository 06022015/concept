package com.concept.java.tree;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 9/25/17
 * Time: 10:47 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* Boundary Traversal of binary tree
* Given a binary tree, print boundary nodes of the binary tree Anti-Clockwise starting from the root.
 * For example, boundary traversal of the following tree is “20 8 4 10 14 25 22”
*
* */
public class BTBoundaryTraversal extends Base {
    
    public void printBoundary(Node root){
         if(null != root){
             print(root);
             printLeftBoundary(root.left);
             printLeafs(root.left);
             printLeafs(root.right);
             printRightBoundary(root.right);
         }
    }

    private void printLeafs(Node node){
        if(null == node)
            return;
        printLeafs(node.left);
        if( null == node.right)
            print(node);
        printLeafs(node.right);
    }
    
    private void printLeftBoundary(Node left){
       if(null == left || null == left.left)
           return;
        print(left);
        printLeftBoundary(left.left);
    }

    private void printRightBoundary(Node right){
        if(null == right || null == right.right)
            return;
        printRightBoundary(right.right);
        print(right);
    }

    private void print(Node node){
        System.out.print(node.value +" ");
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.right.left.right = new Node(10);
        root.right.right.right = new Node(11);

        Node root1 = new Node(20);
        root1.left = new Node(8);
        root1.left.left = new Node(4);
        root1.left.right = new Node(12);
        root1.left.right.left = new Node(10);
        root1.left.right.right = new Node(14);
        root1.right = new Node(22);
        root1.right.right = new Node(25);

        BTBoundaryTraversal bt = new BTBoundaryTraversal();
        bt.printBoundary(root);
    }
}

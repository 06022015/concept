package com.concept.java.tree;

import com.concept.java.Base;


public class BSTMaxSum extends Base {


    static  class Sum{
        int sum = 0;
    }

    public  Node calBSTNodeSum(Node root, Sum sum){
        if(null == root)
            return null;
        calBSTNodeSum(root.right, sum);
        sum.sum = sum.sum+root.value;
        root.value = sum.sum;
        calBSTNodeSum(root.left, sum);
        return root;

    }

    public static void main(String args[]){
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(20);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        BSTMaxSum bstMaxSum = new BSTMaxSum();
        bstMaxSum.printInOrder(bstMaxSum.calBSTNodeSum(root, new Sum()));

    }

}

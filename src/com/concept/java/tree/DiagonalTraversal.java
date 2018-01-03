package com.concept.java.tree;

import com.concept.java.Base;

import java.util.*;

public class DiagonalTraversal extends Base{

    public static void diagonalUtil(Node root, int d , Map<Integer, List<Integer>> entry){
        if(null == root)
            return;
        List<Integer> entries = entry.get(d);
        if(null == entries)
            entries = new ArrayList<Integer>();
        entries.add(root.value);
        entry.put(d,entries);
        diagonalUtil(root.left,d+1,entry);
        diagonalUtil(root.right,d,entry);
    }

    public static void diagonal(Node root){
        Map<Integer,List<Integer>> entry = new HashMap<Integer, List<Integer>>();
        diagonalUtil(root,0,entry);
        for(Integer key : entry.keySet()){
            System.out.println(entry.get(key).toString());
        }
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.right.left = new Node(5);
        root.left.right = new Node(6);
        root.left.left = new Node(7);
        root.left.left.left = new Node(8);
        diagonal(root);
    }

}

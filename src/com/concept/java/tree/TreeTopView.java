package com.concept.java.tree;

import com.concept.java.Base;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 9/28/17
 * Time: 8:40 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Print Nodes in Top View of Binary Tree
* */
public class TreeTopView extends Base {
    
    public static void printTopView(Node root, int hd){
        if(null == root)
            return;
        Set<Integer> hdSet = new HashSet<Integer>();
        Queue<QueueItem> queue = new LinkedList<QueueItem>();
        queue.add(new QueueItem(hd, root));
        while(!queue.isEmpty()){
            QueueItem item = queue.remove();
            if(!hdSet.contains(item.hd)){
                hdSet.add(item.hd);
                System.out.print(item.node.value+"\t");
            }
            if(null != item.node.left)
                queue.add(new QueueItem(item.hd-1, item.node.left));
            if(null != item.node.right)
                queue.add(new QueueItem(item.hd+1, item.node.right));
        }
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        printTopView(root, 0);
        System.out.println();
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.right = new Node(4);
        root2.left.right.right = new Node(5);
        root2.left.right.right.right = new Node(6);
        printTopView(root2, 0);
    }



   static class QueueItem {
        int hd;
        Node node;

        QueueItem(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }

    
}

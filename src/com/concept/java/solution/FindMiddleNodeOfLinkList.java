package com.concept.java.solution;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 8:37 PM
 * To change this template use File | Settings | File Templates.
 */


/*
* Find Middle node of given Link list
*
* */

public class FindMiddleNodeOfLinkList extends Base {

    public Node findMiddleNode(Node root){
        Node p1 = root;
        Node p2 = root;
        while(p2!=null && p2.right!=null){
            p2 = p2.right;
            if(p2.right!=null){
                p1 = p1.right;
                p2 = p2.right;
            }
        }
        return p1;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(3);
        root.right.right.right = new Node(4);
        root.right.right.right.right = new Node(5);
        root.right.right.right.right.right = new Node(6);
        root.right.right.right.right.right.right = new Node(7);
        root.right.right.right.right.right.right.right = new Node(8);
        root.right.right.right.right.right.right.right.right = new Node(9);
        FindMiddleNodeOfLinkList findMiddleNode1 = new FindMiddleNodeOfLinkList();
        Node middleNode = findMiddleNode1.findMiddleNode(root);
        System.out.println("Middle Node:- " + middleNode.value);
    }

}

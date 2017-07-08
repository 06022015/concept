package com.concept.java.tree;

import com.concept.java.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/4/17
 * Time: 10:12 PM
 * To change this template use File | Settings | File Templates.
 */
/*
*
* Write a program to get all list of nodes without siblings in Binary tree
*
* */

public class NodeWithoutSibling extends Base {
    
    private List<Node> noSiblingNodes = new ArrayList<Node>();

    public List<Node> get(){
        return this.noSiblingNodes;
    }
    

    /* O(n) time complexity.
    * */
    public void noSiblingNodes(Node root){
        if(null == root || (null == root.left && null == root.right))
            return;
        if(null == root.left || null == root.right){
            Node result =  null == root.left? root.right: root.left;
            noSiblingNodes.add(result);
        }
        noSiblingNodes(root.left);
        noSiblingNodes(root.right);
    }
    
    public static void main(String args[]){
        NodeWithoutSibling nodeWithoutSibling = new NodeWithoutSibling();
        /*Node root = nodeWithoutSibling.getBinaryTree();
        nodeWithoutSibling.printList(root);
        nodeWithoutSibling.noSiblingNodes(root);
        List<Node> results = nodeWithoutSibling.get();
        System.out.println(results.toString());*/

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.left.right = new Node(6);
        nodeWithoutSibling.noSiblingNodes(root);
        List<Node> results = nodeWithoutSibling.get();
        System.out.println(results.toString());
    }
    
}

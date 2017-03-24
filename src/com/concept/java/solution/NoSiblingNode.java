package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/24/17
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
/**
 * Write a program to get all list of nodes without siblings in Binary tree
 *
 *
 * */

public class NoSiblingNode {


    public void getSingleNode(Node node, Integer singleNodes[]){
        if(null==node)
            return;
        if(null!= node.left && null != node.right){
            getSingleNode(node.right, singleNodes);
            getSingleNode(node.left, singleNodes);
        }else if(null!= node.left){
            //singleNodes[] = node.left.value;
            System.out.print(node.left.value+",");
            getSingleNode(node.left, singleNodes);
        }else if(null != node.right){
            //singleNodes[] = node.right.value;
            System.out.print(node.right.value+",");
            getSingleNode(node.right, singleNodes);
        }
    }

    public static void main(String args[]){
        NoSiblingNode noSiblingNode = new NoSiblingNode();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.left.right = new Node(6);
        noSiblingNode.getSingleNode(root, null);
    }
    
    
    static class Node{
        public int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }
}

package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/25/17
 * Time: 12:43 AM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Print all nodes at distance k from a given node
 * Given a binary tree, a target node in the binary tree, and an integer value k, print all the nodes that are at distance k from the given target node. No parent pointers are available.
 *
 *  Ref Link http://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
 *
 * */

public class NodeAtDistanceK extends Base{

    public void printDistanceNodeDown(Node node, int distance){
        if(node==null || distance < 0)
            return;
        if(distance==0){
            System.out.println(node.value);
        }
        printDistanceNodeDown(node.left, distance-1);
        printDistanceNodeDown(node.right, distance-1);
    }

    public int printDistanceNode(Node root, Node target, int distance){
        if(null==root)
            return -1;
        if(root.value==target.value){
            printDistanceNodeDown(root, distance);
            return 0;
        }
        int leftDistance = printDistanceNode(root.left, target, distance);
        if(leftDistance!=-1){
            if(leftDistance+1 == distance){
                System.out.println(root.value);
            }else{
                printDistanceNodeDown(root.right, distance - 2 - leftDistance);
            }
            return leftDistance+1;
        }
        int rightDistance = printDistanceNode(root.right, target, distance);
        if(rightDistance!=-1){
            if(rightDistance+1 == distance){
                System.out.println(root.value);
            }else{
                printDistanceNodeDown(root.left, distance-2-rightDistance);
            }
            return rightDistance+1;
        }
        return -1;
    }

    public static void main(String args[]){
        Node root =  new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        Node target = root.left;
        FindNodeAtDistanceK findNodeAtDistanceK = new FindNodeAtDistanceK();
        findNodeAtDistanceK.printDistanceNode(root, target, 2);
    }
}
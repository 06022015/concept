package com.concept.java.tree;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/19/17
 * Time: 8:39 AM
 * To change this template use File | Settings | File Templates.
 */
/*
*  Find Nodes which are at “K” distance from given node.
*  Print all nodes at distance k from a given node.
*
*
* Given a binary tree, a target node in the binary tree, and an integer value k, print all the nodes that are at distance k from the given target node. No parent pointers are available.
*
* Consider the tree shown in diagram

Input: target = pointer to node with data 8.
       root = pointer to node with data 20.
       k = 2.
Output : 10 14 22

If target is 14 and k is 3, then output
should be "4 20"
*
* Ref link: http://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
*
* Time complexity O(n)
* */

public class FindNodeAtKDistance extends Base {

    private Node findNode(Node root, int targetNode) {
        if (null == root || root.value == targetNode)
            return root;
        Node result = findNode(root.left, targetNode);
        if (null == result)
            result = findNode(root.right, targetNode);
        return result;
    }

    private void findNodeAtDistanceK(Node node, int targetDistance) {
        if (null == node)
            return;
        if (targetDistance == 0) {
            System.out.println(node.value);
            return;
        }
        findNodeAtDistanceK(node.left, targetDistance - 1);
        findNodeAtDistanceK(node.right, targetDistance - 1);
    }

    public void findNodeAtDistanceKFromGivenNode(Node root, int node, int distance) {
        Node targetNode = findNode(root, node);
        findNodeAtDistanceK(targetNode, distance);
    }

    public static void main(String args[]) {
        FindNodeAtKDistance findNodeAtKDistance = new FindNodeAtKDistance();
        Node root = findNodeAtKDistance.getBinaryTree();
        findNodeAtKDistance.findNodeAtDistanceKFromGivenNode(root, 2, 2);
    }

}

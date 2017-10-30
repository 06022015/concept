package com.concept.java.tree;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/30/17
 * Time: 8:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdditionOfNode  extends Base {
    
    
    
    public static Node addNodeFromRightToLeft(Node node){
        if(null == node)
            return null;
        Node right = addNodeFromRightToLeft(node.right);
        if(null != right){
            node.value = node.value+right.value;
        }
        Node left = addNodeFromRightToLeft(node.left);
        if(null != left)
            left.value = left.value+node.value;
        return node;
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);
        AdditionOfNode additionOfNode = new AdditionOfNode();
        additionOfNode.printList(root);
        Node result = addNodeFromRightToLeft(root);
        additionOfNode.printList(result);
    }
}

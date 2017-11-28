package com.concept.java.tree;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 11/2/17
 * Time: 9:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class FurtherMostNode extends Base {
    
    
    private int furtherMostNodeLevel;
    private Node furtherMostNode;
    
    public void findFurtherMostNode(Node root, int level){
        if(null == root)
            return;
        if(null == root.left && null == root.right){
            if(level > furtherMostNodeLevel){
                furtherMostNodeLevel = level;
                furtherMostNode = root;
            }
        }
        findFurtherMostNode(root.left,level+1);
        findFurtherMostNode(root.right,level+1);
    }
    
    public static void main(String args[]){
        FurtherMostNode furtherMostNode = new FurtherMostNode();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        furtherMostNode.findFurtherMostNode(root,0);
        System.out.println(furtherMostNode.furtherMostNode);
    }
}

package com.concept.java.tree;

import com.concept.java.Base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/5/17
 * Time: 11:09 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* Get all nodes K distance away from leaf nodes.
* */
public class DistanceKFromLeaf extends Base {
    
    private Map<Integer, List<Integer>> pathElements = new HashMap<Integer, List<Integer>>();


    /*
    * O(n) time complexity
    * */
    private void distanceKFromLeafNode(Node node, Node track,int path, int k, boolean isRight){
        if(null == node){
            if(path > k)
                System.out.println(track.value);
            return;
        }
        Node prev = track;
        if(path > k){
            if(!isRight)
                track = track.left;
            else{
                track = track.right;
                isRight = false;
            }
        }
        distanceKFromLeafNode(node.left,track, path+1, k, isRight);
        if(node.value == prev.value){
            isRight = true;
        }
        distanceKFromLeafNode(node.right,track, path+1, k, isRight);

    }
    
    public void distanceKFromLeafNode(Node node, Integer distance){
        distanceKFromLeafNode(node, node, 0,distance, false);
    }
    
    public static void main(String args[]){
        DistanceKFromLeaf distanceKFromLeaf = new DistanceKFromLeaf();
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        node.right.left.right = new Node(6);
        distanceKFromLeaf.distanceKFromLeafNode(node,1);
    }
    
}

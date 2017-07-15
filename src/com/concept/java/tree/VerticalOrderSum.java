package com.concept.java.tree;

import com.concept.java.Base;

import java.util.TreeMap;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/5/17
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Print the Vertical Sum in binary Tree
* http://algorithms.tutorialhorizon.com/print-the-vertical-sum-in-binary-tree/
*
* */


public class VerticalOrderSum extends Base {

    public TreeMap<Integer, Integer> sum  =new TreeMap<Integer,Integer>();
    
    public Node verticalSum(Node root, int lvl){
        if(null==root)
            return null;
        Node left = verticalSum(root.left, --lvl);
        if(null==left)
            ++lvl;
        if(this.sum.containsKey(lvl))
            this.sum.put(lvl, sum.get(lvl)+root.value);
        else
            this.sum.put(lvl, root.value);
        return verticalSum(root.right, ++lvl);
    }


    public void printResult(){
        for(Integer key : this.sum.keySet()){
            System.out.println("Level:- "+key+" Sum:- "+this.sum.get(key));
        }
    }

    public static void main(String args[]){
        VerticalOrderSum verticalOrderSum = new VerticalOrderSum();
        Node root = verticalOrderSum.getBinaryTree();
        verticalOrderSum.printPreOrder(root);
        System.out.println();
        verticalOrderSum.verticalSum(root, 0);
        verticalOrderSum.printResult();
    }
}

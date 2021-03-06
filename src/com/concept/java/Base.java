package com.concept.java;

import com.concept.java.sorting.TestSorting;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/24/17
 * Time: 11:46 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Base {

   public int a =8;

    public void printVal() {
        System.out.print("Super");
    }

    public void printArray(int input[]) {
        for (int anInput : input)
            System.out.print(anInput + "  ");
        System.out.println();
    }

    public void printArray(int input[][]) {
        for(int row[] : input){
            for(int col : row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }
    }

    protected void printTree(Node root){
        if(null == root)
            return;
        System.out.print(root.value);
        printTree(root.left);
        printTree(root.right);
    }
    
    protected void printPreOrder(Node root){
        if(null==root)
            return;
        System.out.print(root.value+"\t");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    protected void printInOrder(Node root){
        if(null==root)
            return;
        printInOrder(root.left);
        System.out.print(root.value+"\t");
        printInOrder(root.right);
    }

    protected void printPostOrder(Node root){
        if(null==root)
            return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.value+"\t");
    }

    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node next;
        public Node prev;

        public Node(int value) {
            this.value = value;
            this.left = this.right = null;
            this.next = this.prev = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    public static class CharNode{
        public char value;
        public CharNode next;
        public CharNode prev;

        public CharNode(char value) {
            this.value = value;
            this.next = this.prev = null;
        }
    }
    
    protected Node getBinaryTree(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        return root;
    }

    public void printList(Node node){
        while(node!=null){
            System.out.print(node.value+"==>");
            node = node.next;
        }
        System.out.println();
    }

    protected void swap(int input[], int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
    


}

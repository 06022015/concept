package com.concept.java.linklist;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/16/16
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */


/*
* Reverse a Linked List in groups of given size
*    Given a linked list, write a function to reverse every k nodes (where k is an input to the function). 
* */


public class ReverseLinkList {


    /*
    * O(k)
    * */
    public Node reverseRef(Node root, int k){
        if(null == root)
            return root;
        Node current = root;
        Node next = null;
        Node prev = null;
        Node head = null;
        int index = 0;
        while(null != current && index< k){
            next = current.next;
            current.next = prev;
            if(null == head)
                head = current;
            prev = current;
            current = next;
            index ++;
        }
        if(null != head)
           head.next = current;
        return prev;
    }
    
    public Node reverse(Node node, int size) {

        /*Node reverse = null;
        Node head = node;
        int k = 0;
        while (k < size) {
            Node temp = new Node(node.value);
            temp.next = reverse;
            reverse = temp;
            node = node.next;
            k++;
        }
        while(null != reverse){
            Node temp =head;
            head = head.next;
            temp.next = node;
            node = temp;
            reverse = reverse.next;
        }
        
        return  node;*/
        
        Node head = null;
        Node temp = null;
        Node prev = null;
        int index = 0;
        while(index<size && null!=node){
            temp = new Node(node.value);
            if(null == head)
                head = temp;
            else
                temp.next = prev;
            prev = temp;
            node = node.next;
            index++;
        }
        if(null != head)
            head.next = node;
        else
            prev = node;
        return prev;
    }

    public void printList(Node node){
        while(node!=null){
            System.out.print(node.value+"==>");
            node = node.next;
        }
        System.out.println();
    }

    public Node reverseLinkList(Node head) {
        Node result = null;
        while(null != head){
            Node temp = head;
            head = head.next;
            temp.next = result;
            result = temp;
        }
        return result;
    }
    
    public static void main(String args[]){
        Node node = new Node(8);
        for(int i=7;i>=1;i--){
           Node temp = new Node(i);
            temp.next = node;
            node = temp;
        }
        ReverseLinkList r = new ReverseLinkList();
        System.out.println("Input:- ");
        r.printList(node);
        Node reverse = r.reverseRef(node, 3);
        System.out.println("Output:- ");
        r.printList(reverse);
        System.out.println("Reverse Output:- ");
        r.printList(r.reverseLinkList(node));
    }


     static class Node {
        public Integer value;
        public Node next;
        public Node prev;

        private Node(Integer value) {
            this.value = value;
        }
    }
}

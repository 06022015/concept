package com.concept.java.linklist;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/13/17
 * Time: 12:11 AM
 * To change this template use File | Settings | File Templates.
 */

/*
* Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
* */

public class IsLinkListCyclick {

    boolean hasCycle(Node head) {
        Node n1 = head;
        Node n2 = head;
        while(n2 != null && n2.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
            if(n1 == n2)
                return true;
        }
        return false;
    }
    
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = root.next;
        IsLinkListCyclick isLinkListCyclick = new IsLinkListCyclick();
        System.out.println(isLinkListCyclick.hasCycle(root));
        System.out.println(isLinkListCyclick.hasCycle(null));
    }

    static class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }
    }

    
}

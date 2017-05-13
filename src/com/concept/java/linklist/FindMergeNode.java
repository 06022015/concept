package com.concept.java.linklist;


/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/12/17
 * Time: 11:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindMergeNode  {
    
    public int findMergeNode(Node headA, Node headB){
        Node a = headA;
        Node b = headB;
        while(a != b){
            if(a.next == null)
                a = headB;
            else
                a = a.next;
            if(b.next == null)
                b = headA;
            else
                b = b.next;
        }

        return a.value;
    }
    
    public static void main(String args[]){
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        /*headA.next.next.next = new Node(4);
        headA.next.next.next.next = new Node(5);
        headA.next.next.next.next.next = new Node(6);*/

        Node headB = new Node(1);
        headB.next = headA.next.next;
        //headB.next.next = new Node(3);
        /*headB.next.next.next = new Node(4);
        headB.next.next.next.next = new Node(5);
        headB.next.next.next.next.next = new Node(6);*/
        FindMergeNode findMergeNode = new FindMergeNode();
        System.out.println("Merge node:- "+ findMergeNode.findMergeNode(headA,headB));
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

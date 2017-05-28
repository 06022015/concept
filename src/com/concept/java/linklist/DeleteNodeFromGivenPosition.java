package com.concept.java.linklist;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/28/17
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* You’re given the pointer to the head node of a linked list and the position of a node to delete.
* Delete the node at the given position and return the head node.
* A position of 0 indicates head, a position of 1 indicates one node away from the head and so on.
* The list may become empty after you delete the node.
*
* */

public class DeleteNodeFromGivenPosition extends Base {

    public Node delete(Node head, int position){
        if(position == 0)
            return head.next;
        Node result = head;
        int index =0;
        while(index < position && null != head){
            if(position-index==1)
                head.next = head.next.next;
            else
                head = head.next;

            index++;
        }
        return result;
    }
    
    public static void main(String args[]){
        DeleteNodeFromGivenPosition deleteNodeFromGivenPosition = new DeleteNodeFromGivenPosition();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        System.out.println("Original list");
        deleteNodeFromGivenPosition.printList(head);
        head = deleteNodeFromGivenPosition.delete(head, 3);
        System.out.println("List after deleting node");
        deleteNodeFromGivenPosition.printList(head);
    }

}

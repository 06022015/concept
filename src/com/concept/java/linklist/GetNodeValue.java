package com.concept.java.linklist;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/28/17
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
/*
Get Node value from tail.
* You’re given the pointer to the head node of a linked list and a specific position.
* Counting backwards from the tail node of the linked list, get the value of the node at the given position.
* A position of 0 corresponds to the tail, 1 corresponds to the node before the tail and so on.
* */

public class GetNodeValue extends Base {
    
    
    public int get(Node head, int position){
        Node result = head;
        int index = 0;
        while(null != head){
            head = head.next;
            if(index>position)
                result = result.next;
            index++;
        }
        return result.value;
    }
    
    public static  void main(String args[]){
        GetNodeValue getNodeValue = new GetNodeValue();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        getNodeValue.printList(head);
        System.out.println(" Result:= "+ getNodeValue.get(head, 3));
    }
    
}

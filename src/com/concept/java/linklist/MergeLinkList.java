package com.concept.java.linklist;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/28/17
 * Time: 4:34 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* You’re given the pointer to the head nodes of two sorted linked lists.
* The data in both lists will be sorted in ascending order. Change the next pointers to obtain a single, merged linked list which also has data in ascending order.
* Either head pointer given may be null meaning that the corresponding list is empty.
*
* */

public class MergeLinkList extends Base {

    public Node merge(Node headA, Node headB){
        if(null != headA && null != headB && headA.value> headB.value){
            Node temp = headA;
            headA = headB;
            headB = temp;
        }
        if(null == headA)
            return headB;
        if(null == headB)
            return headA;
        Node result = headA;
        Node prev  = null;
        while(null != headA){
            Node nextHead = headA.next;
            while(null != headB && null != nextHead && headB.value < nextHead.value){
                Node tempB = headB;
                headB = headB.next;
                headA.next = tempB;
                headA = headA.next;
            }
            prev = headA;
            headA.next = nextHead;
            headA = headA.next;
        }
        if(null != prev)
            prev.next = headB;
        return result;
    }

    public static void main(String args[]){
        Node headA = new Node(1);
        headA.next = new Node(3);
        headA.next.next = new Node(5);
        headA.next.next.next = new Node(6);

        Node headB  = new Node(2);
        headB.next = new Node(4);
        headB.next.next = new Node(7);

        MergeLinkList merge = new MergeLinkList();
        Node result = merge.merge(headA, headB);
        merge.printList(result);
    }
}

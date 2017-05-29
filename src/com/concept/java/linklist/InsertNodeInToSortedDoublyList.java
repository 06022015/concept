package com.concept.java.linklist;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/28/17
 * Time: 7:55 PM
 * To change this template use File | Settings | File Templates.
 */
/*
    Inserting a Node Into a Sorted Doubly Linked List
*
*   Given a reference to the head of a doubly-linked list and an integer, , create a new Node object having data value  and insert it into a sorted linked list.

* */

public class InsertNodeInToSortedDoublyList extends Base {
    
    public Node insert(Node head, int data){
        Node dataNode = new Node(data);
        if(null == head){
            return dataNode;
        }else if(head.value> data){
            dataNode.next = head;
            return dataNode;
        }
        Node result = head;
        while(null != head){
            if(null != head.next){
                if(head.value< data && data < head.next.value){
                    dataNode.next = head.next;
                    dataNode.prev = head;
                    head.next = dataNode;
                    break;
                }else{
                    head = head.next;
                }
            }else{
                dataNode.prev = head;
                head.next = dataNode;
                break;
            }
        }
        return result;
    }
    
    
    public Node insert2(Node head, int data){
        Node dataNode = new Node(data);
        if(null == head){
            return dataNode;
        }else if(head.value> data){
            dataNode.next = head;
            return dataNode;
        }
        Node result = head;
        while(null != head && head.next.value < data){
            head = head.next;
        }
        dataNode.next = head.next;
        head.next.prev = dataNode;
        dataNode.prev = head;
        head.next = dataNode;
        return result;
    }
    
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(6);
        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        InsertNodeInToSortedDoublyList insert = new InsertNodeInToSortedDoublyList();
        System.out.println("Original List");
        insert.printList(head);
        head = insert.insert2(head, 5);
        System.out.println("Inserted List");
        insert.printList(head);
    }
    
}

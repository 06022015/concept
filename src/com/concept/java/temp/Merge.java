package com.concept.java.temp;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/27/17
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Merge {
    
    
    public Node merge(Node headA, Node headB){
        if(null != headA && null != headB && headA.data> headB.data){
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
            while(null != headB && null != nextHead && headB.data < nextHead.data){
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


    void updateResult(Node result, Node current, Node next){
        if(null == current){
            current = next;
            result = current;
        }else{
            current.next = next;
            current = current.next;
        }
    }

    public Node MergeLists(Node headA, Node headB) {
        Node curr = null;
        Node result = null;
        while (null != headA || null != headB) {
            Node currA = headA;
            Node currB = headB;
            if (null != currA && null != currB) {
                headA = headA.next;
                headB = headB.next;
                if (currA.data <= currB.data) {
                    if (null == curr) {
                        currA.next = currB;
                        curr = currA;
                        result = curr;
                        curr = curr.next;
                    } else {
                        curr.next = currA;
                        curr = curr.next;
                        curr.next = currB;
                        curr = curr.next;
                    }
                } else {
                    if (null == curr) {
                        currB.next = currA;
                        curr = currB;
                        result = curr;
                        curr = curr.next;
                    } else {
                        curr.next = currB;
                        curr = curr.next;
                        curr.next = currA;
                        curr = curr.next;
                    }
                }
            } else if (null != currA) {
                headA = headA.next;
                if (null == curr) {
                    curr = currA;
                    result = curr;
                } else {
                    curr.next = currA;
                    curr = curr.next;
                }
            } else if (null != currB) {
                headB = headB.next;
                if (null == curr) {
                    curr = currB;
                    result = curr;
                } else {
                    curr.next = currB;
                    curr = curr.next;
                }
            } else {
                break;
            }
        }
        return result;
    }


    public void printList(Node node){
        while(node!=null){
            System.out.print(node.data+"==>");
            node = node.next;
        }
        System.out.println();
    }

    
    public static void main(String args[]){
        Node headA = new Node(1);
        headA.next = new Node(3);
        headA.next.next = new Node(5);
        headA.next.next.next = new Node(6);
        
        Node headB  = new Node(2);
        headB.next = new Node(4);
        headB.next.next = new Node(7);

        Merge merge = new Merge();
        Node result = merge.merge(headA, headB);
        merge.printList(result);
    }


    static class Node {
        public Integer data;
        public Node next;
        public Node prev;

        private Node(Integer data) {
            this.data = data;
        }
    }
}

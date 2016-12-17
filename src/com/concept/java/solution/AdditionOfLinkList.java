package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */


/*
*   Add two numbers represented by linked lists | Set 1
*   Given two numbers represented by two lists, write a function that returns sum list. The sum list is list representation of addition of two input numbers.
* */
public class AdditionOfLinkList {

    public Node attr1;
    public Node attr2;

    public void printList(Node node){
        while(null!=node){
            System.out.print(node.value+"==>");
            node = node.next;
        }
        System.out.println();
    }

    public void pushToAttr1(int value){
        this.attr1 = push(this.attr1, value);
    }

    public void pushToAttr2(int value){
        this.attr2 = push(this.attr2, value);
    }
    
    private Node push(Node node, int value){
        Node current  = new Node(value);
        current.next = node;
        node = current;
        return node;
    }
    
    public Node addition(Node attr1, Node attr2){
        Node res=null;
        Node prev = null;
        Node temp = null;
        int carry=0, sum=0;
        while(null!= attr1 || null!= attr2){
            sum = carry+ (null!=attr1?attr1.value:0)+ (null!=attr2?attr2.value:0);
            carry = sum>=10?1:0;
            sum = sum%10;
            temp = new Node(sum);
            if(null == res){
                res = temp;
            } else{
                prev.next = temp;
            }
            prev = temp;
            if(null!=attr1)
                attr1 = attr1.next;
            if(null!= attr2)
                attr2 = attr2.next;
        }
        if(carry>0){
            temp.next = new Node(carry);
        }
        return res;
    }

    
    public static void main(String args[]){
        AdditionOfLinkList additionOfLinkList = new AdditionOfLinkList();
        additionOfLinkList.pushToAttr1(6);
        additionOfLinkList.pushToAttr1(4);
        additionOfLinkList.pushToAttr1(9);
        additionOfLinkList.pushToAttr1(5);
        additionOfLinkList.pushToAttr1(7);

        additionOfLinkList.pushToAttr2(4);
        additionOfLinkList.pushToAttr2(8);

        additionOfLinkList.printList(additionOfLinkList.attr1);
        additionOfLinkList.printList(additionOfLinkList.attr2);
        Node node = additionOfLinkList.addition(additionOfLinkList.attr1,additionOfLinkList.attr2);
        additionOfLinkList.printList(node);

    }

    static class Node{
        public int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
    
}

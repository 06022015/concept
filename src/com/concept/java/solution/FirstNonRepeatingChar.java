package com.concept.java.solution;

import com.concept.java.Base;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/1/17
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Java Program to find first duplicate, non-repeated character in a String. * It demonstrate three simple example to do this programming problem. *
* Read more: http://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz4d4m1nSqb

* */

public class FirstNonRepeatingChar extends Base {
    
    public Character findFirstNonRepeatingChar(String stream){
        Map<Character,Integer> entries = new LinkedHashMap();
        for(char c :  stream.toCharArray()){
            entries.put(c, entries.containsKey(c)?entries.get(c)+1:1);
        }

        for(Map.Entry<Character, Integer> entry : entries.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }


    public Character findFirstNonRepeatingChar2ndMethod(String stream){
        Set<Character> repeating = new HashSet<Character>();
        List<Character> nonRepeating = new ArrayList<Character>();
        for(Character c :  stream.toCharArray()){
              if(repeating.contains(c)){
                  continue;
              }
            if(nonRepeating.contains(c)){
                nonRepeating.remove(c);
                repeating.add(c);
            }else{
                nonRepeating.add(c);
            }
        }
        return nonRepeating.size()>0?nonRepeating.get(0):null;
    }
    

    public Character getNonRepeatingChar(String stream){
        CharNode inDLL[] = new CharNode[256];
         boolean repeat[] = new boolean[256];
        for(int i=0;i< 256;i++){
            repeat[i] = false;
            inDLL[i] = null;
        }
        CharNode head = null;
        CharNode tail = null;
        for(int i=0;i< stream.length();i++){
            char x =  stream.charAt(i);
            System.out.println("Reading:- "+ x);
            if(!repeat[x]){
                if(null == inDLL[x]){
                    CharNode temp = new CharNode(x);
                    if(head ==null){
                        head = temp;
                        tail = temp;
                    }else{
                        tail.next = temp;
                        temp.prev = tail;
                        tail = temp;
                    }
                    inDLL[x] = tail;
                }else{
                    if(null != head){
                        if(head == inDLL[x])
                            head = head.next;
                        if(tail == inDLL[x])
                            tail = tail.prev;
                        if(inDLL[x].next != null)
                            inDLL[x].next.prev = inDLL[x].prev;
                        if(inDLL[x].prev!=null)
                            inDLL[x].prev.next = inDLL[x].next;
                    }
                    repeat[x] = true;
                    inDLL[x] = null;
                }
            }
        }
        return head!=null? head.value:null;

    }
    
    
    public static void main(String args[]){
        String stream = "Ashif Qureshi Ashif";
        //String stream = "aaaaaa";
        FirstNonRepeatingChar firstNonRepeatingChar = new FirstNonRepeatingChar();
        System.out.println("1st Method:- "+ firstNonRepeatingChar.findFirstNonRepeatingChar(stream));
        System.out.println("2nd Method:- "+ firstNonRepeatingChar.findFirstNonRepeatingChar2ndMethod(stream));
        System.out.println("3rd Method:- "+ firstNonRepeatingChar.getNonRepeatingChar(stream));
    }
}

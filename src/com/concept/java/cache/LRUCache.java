package com.concept.java.cache;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/8/16
 * Time: 9:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class LRUCache<K, V> {

    private int capacity = 0;
    private int size = 0;
    private boolean removeEldest;
    private Node<K, V> track;
    private Map<K, Node<K, V>> entry;

    public LRUCache(int capacity, boolean removerEldest) {
        this.capacity = capacity;
        this.removeEldest = removerEldest;
        this.entry = new HashMap<K, Node<K, V>>();
    }

    public void put(K key, V value) {
        Node<K, V> node = new Node<K, V>(key, value);
        if (this.entry.containsKey(key)) {
            remove(node);
        } else {
            if(this.removeEldest)
                removeEldestEntry();
            this.entry.put(key, node);
        }
        setHead(node);
    }

    public V get(K key) {
        V value = null;
        if (this.entry.containsKey(key)) {
            Node<K, V> node = this.entry.get(key);
            remove(node);
            setHead(node);
            value = node.value;
        }
        return value;
    }

    public void remove(K key) {
        if (this.entry.containsKey(key)) {
            Node<K, V> node = this.entry.remove(key);
            remove(node);
        }
    }

    public Node<K,V> getTrack(){
        return this.track;
    }

    public V getRecent() {
        return null!= this.track?this.track.value:null;
    }

    public V getLeast() {
        return null!= this.track?null!= this.track.prev?this.track.prev.value:this.track.value:null;
    }
    
    public void printTrack(){
        Node<K,V> node = this.track.prev;
        while(!node.equals(this.track)){
            System.out.println(this.track.value);
            this.track = this.track.next;
        }
    }

    private void remove(Node<K, V> node) {
        if(this.track==null)
            return;
        else if(this.track == node){
            this.track.prev.next = this.track.next;
            this.track.next.prev = this.track.prev;
            this.track = this.track.next;
            this.size--;
        }else{
            Node<K, V> tempNode = this.track.next;
            while (!tempNode.equals(this.track)) {
                if (tempNode.equals(node)) {
                    tempNode.prev.next = tempNode.next;
                    tempNode.next.prev = tempNode.prev;
                    this.size--;
                    break;
                }
                tempNode = tempNode.next;
            }
            //this.track.next = tempNode.next;
            //this.track.prev = tempNode.prev;
        }
    }

    private void setHead(Node<K, V> node) {
        if (null != this.track) {
            node.next = this.track;
            if(null == this.track.next)
                this.track.next = node;

            if(null == this.track.prev)
                node.prev = this.track;
             else
                node.prev = this.track.prev;
            node.prev.next = node;
            node.next.prev = node;
        }
        this.track = node;
        this.size++;
    }
    
    private void removeEldestEntry(){
         if(this.size>= this.capacity){
             this.track.prev.prev.next = this.track;
             this.track.prev = this.track.prev.prev;
         }
    }
    
    public static void main(String args[]){
        LRUCache<String, Integer> cache = new LRUCache<String, Integer>(10, true);
        for(int i=0;i<1000000;i++)
            cache.put("a"+i,i);
        //cache.printTrack();
        //cache.put("b",2);
        //cache.put("c",3);
        //cache.put("d",4);
        //cache.put("e",5);
        System.out.println("Start:- " + new Date().getTime());
        System.out.println("Recent:- " + cache.getRecent());
        System.out.println("Least:- " + cache.getLeast());
        System.out.println("Reading a890:- " + cache.get("a890"));
        System.out.println("Recent:- "+cache.getRecent());
        System.out.println("Least:- "+cache.getLeast());
        System.out.println("Reading a1:- "+cache.get("a1"));
        System.out.println("Recent:- "+cache.getRecent());
        System.out.println("Least:- "+cache.getLeast());
        System.out.println("Reading a999990:- "+cache.get("a999990"));
        System.out.println("Recent:- "+cache.getRecent());
        System.out.println("Least:- "+cache.getLeast());
        System.out.println("End:- " + new Date().getTime());
    }

    private class Node<K, V> {

        public K key;
        public V value;
        public Node<K, V> next;
        public Node<K, V> prev;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            if (value != null ? !value.equals(node.value) : node.value != null) return false;
            return true;
        }

        @Override
        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }
    }
}

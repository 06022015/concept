package com.concept.java.cache;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/14/16
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class LRUCacheWithList<K, V> {

    private int capacity = 0;
    private boolean removeEldest;
    private List<Node<K,V>> track;
    private Map<K, Node<K, V>> entry;
    
    public LRUCacheWithList(int capacity, boolean removerEldest) {
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
    
    public List<Node<K,V>> getTrack(){
        List<Node<K,V>> trck  = this.track;
        Collections.reverse(trck);
        return trck;
    }

    public V getRecent() {
        return null!= this.track && !this.track.isEmpty()?this.track.get(this.track.size()-1).value:null;
    }

    public V getLeast() {
        return null!= this.track && !this.track.isEmpty()?this.track.get(0).value:null;
    }

    private void remove(Node<K, V> node) {
        if(null!=track && this.track.contains(node)){
            this.track.remove(node);
        }
    }

    private void setHead(Node<K, V> node) {
        if(null==this.track)
            this.track = new ArrayList<Node<K, V>>();
        this.track.add(node);
    }


    public static void main(String args[]){
        LRUCacheWithList<String, Integer> cache = new LRUCacheWithList<String, Integer>(10, true);
        for(int i=0;i<1000000;i++)
            cache.put("a"+i,i);
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
        System.out.println("End:- " + new Date().getTime());
    }

    private void removeEldestEntry(){
        if(this.entry.size()>= this.capacity){
            Node<K,V> node = this.track.get(0);
            this.track.remove(0);
            //this.entry.remove(node.key);
        }
    }

    private class Node<K, V> {

        public K key;
        public V value;

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

package com.concept.java.custom;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/9/17
 * Time: 6:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomDataStructure<K,V> {
    
    private Map<K,Integer> map;
    private List<V>  values;

    public  CustomDataStructure(){
        this.map = new HashMap<K, Integer>();
        this.values = new ArrayList<V>();
    }

    public void add(K key, V value){
        int index =0;
        if(this.map.containsKey(key)){
            index = this.map.get(key);
            this.values.add(index, value);
        }else{
            index = this.values.size();
            this.values.add(value);
            this.map.put(key, index);
        }
    }
    
    public void remove(K key){
        if(this.map.containsKey(key)){
            int index  = this.map.get(key);
            Collections.swap(this.values, index, this.values.size()-1);
            this.values.remove(index);
            this.values.add(index, this.values.get(this.values.size()-1));
            this.values.remove(this.values.get(this.values.size()-1));
            this.map.remove(key);
        }
    }

    public V search(K key){
        V value = null;
        if(this.map.containsKey(key)){
            value = this.values.get(this.map.get(key));
        }
        return value;
    }
    
    public V getRandom(){
        Random random = new Random();
        int randomIndex = random.nextInt(this.values.size());
        return this.values.get(randomIndex);
    }
}

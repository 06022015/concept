package com.concept.java.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 10:34 AM
 * To change this template use File | Settings | File Templates.
 */
/*
* Optimized phone directory using trie node.
* Fast Lookup and Optimized memory space used.
* */
public class PhoneDirectory {

    private Node directory;
    
    public PhoneDirectory(){
        this.directory = new Node((char)0);
    }
    
    public void insert(String number, String owner){
        if(null == number || "".equals(number) || null == owner || "".equals(owner))
               return;
        insert(number, owner, 0, this.directory);
    }
    
    private void insert(String number, String owner, int index, Node directory){
        if(directory.getChildren().containsKey(number.charAt(index))){
            directory = directory.getChildren().get(number.charAt(index));
        }else{
            Node node = new Node(number.charAt(index));
            directory.getChildren().put(number.charAt(index), node);
            directory = directory.getChildren().get(number.charAt(index));
        }
        if(index == number.length()-1){
            directory.setEndOfNumber(true);
            directory.setOwnerName(owner);
        }else{
            insert(number,owner, index+1, directory);
        }
    }
    
    public String getOwner(String number) throws Exception {
        return getOwner(number, 0, this.directory);
    }

    private String getOwner(String number, int index, Node directory) throws Exception {
         if(directory.getChildren().containsKey(number.charAt(index))){
             directory = directory.getChildren().get(number.charAt(index));
             if(index == number.length()-1){
                 if(directory.isEndOfNumber())
                     return directory.getOwnerName();
                 else
                     throw new Exception("No record found");
             }else
                 return getOwner(number, index+1, directory);
         }else
             throw new Exception("No record found");
    }
    
    public Map<String, String> search(String number){
        Map<String,String> numberOwner = new HashMap<String, String>();
        Node dir = this.directory;
        int index =0;
        while(index < number.length() && null != dir){
                dir = dir.getChildren().get(number.charAt(index));
                index++;
        }
        if(null != dir)
            search(number, numberOwner, dir);
        return numberOwner;
    }

    private void search(String numberBuilder, Map<String, String> ownerNumber, Node directory){
        if(null == directory)
            return;
        if(directory.isEndOfNumber()){
            ownerNumber.put(numberBuilder, directory.getOwnerName());
        }
        for(char node : directory.getChildren().keySet())
            search(numberBuilder+ node, ownerNumber, directory.getChildren().get(node));
    }
    
    public void remove(String number){
        Node dir = this.directory;
        int index =0;
        while(index < number.length() && null != dir){
            dir = dir.getChildren().get(number.charAt(index));
            index++;
        }
        if(null != dir){
            dir.setEndOfNumber(false);
            dir.setOwnerName(null);
        }
    }
    
    public static void main(String args[]){
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.insert("8768654345", "Ashif");
        phoneDirectory.insert("8763495342", "Qureshi");
        phoneDirectory.insert("8976549007", "Lokesh");
        phoneDirectory.insert("7980065328", "Anil");
        phoneDirectory.insert("6678965436", "Rizwan");
        phoneDirectory.insert("9876532983", "Rahul");
        try {
            System.out.println(phoneDirectory.getOwner("87681654345"));
            System.out.println(phoneDirectory.getOwner("7980065328"));
            Map<String, String> searchResult = phoneDirectory.search("876945");
            for(String number: searchResult.keySet()){
                System.out.println(number + " - "+ searchResult.get(number));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    private class Node {

        private char value;
        private Node parent;
        private HashMap children;
        private boolean endOfNumber;
        private String ownerName;

        public Node(char ch) {
            this.value = ch;
            this.children = new HashMap();
            this.endOfNumber = false;
        }

        public HashMap<Character, Node> getChildren() {
            return this.children;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public char getValue() {
            return this.value;
        }

        public boolean isEndOfNumber() {
            return endOfNumber;
        }

        public void setEndOfNumber(boolean endOfNumber) {
            this.endOfNumber = endOfNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }
    }




}

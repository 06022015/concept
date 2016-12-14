package com.concept.java.trie;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/7/16
 * Time: 1:57 PM
 * To change this template use File | Settings | File Templates.
 */

public class TrieSearchRecursion {

    private Node root;

    public TrieSearchRecursion() {
        this.root = new Node((char) 0);
    }

    public void insert(String word) {
        insert(word, root);
    }

    private void insert(String word, Node node) {
        char ch = word.charAt(0);
        if (node.getChildren().containsKey(ch)) {
            node = node.getChildren().get(ch);
        } else {
            Node nextNode = new Node(ch);
            nextNode.setParent(node);
            node.getChildren().put(ch, nextNode);
            node = nextNode;
        }
        if (word.length() == 1)
            node.setEndOfWord(true);
        else
            insert(word.substring(1), node);
    }

    public String search(String word){
        StringBuilder result = new StringBuilder();
        int  endOfWordIndex = 0;
        Node crawl = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(crawl.getChildren().containsKey(ch)){
                crawl = crawl.getChildren().get(ch);
                result.append(ch);
                if(crawl.isEndOfWord())
                    endOfWordIndex = i+1;
            }else{
                break;
            }
        }
        return !crawl.isEndOfWord()?result.toString().substring(0, endOfWordIndex):result.toString();
    }
    
    
    public String searchX(String word) {
        return search(word, this.root);
    }

    private String search(String word, Node node) {
        char ch = word.charAt(0);
        String result = "";
        if (node.getChildren().containsKey(ch)) {
            node = node.getChildren().get(ch);
            result = result + ch;
            if (node.isEndOfWord()) {
            }
            if (word.length() == 1)
                return result;
            return result + search(word.substring(1));
        }
        return result;
    }


    public void remove(String word) {
        Node crawl = root;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(crawl.getChildren().containsKey(ch)){
                crawl = crawl.getChildren().get(ch);
                result.append(ch);
            }else{
                break;
            }
        }
        if(word.equals(result.toString()) && (crawl.isEndOfWord() || crawl.getChildren().isEmpty())){
            crawl.setEndOfWord(false);
            if(crawl.getChildren().isEmpty()){
                for(int i= word.length()-1;i>=0;i--){
                    if(!crawl.isEndOfWord() && crawl.getChildren().size()==0){
                        crawl = crawl.getParent();
                        System.out.println("removing char:- "+ word.charAt(i));
                        crawl.getChildren().remove(word.charAt(i));
                    }else
                        break;
                }
            }
        }
            
    }


    private class Node {

        private char value;
        private Node parent;
        private HashMap children;
        private boolean endOfWord;

        public Node(char ch) {
            this.value = ch;
            this.children = new HashMap();
            this.endOfWord = false;
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

        public boolean isEndOfWord() {
            return endOfWord;
        }

        public void setEndOfWord(boolean endOfWord) {
            this.endOfWord = endOfWord;
        }
    }



    //Test
    public static void main(String[] args) {
        TrieSearchRecursion trie = new TrieSearchRecursion();
        trie.insert("are");
        trie.insert("area");
        trie.insert("base");
        trie.insert("cat");
        trie.insert("cater");
        trie.insert("basement");


        String input = "caterer";
        System.out.print(input + ":   ");
        System.out.println(trie.search(input));

        trie.remove("are");

        System.out.print(input + ":   ");
        System.out.println(trie.search(input));


        input = "basement";
        System.out.print(input + ":   ");
        System.out.println(trie.search(input));

        input = "are";
        System.out.print(input + ":   ");
        System.out.println(trie.search(input));

        input = "areax";
        System.out.print(input + ":   ");
        System.out.println(trie.search(input));

        input = "basemexz";
        System.out.print(input + ":   ");
        System.out.println(trie.search(input));

        input = "xyz";
        System.out.print(input + ":   ");
        System.out.println(trie.search(input));
    }



}

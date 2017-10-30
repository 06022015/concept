package com.concept.java.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/11/17
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
/*
* Given a sorted dictionary of an alien language, find order of characters.
* http://www.geeksforgeeks.org/given-sorted-dictionary-find-precedence-characters/
* */

public class SortedDictionaryOfAlienLang {

    public static void findOrderCharacter(String words[], int length, int alpha){
        Graph graph = new Graph(alpha);
        for(int i=0;i< length-1;i++){
            String w1 = words[i];
            String w2 = words[i+1];
            for(int j=0; j< Math.min(w1.length(), w2.length());j++){
                if(w1.charAt(j) != w2.charAt(j)){
                    graph.addAdj(w1.charAt(j)-'a', w2.charAt(j)-'a');
                    break;
                }
            }
        }
        Stack<Integer> stack = graph.topologySort();
        while(!stack.isEmpty()){
            System.out.print(Character.toString((char)('a' + stack.pop()))+" ");
        }
    }
    
    public static void main(String args[]){
        //String words[] = {"caa","aaa","aab"};
        String words[] = {"baa", "abcd", "abca", "cab", "cad"};
        findOrderCharacter(words,5,4);
    }
    
    
    static class Graph{
        private int vertices;
        private LinkedList<Integer>[] adj;

        Graph(int vertices) {
            this.vertices = vertices;
            this.adj = new LinkedList[vertices];
            for(int i=0;i<vertices;i++){
                adj[i] = new LinkedList<Integer>();
            }
        }
        
        public void addAdj(int vertice, int edge){
             this.adj[vertice].add(edge);
        }

        public Stack<Integer> topologySort(){
            boolean visited[] = new boolean[vertices];
            Stack<Integer> stack = new Stack<Integer>();
            for(int i=0;i< vertices;i++){
                if(!visited[i]){
                     topologySort(i,visited,stack);
                }
            }
            /*while(!stack.isEmpty()){
                System.out.print(stack.pop()+"\t");
            }*/
            return stack;
        }

        public void topologySort(int vertice, boolean visited[], Stack<Integer> stack){
             visited[vertice] = true;
            Iterator<Integer> iterator = adj[vertice].iterator();
            while(iterator.hasNext()){
                Integer node = iterator.next();
                if(!visited[node]){
                    topologySort(node,visited,stack);
                }
            }
            stack.push(vertice);
        }
    }
}

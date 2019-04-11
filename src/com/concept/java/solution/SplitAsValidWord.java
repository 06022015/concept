package com.concept.java.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class SplitAsValidWord {

    private Set<String> dictionary = new HashSet<>();

    public SplitAsValidWord(){
        this.dictionary.add("f");
        this.dictionary.add("lip");
        //this.dictionary.add("flip");
        this.dictionary.add("kart");
        this.dictionary.add("flipkart");
        //this.dictionary.add("shop");
        this.dictionary.add("shopping");
        //this.dictionary.add("ping");
    }

    public List<String> splitWord(String input, int start, int n, Map<Integer,List<String>> result){
        List<String> words = new ArrayList<>();
        if(start ==n){
            words.add(" ");
            return words;
        }
        if(result.containsKey(start))
            return result.get(start);
        for(int i= start;i<n;i++){
            String word = input.substring(start,i+1);
            if(!dictionary.contains(word))
                continue;
            List<String> childWords = splitWord(input,i+1,n,result);
            for(String wd : childWords){
                String space = wd.length()==0?"":" ";
                words.add(word+space+wd);
            }
        }
        result.put(start, words);
        return words;
    }

    public List<String> splitWord1(String input, int start, int end, int n, Map<Integer,List<String>> result){
        List<String> words = new ArrayList<>();
        if(start ==n || end == n+1){
            words.add(" ");
            return words;
        }
        if(result.containsKey(start))
            return result.get(start);
        String word = input.substring(start,end);
        List<String> childWords;
        if(!dictionary.contains(word)){
            words = splitWord1(input,start,end+1,n,result);
        }else{
            childWords = splitWord1(input,end,end+1,n,result);
            for(String wd : childWords){
                String space = wd.length()==0?"":" ";
                words.add(word+space+wd);
            }
        }

        result.put(start, words);
        return words;

    }

    public static void  main(String args[]){
        SplitAsValidWord splitAsValidWord = new SplitAsValidWord();
        //String input = "flip";
        String input = "flipkartshopping";
        Map<Integer,List<String>> result = new HashMap<>();
        for (String ans : splitAsValidWord.splitWord(input,0,input.length(),result)){
        //for (String ans : splitAsValidWord.splitWord1(input,0,1,input.length(),result)){
            System.out.println(ans);
        }
    }

}

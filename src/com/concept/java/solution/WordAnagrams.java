package com.concept.java.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/8/17
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* given a large file with contents like
*    1.CAT
*    2.DOG
*    3.TAC
*    4.ACT
*    5.GOD
*    6.ODG
*    Re-arrange it such that every line has the index of all of its anagrams
*    Eg Output
*    1.CAT 1,3,4
*    2.DOG 2,5,6
*    3.TAC 1,3,4
*    4.ACT 1,3,4
*    5.GOD 2,5,6
*    6.ODG 2,5,6
* */
public class WordAnagrams {

    public void wordAnagrams(String inputs[]){
        Map<Integer, List<Integer>> wordAnagramIndex = new HashMap<Integer, List<Integer>>();
        int  hash = 0;
        for(int i=0;i< inputs.length;i++){
            hash = getHash(inputs[i]);
            List<Integer> index = wordAnagramIndex.get(hash);
            if(null==index)
                index = new ArrayList<Integer>();
            index.add(i+1);
            wordAnagramIndex.put(hash, index);
        }
        printAnagram(inputs,wordAnagramIndex);
    }
    
    public void printAnagram(String inputs[], Map<Integer, List<Integer>> wordAnagrams){
        for(int i=0;i<inputs.length;i++){
            System.out.println((i+1)+"\t"+inputs[i]+"\t"+ wordAnagrams.get(getHash(inputs[i])));
        }
    }
    
    public Integer getHash(String input){
        int hash = 0;
        for(int i=0;i<input.length();i++){
            hash+=input.charAt(i);
        }
        return hash;
    }
    
    public static void main(String args[]){
        WordAnagrams wordAnagrams = new WordAnagrams();
        String inputs[] = {"CAT","DOG","TAC","ACT","GOD","ODG"};
        wordAnagrams.wordAnagrams(inputs);
    }

}

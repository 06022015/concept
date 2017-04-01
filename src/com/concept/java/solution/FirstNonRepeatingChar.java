package com.concept.java.solution;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/1/17
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class FirstNonRepeatingChar {
    
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
        return nonRepeating.get(0);
    }
    
    
    public static void main(String args[]){
        String stream = "Ashif Qureshi";
        FirstNonRepeatingChar firstNonRepeatingChar = new FirstNonRepeatingChar();
        System.out.println("1st Method:- "+ firstNonRepeatingChar.findFirstNonRepeatingChar(stream));
        System.out.println("2nd Method:- "+ firstNonRepeatingChar.findFirstNonRepeatingChar2ndMethod(stream));
    }
}

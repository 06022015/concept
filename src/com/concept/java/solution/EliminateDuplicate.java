package com.concept.java.solution;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/13/17
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* Given a continuous stream of strings, maintain strings such that duplicate are eliminated on the fly. The interviewer wanted working code. So coded the solution during the interview and emailed it to him 10 mins after.
So if you get “Ted”, “John”, “Mark”, “Ted”, “David”, at the moment in
time, the list should contain John, Mark, David.
* */
public class EliminateDuplicate {
    
    
    public String[] eliminateDuplicate(String inputs[]){
        Map<String, Integer> resultMap = new LinkedHashMap<String, Integer>();
        Map<String, Integer> duplicates = new HashMap<String, Integer>();
        for(String input : inputs){
            if(!duplicates.containsKey(input)){
                if(resultMap.containsKey(input)){
                    resultMap.remove(input);
                    Integer count = duplicates.get(input);
                    duplicates.put(input, null != count? count+1:1);
                }else{
                    resultMap.put(input, 1);
                }
            }else{
                Integer count = duplicates.get(input);
                duplicates.put(input, null != count? count+1:1);
            }
        }
        String result[] = new String[resultMap.size()];
        int i=0;
        for(String key : resultMap.keySet()){
            result[i] = key;
            i++;
        }
        return result;
    }
    
    public static void main(String args[]){
        EliminateDuplicate eliminateDuplicate = new EliminateDuplicate();
        String inputs [] = {"Ted","John","Mark","Ted","David"} ;
        
        String result[] = eliminateDuplicate.eliminateDuplicate(inputs);
        System.out.println(Arrays.toString(result));
    }
}

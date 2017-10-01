package com.concept.java.arrays;

import com.concept.java.Base;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 9/25/17
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* Majority Element: A majority element in an array A[] of size n is an element 
* that appears more than n/2 times (and hence there is at most one such element).
* */
public class MajorityElement extends Base {
    
    public Integer majorityElement(Integer input[]){
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(int num : input){
            int count = 1;
            if(countMap.containsKey(num))
                count = count + countMap.get(num);
            if(count>= input.length/2)
                return num;
            countMap.put(num, count);
        }
        return null;
    }
    
    public static void main(String args[]){
        Integer input[] = {2,2,2,2,5,5,2,3,3};
        MajorityElement me = new MajorityElement();
        Integer result = me.majorityElement(input);
        System.out.print(null!= result?result: "NONE");
    }
}

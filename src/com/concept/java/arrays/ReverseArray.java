package com.concept.java.arrays;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/6/17
 * Time: 7:47 AM
 * To change this template use File | Settings | File Templates.
 */

/*
* Reverse the given array without using built in function.
*
* */

public class ReverseArray extends Base {
    
    public int[] reverseArray(int []input){
        int start=0, end = input.length-1;
        while(start<=end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }

    public int[] reverseRecursive(int input[], int start, int end){
        if(start<=end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            reverseRecursive(input, ++start, --end);
        }
        return input;
    }
    
    
    public static void main(String args[]){
        ReverseArray reverseArray = new ReverseArray();
        int input[] = {1,2,3,4,5,6,7,8,9};
        reverseArray.printArray(input);
        reverseArray.printArray(reverseArray.reverseArray(input));
        reverseArray.printArray(reverseArray.reverseRecursive(input, 0, input.length-1));
        reverseArray.printArray(reverseArray.reverseRecursive(input, 0, input.length-1));
    }
    
    
}

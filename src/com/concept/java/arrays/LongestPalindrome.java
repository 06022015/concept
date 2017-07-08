package com.concept.java.arrays;

import com.concept.java.Base;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/8/17
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
/*
* Given a string, find the longest substring which is palindrome.
* if the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”.
* */
public class LongestPalindrome extends Base {


    /*
    * O(n2) Time complexity
    * */
    public static String longestPalindrome(String input){
        if(null == input || "".equals(input))
            return input;
        int start =0, end =0;
        int index = 0;
        while(index < input.length()){
            int low = index;
            int high = index;
            while(high < input.length()-1 && input.charAt(low) == input.charAt(high+1)){
                high = high+1;
            }
            low = low-1;
            high = high+1;
            while(low>=0 && high< input.length() && input.charAt(low) == input.charAt(high)){
                low = low-1;
                high= high+1;
            }
            if(end-start < high - (low+1)){
                start = low+1;
                end = high;
            }
            index++;
        }
        return input.substring(start, end);
    }
    
    public static void main(String args[]){
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome("forgeeksskeegfor"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("aa"));
        System.out.println(longestPalindrome("aaaa"));
        System.out.println(longestPalindrome("aab"));
        System.out.println(longestPalindrome("aaba"));
        System.out.println(longestPalindrome("aabaa"));
        System.out.println(longestPalindrome("aabaaaabaa"));
        System.out.println(longestPalindrome("aabafabaa"));
        System.out.println(longestPalindrome("aabafabaaq"));
    }
}

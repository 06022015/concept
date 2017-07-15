package com.concept.java.solution;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/15/17
 * Time: 7:57 AM
 * To change this template use File | Settings | File Templates.
 */
/*
* You are given a phone keypad like following diagram, where each character corresponds to a digit mentioned in the same box.
*
* You are given n strings and you have to find their decimal representation. You have to print the string and corresponding decimal representation in descending order. For example, if you are given “amazon” then its corresponding decimal notation will be 262966. If more than one strings have same decimal notation then you have to print them in the order in which input is given. The given string consists of lower case alphabets only.
*
*    Test Case 1:
*    5
*    Amazon
*    Microsoft
*    Facebook
*    Aa
*    Bb
*
*    Output:
*    642767638  microsoft
*    32232665  facebook
*    262966  amazon
*    22 aa
*    22 bb
* */

public class PhoneKeypad {

    private Map<Integer, char[]> getKeyPad(){
        Map<Integer, char[]> keypad   = new HashMap<Integer, char[]>();
        keypad.put(1, new char[]{});
        keypad.put(2, new char[]{'A','B','C','a','b','c'});
        keypad.put(3, new char[]{'D','E','F','d','e','f'});
        keypad.put(4, new char[]{'G','H','I','g','h','i'});
        keypad.put(5, new char[]{'J','K','L','j','k','l'});
        keypad.put(6, new char[]{'M','N','O','m','n','o'});
        keypad.put(7, new char[]{'P','Q','R','S','p','q','r','s'});
        keypad.put(8, new char[]{'T','U','V','t','u','v'});
        keypad.put(9, new char[]{'W','X','Y','Z','w','x','y','z'});
        return keypad;
    }



    public  KeypadValue helper(String input){
        StringBuilder sb = new StringBuilder();
        Map<Integer, char[]> keypad = getKeyPad();
        for(int i = 0;i< input.length(); i++) {
            for(Integer key : keypad.keySet()){
                char[] val = keypad.get(key);
                boolean  found = false;
                for(char ch : val){
                    if(ch == input.charAt(i)){
                        sb.append(key);
                        found = true;
                        break;
                    }
                }
                if(found)
                    break;
            }
        }
        return  new KeypadValue(input, sb.toString());
    }

    /*
    * Time complexity O(n+ nlog(n))
    * */
    public void getKeypadDigit(String inputs[]){
        List<KeypadValue> result = new ArrayList<KeypadValue>();
        for(String input : inputs ){
            result.add(helper(input));
        }
        Collections.sort(result, new Comparator<KeypadValue>() {
            @Override
            public int compare(KeypadValue o1, KeypadValue o2) {
                BigInteger b1 = new BigInteger(o1.keypadValue);
                BigInteger b2 = new BigInteger(o2.keypadValue);
                return b2.compareTo(b1);
            }
        });
        System.out.println(result.toString());
    }
    public static void main(String args[]){
        PhoneKeypad phoneKeypad = new PhoneKeypad();
        String input[] = {"Microsoft","Amazon","Facebook","Aa","Bb"};
        phoneKeypad.getKeypadDigit(input);
    }

    
    class KeypadValue{
        String input;
        String keypadValue;

        KeypadValue(String input, String keypadValue) {
            this.input = input;
            this.keypadValue = keypadValue;
        }

        @Override
        public String toString() {
            return this.keypadValue+" - "+ this.input;
        }
    }

}

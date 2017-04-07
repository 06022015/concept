package com.concept.java.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/7/17
 * Time: 7:28 AM
 * To change this template use File | Settings | File Templates.
 */
/*
* Write a program to convert a integer to its form in a given language
* For example 112345 Could be one hundred twelve thousand three hundred forty five or One lac twelve thousand three hundred forty five.
*
* */


public class NumberToWord {
    
    private static String numNames[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","SixTeen","Seventeen","Eighteen","Nineteen"};
    private static String tenNames[] = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private static String specialNames[] = {"","Hundred","Thousand","Lakh","Crore","Arab"};

    
    public String convert(Long number){
        String word = "";
        int position = 0;
        while(number>0){
            int divider = position==1?10:100;
            int remainder = (int) (number%divider);
            number = number/divider;
            word = getWord(remainder)+ " "+this.specialNames[position] + " "+word;
            position = position < 5 ?position+1:1;
        }
        return word;
    }
    

    private String getWord(int remainder){
        return remainder>19?this.tenNames[remainder/10]+" "+this.numNames[remainder%10]:this.numNames[remainder];
    }
    
    
    public static void main(String args[]){
        NumberToWord numberToWord = new NumberToWord();
        Long number = 112345L;
        System.out.println(numberToWord.convert(number));
    }
}

package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/12/17
 * Time: 12:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class RemoveSpaceFromString {
    
    public static String removeSpace(String text){
        for(int i=0;i< text.length();i++){
            if(text.charAt(i)==' '){
                text = text.substring(0,i)+text.substring(i+1, text.length());
                i--;
            }
        }
        return text;
    }
    
    public static void main(String args[]){
        String text = "Ashif      Qureshi";
        System.out.println(removeSpace(text));
    }
}

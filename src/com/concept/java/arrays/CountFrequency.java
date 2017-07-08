package com.concept.java.arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 5/29/17
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class CountFrequency {

    public void printCount(int input[]){
        int n = input.length;
        for(int j=0; j< n;j++){
            input[j] = input[j]-1;
        }

        for(int j=0;j< n;j++){
            input[input[j]%n] = input[input[j]%n]+n;
        }
        
        for(int j=0; j< n;j++){
            System.out.println(j+1 + " ---> "+ input[j]/n);
        }
    }

    public void count(int input[]){
    }

    public static void main(String args[]){
       int input[] = {2,3,3,2,5};
        CountFrequency count = new CountFrequency();
        count.printCount(input);
    }
}

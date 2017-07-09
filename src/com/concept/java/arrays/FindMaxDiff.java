package com.concept.java.arrays;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 7/9/17
 * Time: 12:20 AM
 * To change this template use File | Settings | File Templates.
 */

/*
* Given an array of integer. return of maximum difference of any two numbers such that t
* he larger number has higher index than the smaller one.
*
* */
public class FindMaxDiff {

    /*
    * O(n) Time complexity
    * O(1) Space complexity
    * */
    public static int getMaxDiffIndex(int input[]) {
        int maxDiff = input[1]-input[0];
        int minElement = 0;
        for (int i = 0; i < input.length; i++) {
            if(maxDiff < input[i]-input[minElement]){
                maxDiff = input[i] - input[minElement];
            }
            if(input[i]< input[minElement]){
                minElement = i;
            }
        }
        return maxDiff;
    }


    /*
    * O(n2) Time complexity
    * O(1) Space complexity
    * */
    public static int getMaDiffBruitForce(int input[]){
        int maxDiff = input[1]- input[0];
        for(int i=0; i< input.length; i++){
            for(int j=i+1; j< input.length;j++){
                if(maxDiff< input[j]- input[i])
                    maxDiff = input[j] - input[i];
            }
        }
        return maxDiff;
    }

    public static void main(String args[]) {
        int input[] = {2,1, 3, 10, 0, 4, 12, 1};
        System.out.println("Efficient :- "+getMaxDiffIndex(input));
        System.out.println("Bruit force :- "+getMaDiffBruitForce(input));
    }

}

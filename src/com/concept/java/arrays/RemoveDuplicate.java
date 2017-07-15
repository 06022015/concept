package com.concept.java.arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 3/18/17
 * Time: 12:16 AM
 * To change this template use File | Settings | File Templates.
 */
//Remove duplicate from sorted array
public class RemoveDuplicate {


    public static int[] removeDuplicates(int[] input){
        int j = 0;
        int i = 1;
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }
        }
        int[] output = new int[j+1];
        System.arraycopy(input, 0, output, 0, output.length);

        return output;
    }

    public static void main(String args[]){
        int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
        int[] output = removeDuplicates(input1);
        for(int i:output){
            System.out.print(i+" ");
        }
    }
}

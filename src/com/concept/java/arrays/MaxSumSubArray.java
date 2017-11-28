package com.concept.java.arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/31/17
 * Time: 7:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxSumSubArray {
    
    public static int findMaxSumSubArray(int input[]){
        int max =Math.max(input[0],0);
        int sum =Math.max(input[0],0);
        int n = input.length;
        for(int i=1;i< n;i++){
            if(input[i] > input[i-1]){
               sum = sum+Math.max(input[i],0);
            }else if(input[i]< input[i-1]){
                    sum = sum + Math.max(input[i],0);
                if( i< n-1 && input[i] < input[i+1]){
                    max = Math.max(sum, max);
                    sum = Math.max(input[i],0);
                }
            }else{
                max = Math.max(max,sum);
                sum = input[i];
            }
        }
        return Math.max(max,sum);
    }
    
    public static void main(String args[]){
        int input[]  = {5,3,9,2,7,6,4};
        System.out.println(findMaxSumSubArray(input));
        int input1[]  = {2,3,5,1,8,7};
        System.out.println(findMaxSumSubArray(input1));
        int input2[]  =  {1, 2, 3, 4, 5};
        System.out.println(findMaxSumSubArray(input2));
        int input3[]  =  {5, 4, 3, 2, 1};
        System.out.println(findMaxSumSubArray(input3));
        int input4[]  =  {5, 5, 5, 5};
        System.out.println(findMaxSumSubArray(input4));
        int input5[] = {-1, 0, 1, 2, 3, 1, 0, -1, -10};
        System.out.println(findMaxSumSubArray(input5));
        int input6[] = {-1, 0, 1, 2, 0, -1, -2, 0, 1, 3};
        System.out.println(findMaxSumSubArray(input6));
        int input7[] = {3, 2, 2, 4};
        System.out.println(findMaxSumSubArray(input7));
        int input8[] = new int[100000];
        int sum = 0;
        for(int i=1;i<=100000;i++){
            input8[i-1] = i;
            sum = sum +i;
        }
        System.out.println(findMaxSumSubArray(input8));
        System.out.println(sum);
    }
    
}

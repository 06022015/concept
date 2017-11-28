package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 10/31/17
 * Time: 9:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class NumberSeries {



    public static int getMissingNumber(int a[]){
        int x1=a[0];
        int x2=1;
        for(int i=1;i< a.length;i++)
            x1 = x1^a[i];

        for(int i=2;i<= a.length+1;i++)
            x2 = x2^i;
        return (x1^x2);
    }
    
    public static void main(String args[]){
        //int input[] = {3,5,15,23};
        int input[] = {3,5,7,9,11,13,17};
        System.out.println(getMissingNumber(input));
    }
}

package com.concept.java.arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 8:10 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* Find the maximum element in an array which is first increasing and then decreasing
* http://www.geeksforgeeks.org/find-the-maximum-element-in-an-array-which-is-first-increasing-and-then-decreasing/
*
*
*
* */

public class TurningPointOfSeries {
    

    /*
    * Time complexity O(n).
    * */
    public Integer turningPoint(int inputs[]){
        if(null == inputs || inputs.length==0)
            return null;
        for(int i =0; i< inputs.length;i++){
            if(i>0 && inputs[i]<inputs[i-1]){
                return inputs[i-1];
            }
        }
        return inputs[inputs.length-1];
    }

    /*
    * Time Complexity O(logn).
    * */
    public Integer turningPoint(int inputs[], int start, int end){
        if(null == inputs || inputs.length==0)
            return null;
        if(inputs.length==1)
            return inputs[start];
        if( inputs[start]> inputs[start+1])
            return inputs[start];
        if(inputs[end]> inputs[end-1])
            return inputs[end];
        int mid = start+(end-start)/2;
        if(inputs[mid]>inputs[mid-1]){
            start = mid;
        }else{
            end = mid;
        }
        return  turningPoint(inputs, start, end);
    }

    public static void main(String args[]){
        TurningPointOfSeries turningPointOfSeries = new TurningPointOfSeries();
        int input1[]= {2,3,4,5,6,7,8,6,4,3,2};
        System.out.println("Turning Point 1:- "+ turningPointOfSeries.turningPoint(input1));
        int input2[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1};
        System.out.println("Turning Point 2:- "+ turningPointOfSeries.turningPoint(input2));
        int input3[] = {1, 3, 50, 10, 9, 7, 6};
        System.out.println("Turning Point 3:- "+ turningPointOfSeries.turningPoint(input3));
        int input4[] = {10, 20, 30, 40, 50};
        System.out.println("Turning Point 4:- "+ turningPointOfSeries.turningPoint(input4));
        int input5[] = {120, 100, 80, 20, 0};
        System.out.println("Turning Point 5:- "+ turningPointOfSeries.turningPoint(input5));
        int input6[] = {120};
        System.out.println("Turning Point 5:- "+ turningPointOfSeries.turningPoint(input6));
        int input7[] = {};
        System.out.println("Turning Point 5:- "+ turningPointOfSeries.turningPoint(input7));

        System.out.println("\n\n");

        System.out.println("Turning Point 1:- "+ turningPointOfSeries.turningPoint(input1,0, input1.length-1));
        System.out.println("Turning Point 2:- "+ turningPointOfSeries.turningPoint(input2, 0, input2.length-1));
        System.out.println("Turning Point 3:- "+ turningPointOfSeries.turningPoint(input3, 0, input3.length-1));
        System.out.println("Turning Point 4:- "+ turningPointOfSeries.turningPoint(input4, 0, input4.length-1));
        System.out.println("Turning Point 5:- "+ turningPointOfSeries.turningPoint(input5, 0, input5.length-1));
        System.out.println("Turning Point 5:- "+ turningPointOfSeries.turningPoint(input6, 0, input5.length-1));
        System.out.println("Turning Point 5:- "+ turningPointOfSeries.turningPoint(input7, 0, input5.length-1));
    }
    
}

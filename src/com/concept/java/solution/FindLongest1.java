package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 4/2/17
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */

/*
* Find Index of 0 to be replaced with 1 to get longest continuous sequence of 1s in a binary array
*
*
* Input:
   arr[] =  {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1}
Output:
  Index 9
Assuming array index starts from 0, replacing 0 with 1 at index 9 causes
the maximum continuous sequence of 1s.

Input:
   arr[] =  {1, 1, 1, 1, 0}
Output:
  Index 4

  http://www.geeksforgeeks.org/find-index-0-replaced-1-get-longest-continuous-sequence-1s-binary-array/
*
* */
public class FindLongest1 {
    
    public int maxOneIndex(int input[]){
        int prevZero=-1, prevPrevZero=-1, len = input.length, maxCount=0, maxIndex=0;
        for(int curr = 0; curr< len; curr++){
            if(input[curr]==0){
                if(curr-prevPrevZero>maxCount){
                    maxCount = curr-prevPrevZero;
                   maxIndex = prevZero;
                }
                prevPrevZero = prevZero;
                prevZero =curr;
            }
        }
        if(len  -prevPrevZero>maxCount){
            maxIndex = prevZero;
        }
        return maxIndex;
    }
    
    public static void main(String args[]){
        FindLongest1 findLongest1 = new FindLongest1();
        ////int input[] = {0,1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1};
        int input[] = {0};
        System.out.println("The index of zero to replaced "+findLongest1.maxOneIndex(input)+" for longest one sequence");
    }
}

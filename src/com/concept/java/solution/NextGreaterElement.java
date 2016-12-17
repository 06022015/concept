package com.concept.java.solution;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */

/*
*   Next Greater Element
*   Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.
* */
public class NextGreaterElement {

    public int[] getNGE(int input[]) {
        int result[] = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = -1;
            for (int j = i + 1; j < input.length && input[i] < input[j]; j++) {
                result[i] = input[j];
            }
        }
        return result;
    }

    public void printArray(int input[]) {
        for (int anInput : input)
            System.out.print(anInput + "  ");
        System.out.println();
    }

    public static void main(String args[]) {
        NextGreaterElement nge = new NextGreaterElement();
        System.out.println("Test Case 1");
        int input1[] = {4, 5, 2, 25};
        nge.printArray(nge.getNGE(input1));

        System.out.println("Test Case 2");
        int input2[] = {13, 7, 6, 12};
        nge.printArray(nge.getNGE(input2));

        System.out.println("Test Case 3");
        int input3[] = {11, 13, 21, 3};
        nge.printArray(nge.getNGE(input3));
    }
}

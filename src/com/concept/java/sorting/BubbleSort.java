package com.concept.java.sorting;

/**
 * Created by IntelliJ IDEA.
 * User: ashqures
 * Date: 12/17/16
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class BubbleSort extends Sort {

    public int[] sort(int input[]) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    swap(input, i, j);
                }
            }
        }
        return input;
    }
}
